package Zajecia20170203.MyList;

import java.util.ArrayList;

public class ListyDemo {
    public static void main(String[] args) {
        ArrayList<String>cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Skoda");

//        cars.remove(0);
//        for (int i = 0; i <cars.size() ; i++) {
//            System.out.println(cars.get(i));
//        }
        for (String car:cars) {
            System.out.println(car);
        }
    }
}
