package com.company;
import java.util.Scanner;

public class cwh_19_ch4_ps {
    public static void main(String[] args) {
       // Question 1
//        int a= 11;
//        if(a=11){     //error show
//    }

        // Question 2
      /*  byte m1,m2,m3 ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Maths");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println(" Your overall percentage is " + avg );
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations you have been promoted");
        }
        else{
            System.out.println("Sorry! You have not been promoted. Please try again");
        }

       */

        // Question3
        /*
        float tax = 0f;
        float income;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income in lakhs");
        income = sc.nextFloat();

        if(income<=2.5f){
            tax = tax +0f;
        }
        else if(income >2.5f && income <5f){
            tax = tax + 0.05f*(income - 2.5f);
        }
        else if(income>=5f && income <10f){
            tax = tax + 0.05f*(5f - 2.5f);
            tax = tax +0.2f*(income - 5f);
        }
        else if(income>=10f){
            tax = tax + 0.05f*(5f-2.5f);
            tax = tax + 0.2f*(10f - 5f);
            tax = tax + 0.3f*(income- 10f);

        }
        System.out.println("The total tax payed by the you is " + tax + " lakhs");

         */

        //Question 4
        /*
        Scanner sc = new Scanner(System.in);
        int day;
        System.out.println("Enter the number");
        day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

         */

        //Question 6
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("It is an organisational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("It is a commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("It is an Indian website");
        }

    }
}
