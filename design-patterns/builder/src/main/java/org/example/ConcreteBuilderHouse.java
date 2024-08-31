package org.example;/*
 * @Package org.example
 * @author khanhnt
 * @date 27-Jun-24 10:34 PM
 */

public class ConcreteBuilderHouse implements HouseBuilder {
  private final House house = new House();

  @Override
  public void buildFoundation () {
    house.setFoundation("Foundation");
  }

  @Override
  public void buildWalls () {
    house.setWalls("Walls");
  }

  @Override
  public void buildRoof () {
    house.setRoof("Roof");
  }

  @Override
  public void buildInterior () {
    house.setInterior("Interior");
  }

  @Override
  public House build () {
    return house;
  }

  @Override
  public String toString() {
    return house.toString();
  }
}
