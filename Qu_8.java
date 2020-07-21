package Exam_Java;

import java.util.Scanner;

public class Qu_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer number- ");
        int a = sc.nextInt();
        int[] numbers = {11, 9, 88, 10, 90, 3, 19};

        for(int num: numbers){
            if(num == a){
                System.out.println("Yes.. This number is in this array..");
            }
            break;
        }
        System.out.println("No.. This number isn't in this array..");

    }
}
