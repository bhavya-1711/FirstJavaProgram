package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "meraNaamBhavya";
    }

    public MyMainEmployee( String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee( String myName){
        id = 18;
        name = myName;
    }

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

public class cwh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee();

       // harry.setName("CodeWithHarry");
       // harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());

    }
}
