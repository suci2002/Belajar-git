package org.suci.javalanjut.Exceptions;
import java.util.HashMap;

public class MyChannel {
    public static void main(String[] args) {
        HashMap<String, Integer > points = new
                HashMap<String, Integer > ();
        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Bob", 733);

        System.out.println(points.get("Dave"));
    }
}

