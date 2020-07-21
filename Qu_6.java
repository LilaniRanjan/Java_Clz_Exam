package Exam_Java;

public class Qu_6 {
    public static void main(String[] args) {

        long binaryNumber= 1111;
        long remainder;
        long decimalNumber= 0;
        long num = 1;

        while (binaryNumber != 0)
        {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * num;
            num = num * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("The number's Decimal is: " + decimalNumber);
    }

}
