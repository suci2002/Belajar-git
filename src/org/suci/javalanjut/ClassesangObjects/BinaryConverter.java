package org.suci.javalanjut.ClassesangObjects;

import java.util.Scanner;

public class BinaryConverter {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            String binary = "";

            while(x > 0) {
                binary = (x%2)+binary;
                x /= 2;
            }
            System.out.println(binary);
        }
    }
