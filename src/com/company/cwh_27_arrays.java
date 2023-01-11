package com.company;

public class cwh_27_arrays {
    public static void main(String[] args) {
        /*
        float [] marks = {99.5f ,68.5f ,57.5f,46.5f ,27 };
        String [] students = {"Bhavya", "saharsh","harshita","sneha"};
        System.out.println(students.length);
        System.out.println(students[2]);
         */

        int [] marks = {99,68,57,46,27};
       // System.out.println(marks.length);

        // Displaying the arrays (naive method)
     /*   System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
      */

        // displaying the array ( for loop)
        System.out.println("printing using for loop");
        for(int i=0; i< marks.length;i++){
            System.out.println(marks[i]);
        }


        // Quick quiz- displaying the array in reverse order ( for loop)
        System.out.println("printing using for loop in reverse order");
        for(int i=marks.length-1; i>=0;i--){
            System.out.println(marks[i]);
        }

        // displaying the array (for-each loop)
        System.out.println("Printing using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }

    }
}
