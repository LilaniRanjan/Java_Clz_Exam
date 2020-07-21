package Exam_Java;

public class Qu_5 {
    public static void main(String[] args) {
        int decimal=12;
        String binary= "";
        int rem;

        while(decimal>0){
            rem= decimal%2;
            binary= rem + binary;
            decimal= decimal/2;
        }
        System.out.println("The number's binary is: " +binary);
    }
}
