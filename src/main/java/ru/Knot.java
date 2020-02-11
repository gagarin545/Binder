package ru;

import java.util.ArrayList;
import java.util.Iterator;

public class Knot extends KnotComponent {
    private double consumed;
    private double distributed;
    private String name;
    private ArrayList knots = new ArrayList();

    Knot(double consumed, String name) {
        this.consumed = consumed;
        this.name = name;
    }
    public void add(KnotComponent knotComponent) { knots.add(knotComponent);    }
    public void remove(KnotComponent knotComponent) { knots.remove(knotComponent);  }
    public KnotComponent getChild(int i) {  return (KnotComponent)knots.get(i); }
    public double getConsumed() {        return consumed;    }
    public void setConsumed(double consumed) {        this.consumed = consumed;    }
    public double getDistributed() {        return distributed;    }
    public void setDistributed(double distributed) {        this.distributed = distributed;    }
    public String getName() {        return name;    }
    public void setName(String name) {        this.name = name;    }
    public void difference() {
        double delta =  consumed - knots.stream().mapToDouble(x->  ((KnotComponent) x).getConsumed()).reduce(Double::sum).getAsDouble();
        System.out.println("Родитель " + name + " имеет разницу " + delta );
        knots.stream()
                .filter(x-> ((KnotComponent) x).getConsumed() > 0)
                .peek(x-> ((KnotComponent) x).setDistributed((((KnotComponent) x).getConsumed()/
                        knots.stream().mapToDouble(a->  ((KnotComponent) a).getConsumed()).filter(a-> a > 0 ).reduce(Double::sum).getAsDouble())
                        * delta))
                .forEach(x-> System.out.println("Узел " +((KnotComponent) x).getName() + " распределенная нагрузка " + ((KnotComponent) x).getDistributed()));

    }
    public void print() {
        Iterator iterator = knots.iterator();
        while(iterator.hasNext()) {
            KnotComponent knot = (KnotComponent) iterator.next();
            knot.difference();
            knot.print();
        }
    }
}
