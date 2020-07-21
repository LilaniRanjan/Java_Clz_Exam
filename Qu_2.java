package Exam_Java;

public class Qu_2 {
    public static void main(String[] args){
        String str= "Lilaniya";

        for (int startNum= str.length()-1; startNum>=0; startNum--){
            System.out.print(str.charAt(startNum));
        }
    }
}
