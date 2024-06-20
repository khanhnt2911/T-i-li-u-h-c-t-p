package org.example;

public class RiceNoodle implements ICarb {
  @Override
  public void prepare() {
    System.out.println("Prepare RiceNoodle");
  }
  @Override
  public void eat() {
    System.out.println("eat RiceNoodle");
  }
  @Override
  public void clean() {
    System.out.println("clean RiceNoodle");
  }
}
