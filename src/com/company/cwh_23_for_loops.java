package com.company;
import java.util.Scanner;

public class cwh_23_for_loops {
    public static void main(String[] args) {
//        for(int i =1; i<=10 ; i++){
//            System.out.println(i);
//        }
        // 2i= Even numbers = 0 ,2,4,6,8
        // 2i+1= Odd number = 1,3,5,7,9


//        System.out.println("how many consecutive odd numbers you want ");
//      Scanner sc= new Scanner(System.in);
//      int n= sc.nextInt();
//      for(int i=0; i<n ; i++){
//          System.out.println(2*i+1);
//      }


        System.out.print("Enter the limit(n) : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("First " + n + " natural numbers in reverse order are :-");
        for( int i =n; i>0; i--){
            System.out.println(i);
        }
    }
}
