package org.suci.javalanjut.Exceptions;

public class Baru {
    public static void main(String[] args) {
        int x = 12;
        int y = 0;
        try {
        int z = x / y;
            System.out.println(z);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}