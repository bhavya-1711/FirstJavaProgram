package com.company;

public class cwh_10_resulting_data_type {
    public static void main(String[] args) {
      /*  byte x= 5;
        short y= 6;
        int z=7;
        float a= 6.54f + x;
        System.out.println(a);
                                */

        // Increment and Decrement operators
        int i=56;
        //int b= i++;  //first b is assigned i (56) then i is incremented
        int j=67;
        //int c=++j; // first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++j);
        System.out.println(j);

        int y = 7;
        System.out.println(++y*8);

        char ch = 'a';
        System.out.println(++ch);
    }
}
