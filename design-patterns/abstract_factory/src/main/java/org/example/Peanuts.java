package org.example;

public class Peanuts implements IFat {
    @Override
    public void prepare() {
        System.out.println("Prepare Peanuts");
    }
    @Override
    public void eat() {
        System.out.println("eat Peanuts");
    }
    @Override
    public void clean() {
        System.out.println("clean Peanuts");
    }
}
