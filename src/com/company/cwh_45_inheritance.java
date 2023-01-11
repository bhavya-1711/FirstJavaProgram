package com.company;

import java.sql.SQLOutput;

class Base{
      int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        System.out.println("I am in derived and setting y now");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Animal{
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        System.out.println("I am in animal class and this is the number of species of animals ");
        this.a = a;
    }
}

class Dogs extends Animal{
    int dog;

    public int getDog() {
        return dog;
    }

    public void setDog(int dog) {
        System.out.println("I am in dogs class and dog is barking \n BHAUUU BHAUUU BHAUUU!!!");
        this.dog = dog;
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {
        //Creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        //Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());

        //creating an object of animal class
        Animal ani= new Animal();
        ani.setA(50);
        System.out.println(ani.getA());

        //creating an object of dogs class
        Dogs bark = new Dogs();
        bark.setDog(6);
        System.out.println(bark.getDog());

    }
}
