package com.company;
import java.util.Random;
import java.util.Scanner;
                              // ROCK PAPER & SCISSOR GAME
public class cwh_41_exercise2_solution {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for paper
        // 2 for scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock , 1 for paper and 2 for scissor ");
        int userInput = sc.nextInt();
        // to generate Random number from computer
        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput==computerInput){
            System.out.println("Draw");
        }
        else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
            System.out.println("YOU WIN..!!");
        }
        else if(userInput>=3){
            System.out.println("Invalid input");
            System.out.println("Game dismiss");
        }
        else{
            System.out.println("COMPUTER WIN");
        }
        //System.out.println("Computer choice : "+ computerInput);
        if( userInput<3 && computerInput==0){
            System.out.println("Computer choice : Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer choice : paper");
        }
        else if(computerInput==2){
            System.out.println("Computer choice : Scissor");
        }
        

    }
}
