package com.company;

public class cwh_35_methods_ps {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n", n,i,n*i);
        }
    }

    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    static void pattern2(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fibonacci(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return  fibonacci(n-1) + fibonacci(n-2);
        }

    }

    static float sum(int ...arr){
        float result = 0;
        for(int a: arr){
            result += a;
        }
        float avg = result / arr.length;
        return avg;

    }

    static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);
            for(int i=0; i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //pattern1_rec(3)
    //pattern1_rec(2) + 3 times star and new line
    //pattern1_rec(1) + 2 times star and new line + 3 times star and new line
    //pattern1_rec(0) + 1 time star & new lin + 2 time star & new line+ 3 time star & new line
    public static void main(String[] args) {
        //Problem 1
       // multiplication(9);

        //Problem 2
       // pattern1(7);

        //Problem 3
       // int c = sumRec(4);
       // System.out.println(c);

        //Problem 4
        //pattern2(4);

        //Problem 5
        //Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        // int result = fibonacci(4);
       // System.out.println(result);

        //Problem 6
       // System.out.println("The average of 7,1 ,3 is " + sum(7,1,3));

        // Problem 8
       // pattern1_rec(4);

        //Problem 7





    }
}
