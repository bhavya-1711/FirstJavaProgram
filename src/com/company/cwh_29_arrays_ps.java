package com.company;

public class cwh_29_arrays_ps {
    public static void main(String[] args) {
        // practice problem 1
        /*
        float [] marks = {23.4f,35.9f,87.5f,67.2f,98.3f};
                float sum =0;
                for(float element:marks) {
                    sum = sum + element;
                }
        System.out.println("The value of sum is " + sum);

         */
        // practice problem 2

      /*  float [] marks = {23.4f,35.9f,87.5f,67.2f,98.3f};
        float num = 35.8f;
        boolean isInArray= false;
        for(float element:marks) {
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the Array");
        }
        else {
            System.out.println("The value is not present in the Array");
        }

       */

        // Practice problem 3
      /*  float [] marks = {23.4f,35.9f,87.5f,67.2f,98.3f};
        float sum =0;
        for(float element:marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum/marks.length);
       */

        // Practice problem 4
        /*
        int[][] mat1 = {{1, 3, 5},    // [][]== row , column
                        {2, 4, 6}};
        int[][] mat2 = {{4, 9, 3},
                        {11, 0, 1}};
        int[][] result = {{0, 0, 0},
                          {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of times
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
               // printing the result
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // prints a new line only
        }

         */

        // practice problem 5
        /*
        int [] arr = {1,2,3,4,5,6};
        int l= arr.length;
        int n = Math.floorDiv(l , 2);
        int temp; // empty box to store the swapping number
        for(int i=0;i<n;i++){
            // swap a[i] and a[l-1-i]
            //  a  b   temp
            // |3| |4| ||
            temp = arr[i];
            arr[i]= arr[l-1-i];
            arr[l-1-i]= temp;
        }
        for( int element: arr){
            System.out.print(element + " ");
        }

         */

        // practice problem 6
        /*
        int [] arr = {1, 2 ,3567 ,4 ,566 ,60};
        int max = Integer.MIN_VALUE;
        for( int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The maximum value in the array is " + max);

         */

          // practice problem 7
        /*
        int [] arr = {1, 21 ,-34 ,4 ,-579 ,619};
        int min = Integer.MAX_VALUE;
        for( int e:arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println("The minimum value in the array is " + min);

         */

        // practice problem 8
        int [] arr = {1, 2 ,35 ,47 ,566 ,601};
        boolean isSorted = true;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }


    }
}



