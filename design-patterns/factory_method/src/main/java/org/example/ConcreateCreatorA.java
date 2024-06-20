package org.example;

public class ConcreateCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ProductA();
    }
}
