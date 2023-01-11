package com.company;

public class cwh_33_Var_args {
    static int sum( int x , int ...arr){ // x is compulsory argument - ye to chaiye hi chaiye
        // ... these three dots converts to array
        //Available as int [] arr
        int result = x;
        for(int a: arr){
            result += a;
        }
        return result;

    }
    public static void main(String[] args) {
        //System.out.println("The sum of Nothing is " + sum());
        System.out.println("The sum of 4 and 5 is " + sum(4,5));
        System.out.println("The sum of 4, 3 and 5 is " + sum(4,3,5));
        System.out.println("The sum of 2,4,3 and 5 is " + sum(2,4,3,5));


    }
}
