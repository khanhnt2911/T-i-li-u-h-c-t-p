package org.example;

public class Beef implements IProtein{
    @Override
    public void prepare() {
        System.out.println("Prepare Beef");
    }
    @Override
    public void eat() {
        System.out.println("eat Beef");
    }
    @Override
    public void clean() {
        System.out.println("clean Beef");
    }
}
