package com.company;
import java.util.Scanner;

public class cwh_18_else_if {
    public static void main(String[] args) {
        String var= "harshita";

        switch (var) {
            case "bhavya" -> System.out.println("You are going to become an adult");
            case "harshita" -> System.out.println("You are going to get a job");
            case "suresh" -> System.out.println("You are going to get retire");
            default -> System.out.println("Enjoy your life");
        }
        System.out.println("Thanks for using my java code");

     /*
      int age;
        System.out.println("Enter your age ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age>56){
            System.out.println("You are experienced !");
        }
        else if(age>46){
            System.out.println("You are semi-experienced !");
        }
        else if(age>36){
            System.out.println("You are fresher !");
        }
        else{
            System.out.println("You are not experienced");
        }
       */

    }
}
