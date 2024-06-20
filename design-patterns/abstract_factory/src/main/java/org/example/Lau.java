package org.example;

public class Lau implements IMenu{

  @Override
  public Beef createBeef() {
    return new Beef();
  }

    @Override
    public Peanuts createPeanuts() {
        return new Peanuts();
    }

    @Override
    public RiceNoodle createRiceNoodle() {
        return new RiceNoodle();
    }
}
