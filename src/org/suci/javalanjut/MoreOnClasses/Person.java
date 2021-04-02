package org.suci.javalanjut.MoreOnClasses;

public class Person {
    public static void main(String[] args) {
    class Animal {
        protected int legs;
        public void eat() {
            System.out.println("Animal eats");
        }
    }
    class Dog extends Animal {
        Dog() {
            legs = 4;
        }
    }
        Dog d = new Dog();
        d.eat();
    }
}