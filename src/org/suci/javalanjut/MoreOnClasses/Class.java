package org.suci.javalanjut.MoreOnClasses;


    enum Color  {
        RED, BLUE, GREEN;
    }
public class Class {
    public static void main(String[] args) {
            Color color = Color.RED;
            switch(color) {
                case BLUE:
                    System.out.println("1");
                    break;
                case GREEN:
                    System.out.println("2");
                    break;
                default:
                    System.out.println("0");
                    break;
            }
        }
    }
