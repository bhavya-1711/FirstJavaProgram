package com.company;
import java.util.Scanner;

public class cwh_11_ex1_solution {
    public static void main(String[] args) {
        System.out.println("Welcome to CBSE percentage maker");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum marks of a subject: (ex - 80 or 100)");
        int total_marks= sc.nextInt();
        System.out.print("Enter marks of PHYSICS : ");
        int a= sc.nextInt();
        System.out.print("Enter marks of CHEMISTRY : ");
        int b= sc.nextInt();
        System.out.print("Enter marks of ENGLISH : ");
        int c= sc.nextInt();
        System.out.print("Enter marks of MATHS : ");
        int d= sc.nextInt();
        System.out.print("Enter marks of COMPUTER : ");
        int e= sc.nextInt();
        float percentage= ((a+b+c+d+e)*100)/(total_marks*5f);
        System.out.println("YOUR PERCENTAGE IS :- " );
        System.out.println(percentage);


    }
}
