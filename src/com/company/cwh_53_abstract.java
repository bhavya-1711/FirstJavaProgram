package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hu ");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class cwh_53_abstract {
    public static void main(String[] args) {
        //Parent2 ph= new Parent2(); -- error
        Child2 ch=new Child2();
        //Child3 ch3= new Child3();  -- error

    }
}
