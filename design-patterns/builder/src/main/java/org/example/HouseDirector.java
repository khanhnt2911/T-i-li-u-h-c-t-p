package org.example;/*
 * @Package org.example
 * @author khanhnt
 * @date 27-Jun-24 10:42 PM
 */

public class HouseDirector {
  private final HouseBuilder houseBuilder;

  public HouseDirector(HouseBuilder houseBuilder) {
    this.houseBuilder = houseBuilder;
  }

  public void buildHouse() {
    houseBuilder.buildFoundation();
    houseBuilder.buildWalls();
    houseBuilder.buildRoof();
    houseBuilder.buildInterior();
  }
}
