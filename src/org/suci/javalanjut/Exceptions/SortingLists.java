package org.suci.javalanjut.Exceptions;

import java.util.ArrayList;
import java.util.Collections;

public class SortingLists {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String> ();
        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");

        Collections.sort(animals);
        System.out.println("animals");
    }
}
