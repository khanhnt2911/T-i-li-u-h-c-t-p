package org.example;

public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreateCreatorA();
        Product prodA = creator.factoryMethod();
        prodA.doSomething();
    }
}