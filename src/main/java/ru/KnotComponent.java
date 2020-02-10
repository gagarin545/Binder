package ru;

public abstract class KnotComponent {
    public void add (KnotComponent knotComponent) {        throw  new UnsupportedOperationException();    }
    public void remove (KnotComponent knotComponent) {
        throw  new UnsupportedOperationException();
    }
    public KnotComponent getChild(int i) {
        throw  new UnsupportedOperationException();
    }

    public String getName () {
        throw  new UnsupportedOperationException();
    }
    public double getConsumed () {
        throw  new UnsupportedOperationException();
    }
    public double getDistributed() {
        throw  new UnsupportedOperationException();
    }
    public void setDistributed(double distributed) { throw new UnsupportedOperationException();    }
    public void setName(String name) { throw new UnsupportedOperationException();    }

    public void difference() {   throw  new UnsupportedOperationException();     }
    public void print() { throw  new UnsupportedOperationException();   }
}
