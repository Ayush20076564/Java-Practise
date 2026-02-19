package com.example;
interface animals {
    void eat();
    void walk();
}

interface herbivore {
    void graze();
}

class horse implements animals, herbivore {
    public void eat() {
        System.out.println("horse is eating");
    }
    public void walk() {
        System.out.println("horse is walking");
    }
    public void graze() {
        System.out.println("horse is grazing");
    }
}
public class inter {
    public static void main(String[] args) {
        horse h1 = new horse();
        h1.eat();
        h1.walk();
    }
}
