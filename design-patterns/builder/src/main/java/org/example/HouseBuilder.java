package org.example;/*
 * @Package org.example
 * @author khanhnt
 * @date 27-Jun-24 10:32 PM
 */

public interface HouseBuilder {
  void buildFoundation ();

  void buildWalls ();

  void buildRoof ();

  void buildInterior ();

  House build ();
}
