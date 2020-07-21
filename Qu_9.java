package Exam_Java;

import java.util.Scanner;

public class Qu_9 {

    public static void main(String[] args) {

        String str= "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        int letter=0;
        int space=0;
        int num=0;
        int other=0;

        char[] ch = str.toCharArray();

        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else{
                other ++;
            }
        }

        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }

}
