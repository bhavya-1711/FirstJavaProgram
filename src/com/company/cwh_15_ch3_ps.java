package com.company;

public class cwh_15_ch3_ps {
    public static void main(String[] args) {
        // Problem 1
        String name = "Bhavya Gupta";
        name = name.toLowerCase();
        System.out.println(name);

        //Problem 2
        String text = "to lower case";
        text = text.replace(" ","_");
        System.out.println(text);

        //Problem 3
        String letter = "Dear <|name|>, thanks a lot! ";
        letter = letter.replace("<|name|>","Bhavya");
        System.out.println(letter);

        //Problem 4
        String mystring= "This string contains  double   and triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        //Problem 5
        String myletter = "Dear Bhavya,\n\tThis java course is nice. \nThanks!";
        System.out.println(myletter);
    }
}
