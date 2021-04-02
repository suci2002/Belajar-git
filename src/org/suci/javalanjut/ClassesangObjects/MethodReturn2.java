package org.suci.javalanjut.ClassesangObjects;

public class MethodReturn2 {
    public static void main(String[ ] args) {
        int x = 10;
        int y = myFunc(x);
        System.out.println(y);
    }
    public static int myFunc(int x) {
        return x*3;
    }
}
