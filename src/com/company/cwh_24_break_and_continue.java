package com.company;

public class cwh_24_break_and_continue {
    public static void main(String[] args) {
        // break and continue using loops
//        for(int i=0; i<10;i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }


//        int i=0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("I am great");
//            if(i==3){
//                System.out.println("Loop is ended");
//                break;
//            }
//            i++;
//        }


//        int i=10;
//        do{
//            System.out.println(i);
//            System.out.println("Bhavya is bad");
//            if(i==8){
//                System.out.println("loops ends");
//                break;
//            }
//            i--;
//        }while(i>5);


          // CONTINUE USING LOOPS

//        for(int i=0;i<5;i++){
//            if(i==2){
//                System.out.println("loops ends");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Bhavya is sexy");
//        }


//        int i=0;
//        while(i<7){
//            if(i==3){
//                i++;
//                System.out.println("yaha continue use hua hai");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("java is nice");
//            i++;
//        }


        int i=0;
        do{
            if(i==2){
                i++;
                System.out.println("yaha bhi continue use hua hai fir se");
                continue;
            }
            System.out.println(i);
            System.out.println("mai hu DON");
            i++;
        }while(i<5);

    }
}
