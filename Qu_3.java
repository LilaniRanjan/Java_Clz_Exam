package Exam_Java;

public class Qu_3 {
    public static void main(String[] args) {
        int[] ary= {4, 8, 16, 32, 64};
        int sum= 0;

        for (int nums : ary){
            sum= sum + nums;
        }
        System.out.println("Sum the elements of this array: " + sum);
    }
}
