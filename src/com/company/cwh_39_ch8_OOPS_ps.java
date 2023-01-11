package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int breadth;

    public int area1(){
        return length*breadth;
    }
    public int perimeter1(){
        return 2*(length + breadth);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

class Circle{
    int radius;

    public double area2(){
        return 3.14*radius*radius;
    }
    public float circumference(){
        return 2*3.14f*radius;
    }
}

public class cwh_39_ch8_OOPS_ps {
    public static void main(String[] args) {
        /*
        //Problem 1
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        //Problem 2
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();
         */

        //Problem 3
        /*
        Square sq = new Square();
        sq.side = 6;
        System.out.println("The area of square is " + sq.area());
        System.out.println("The perimeter of square is " + sq.perimeter());


        //Problem 4
        Rectangle rec = new Rectangle();
        rec.length = 5;
        rec.breadth = 7;
        System.out.println( " The area of rectangle is " + rec.area1());
        System.out.println("The perimeter of rectangle is "+ rec.perimeter1());

         */


        //Problem 5
         Tommy player1 = new Tommy();
         player1.hit();
         player1.run();
         player1.fire();

         //Problem 6
        Circle cir = new Circle();
        cir.radius = 5;
        System.out.println("The area of the circle is "+ cir.area2());
        System.out.println("The circumference of the circle is "+ cir.circumference());

    }
}
