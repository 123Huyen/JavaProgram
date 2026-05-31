package AddNumber;

public class AddTwoNum {

    //2. Write a Program in Java to Add two Numbers.

    static class AddTwoNum_1 {
        public static int sum(int num1, int num2) {
            return num1 + num2;
        }
    } 
    class Bitwise_Sum {
        public static int sum(int num1, int num2){
            if (num2 ==0)
                return num1;
            return sum(num1^num2, (num1&num2) << 1);
        }

    }
    public static void main(String[] args) {
        int result_Arithmetic = AddTwoNum_1.sum(14,89);
        System.out.println("AddTwoNum_1 result is : "+ result_Arithmetic);
        int result_Bitwise = Bitwise_Sum.sum(14, 89);
        System.out.println("Bitwise_Sum result is : " + result_Bitwise);
    }
}
