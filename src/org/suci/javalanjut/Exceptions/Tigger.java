package org.suci.javalanjut.Exceptions;

import java.util.Iterator;
import java.util.ArrayList;

public class Tigger {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        int x = 0;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            x += it.next();
        }
        System.out.println(x);
    }
}
