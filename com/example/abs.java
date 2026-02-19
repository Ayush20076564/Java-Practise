package com.example;

abstract class animal {
    abstract void walk();
    animal() {
        System.out.println("animal is created- constructor");
    }
    public void eat() {
        System.out.println("animal is eating");
    }

class horse extends animal {
    public void walk() {
        System.out.println("horse is walking");
    }
}
class chicken extends animal {
    public void walk() {
        System.out.println("chicken is walking");
    }
}
public class abs {
    public static void main(String[] args) {
        horse h1 = new horse();
        h1.walk();

        chicken c1 = new chicken();
        c1.walk();
        h1.eat();
        c1.eat();
    }
    
}
