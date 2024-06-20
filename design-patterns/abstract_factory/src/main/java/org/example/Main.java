package org.example;

public class Main {
    public static void main(String[] args) {
        // khởi tạo interface cho từng thành phần món ăn: protein, carbohydrate, fat (đều có công việc là chuẩn bị)
        // triển khai cụ cho từng loại các phần môn: protein, carbohydrate, fat
        // tạo ra một menu gồm các món ăn theo 3 thành phần trên
        // Tạo ra các loại đồ ăn: lẩu, nướng, ...

       IMenu menu = new Lau();
       IProtein protein = menu.createBeef();
       ICarb carb = menu.createRiceNoodle();
       IFat fat = menu.createPeanuts();
       protein.prepare();
       protein.eat();
       protein.clean();

       carb.prepare();
       carb.eat();
       carb.clean();

       fat.prepare();
       fat.eat();
       fat.clean();
    }
}