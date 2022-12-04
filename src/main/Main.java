package main;

import java.util.Date;
import models.Car;

public class Main {
    public static void main(String[] args) {
        // instantiate car object with new method (Constuctor)
        Car myCar = new Car("Date"); // included required input in constructor
        

        myCar.setColour("blue");
        myCar.setMake("honda");

        System.out.println(myCar.getRegistrationDate());

        myCar.horn();

        System.out.printf("colour: %s \nmake: %s \nregistration: %s\n", 
            myCar.getColour(), myCar.getMake(), myCar.getRegistrationDate());
    }
}
