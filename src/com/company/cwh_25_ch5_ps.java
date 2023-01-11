package com.company;
import java.util.Scanner;

public class cwh_25_ch5_ps {
    public static void main(String[] args) {
        // question 1

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of lines in your pattern");
//        int n = sc.nextInt();
//        for(int i=n; i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


        // question 2

//        int sum =0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        int n= sc.nextInt();
//        for(int i=0; i<n;i++){
//            sum = sum + (2*i);
//        }
//        System.out.print("The sum of even numbers is : ");
//        System.out.println(sum);

        // question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number you want to find the table of: ");
//        int n = sc.nextInt();
//        for(int i=1; i<=10;i++){
//            System.out.printf("%d X %d = %d\n", n,i,n*i);
//        }

        // question 4
//        int n=10;
//        for(int i=n; i>=1;i--){
//            System.out.printf("%d X %d = %d\n", n,i,n*i);
//        }

        //question 6
//        int n = 5;
//        int i=1;
//        int factorial =1;
//        while(i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);

        // question 9
        int sum =0;
        int n=8;
               for(int i=1; i<=10;i++){
           sum += n*i;
        }
        System.out.println(sum);

    }
}
