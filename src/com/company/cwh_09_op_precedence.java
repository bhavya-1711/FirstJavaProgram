package com.company;

public class cwh_09_op_precedence {
    public static void main(String[] args) {
        // PRECEDENCE AND ASSOCIATIVITY
     //   int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /.They are then evaluated on basis
        of left to right associativity
             = 30-34/2
             = 30-17
             = 13
         */
      //  int b = 60/5-34*2;
        /*
             = 12-34*2
             = 12-68
             = -56
         */
     //   System.out.println(a);
     //   System.out.println(b);

        // Quick Quiz 1
     //   int x= 6;
     //   int y= 1;
     //   int k= x*y/2;

        // Quick quiz 2
        int a=1;
        int b=4;
        int c=2;
        int k= (b*b - 4*a*c)/(2*a);
        System.out.println(k);

    }
}
