package Exam_Java;

public class Qu_4 {
    public static void main(String[] args) {
        int num=6;
        int ans=1;

        for(int i=1; i<=num; i++){
            ans= ans*i;
        }
        System.out.println("Factorial value of the number is " +ans);
    }
}
