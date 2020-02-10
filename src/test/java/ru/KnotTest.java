package ru;

import org.junit.Test;

public class KnotTest {
    @Test
    public void Test() {
        KnotComponent p1 = new Knot(1000,  "1");
        p1.add( new KnotItem(300, "1.1"));
        p1.add( new Knot(200, "1.2"));
        p1.add( new KnotItem(-70, "1.3"));
        p1.add( new Knot(300, "1.4"));
        p1.getChild(1).add( new KnotItem(150,  "1.2.1"));
        p1.getChild(1).add( new KnotItem(50,  "1.2.2"));
        p1.getChild(3).add( new KnotItem(33, "1.4.2"));
        p1.print();
    }
}
