package org.suci.javalanjut.Array;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        //your code goes here
        String rev = "";
        for (char i : arr)
        rev = i + rev;
        System.out.println(rev);
    }
}
