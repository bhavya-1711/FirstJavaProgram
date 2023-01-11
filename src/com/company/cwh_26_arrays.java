package com.company;

public class cwh_26_arrays {
    public static void main(String[] args) {
        /*classroom of 500 students- you have to store marks of these 500 students
        You have two options:-
        1. Create 500 variables
        2. use Arrays (recommended)
         */

        // there are three main ways to create an array in java
        // 1. Declaration and memory allocation
        // int [] marks = new int[];

        // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[];
         // Initialization
//        marks[0] = 100;
//        marks[1] = 90;
//        marks[2] = 80;
//        marks[3] = 60;
//        marks[4] = 50;
        // marks[5] = 48; - throws an error

        // 3. Declaration , memory allocation and initializing together
        int [] marks = {99,68,57,46,27};
        System.out.println(marks[4]);


    }
}
