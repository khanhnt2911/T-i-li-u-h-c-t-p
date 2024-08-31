package org.example;

/*
 * @Package org.example
 * @author khanhnt
 * @date 27-Jun-24 10:27 PM
 */public class Main {
  public static void main (String[] args) {
//    Tao mot doi tuong concrete house builder
    HouseBuilder houseBuilder = new ConcreteBuilderHouse();
//    Tao mot doi tuong director va ket noi voi builder
    HouseDirector director = new HouseDirector(houseBuilder);
//    xay dung nha
    director.buildHouse();
//    Lay ket qua
    House house = houseBuilder.build();
//    Hien thi thong tin nha
    house.showHouse();
  }
}