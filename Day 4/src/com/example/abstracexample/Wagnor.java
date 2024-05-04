package com.example.abstracexample;

abstract class Car {

    public abstract void drive();

    public void getSafety()
    {
        System.out.println("Car safety features");
    }
}

public class Wagnor extends Car {
    @Override
    public void drive() {
        System.out.println("drive method of wagnor");
    }
}
