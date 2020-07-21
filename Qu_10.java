package Exam_Java;

import java.util.Scanner;

public class Qu_10 {

    public static void main(String[] args) {

        int num;
        int count;
        int wantedTriangle;

        System.out.print("Input number of wanted Triangle : ");
        Scanner waTri = new Scanner(System.in);
        wantedTriangle = waTri.nextInt();

        for(num=1; num<=wantedTriangle; num++)
        {
            for(count=1; count<=num; count++)
                System.out.print(num);
            System.out.println("");
        }
    }
}
