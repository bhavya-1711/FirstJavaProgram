package com.company;

public class cwh_31_ch7_methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        c = logic(a,b);
        // Method invocation using Object creation   // if we remove 'static' from the above defined method
        // cwh_31_methods obj= new cwh_31_methods();
        // c = obj.logic(a ,b);
        int a1=2;
        int b1=1;
        int c1 = logic(a1, b1); // calling the method
        System.out.println(c);
        System.out.println(c1);

    }
}
