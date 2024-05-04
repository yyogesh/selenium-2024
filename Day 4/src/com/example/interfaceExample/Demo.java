package com.example.interfaceExample;

@FunctionalInterface
interface System1
{
    void start();
}

interface Machine extends System1
{
    void start();
}

interface Computer
{
    void code();
}

class Laptop implements Computer, Machine {

    @Override
    public void code() {
        System.out.println("code, compile, run");
    }

    @Override
    public void start() {
        System.out.println("started");
    }
}

class Desktop implements Computer {

    @Override
    public void code() {
        System.out.println("code, compile, faster");
    }
}

public class Demo {
    public static void main(String[] args) {
        Laptop hp = new Laptop();
        hp.code();

        Machine m1 = new Laptop();

    }
}
