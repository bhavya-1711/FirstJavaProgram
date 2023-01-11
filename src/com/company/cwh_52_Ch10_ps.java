package com.company;

class Circle2{
    public int radius;
    Circle2(){
        System.out.println("I am non param of Circle");
    }
    Circle2(int r){
        this.radius = r;
        System.out.println("I am Circle parametrized constructor");
    }
    public double area(){
         return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle2{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        this.height=h;
        System.out.println("I am Cylinder parametrized constructor");
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

class Rectangle2{
    public int length;
    public int breadth;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    Rectangle2(){
        System.out.println("i am rectangle");
    }

    Rectangle2(int l,int b){
        System.out.println("I am Rectangle parameterized constructor");
        this.length=l;
        this.breadth=b;
    }
    public int area1(){
        return this.length*this.breadth;
    }
}
class Cuboid extends Rectangle2{
    public int height1;

    public int getHeight1() {
        return height1;
    }

    public void setHeight1(int height1) {
        this.height1 = height1;
    }

    Cuboid(int l, int b, int h){
        super(l,b);
        this.height1=h;
        System.out.println("I am cuboid");
    }
    public int volume1(){
        return this.height1*this.breadth*this.length;
    }
}

public class cwh_52_Ch10_ps {
    public static void main(String[] args) {
        //Problem 1
        //Circle2 obj = new Circle2(6);
       //Cylinder1 objC = new Cylinder1(6,4);
      // Rectangle2 rec = new Rectangle2(4,5);
       Cuboid obj1= new Cuboid(4,5,6);
       obj1.setHeight1(6);
       obj1.setBreadth(5);
       obj1.setLength(4);
        System.out.println("The volume of cuboid is: " + obj1.volume1());
    }
}
