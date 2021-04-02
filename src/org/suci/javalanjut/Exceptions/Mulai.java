package org.suci.javalanjut.Exceptions;
import java.util.Formatter;
public class Mulai {
    public static void main(String[] args) {
        try {
            Formatter f = new Formatter("C:\\sololearn\\test.txt");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
