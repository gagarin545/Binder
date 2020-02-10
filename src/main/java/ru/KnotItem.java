package ru;

public class KnotItem extends KnotComponent{
    private double consumed;
    private double distributed;
    private String name;

    public KnotItem(double consumed,  String name) {
        this.consumed = consumed;
        this.name = name;
    }
    public double getConsumed() {        return consumed;    }
    public void setConsumed(double consumed) {        this.consumed = consumed;    }
    public double getDistributed() {        return distributed;    }
    public void setDistributed(double distributed) {        this.distributed = distributed;    }
    public String getName() {        return name;    }
    public void setName(String name) {        this.name = name;    }
    public void print() {
        System.out.println("Узел " + getName() + " распределенная нагрузка " + getConsumed() + "|" + getDistributed());
    }
}
