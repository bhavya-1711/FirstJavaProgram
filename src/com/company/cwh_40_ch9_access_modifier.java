package com.company;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}


class Circle1{
        private float radius,area,circumference;

         void setRadius(float r){
            radius = r;
        }
         void setArea(float a){
            if(a == 22f*radius*radius/7f){
                area = a;
            }
            else{
                System.out.println("WARNING : Wrong area as per radius.");
            }
        }
         void setCircumference(float c){
            if(c== 22f*2f*radius/7f){
                circumference= c;
            }
            else{
                System.out.println("WARNING : Wrong circumference as per radius");
            }
        }
        float getRadius(){
            return radius;
        }
         float getArea(){
            return area;
        }
         float getCircumference(){
            return circumference;
        }
}


public class cwh_40_ch9_access_modifier {
    public static void main(String[] args) {
       /*
        MyEmployee harry = new MyEmployee();
        //harry.id = 45; --> throws an error due to private access modifier
        //harry.name ="codeWithHarry";

        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
        */

        Circle1 cr = new Circle1();
        cr.setRadius(7f);
        cr.setArea(154f);
        cr.setCircumference(44f);
        System.out.println("Area is " + cr.getArea() + " sq.units") ;
        System.out.println("Circumference is " + cr.getCircumference() + " units") ;
    }
}
