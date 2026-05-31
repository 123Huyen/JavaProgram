package AddNumber.SwapTwoNumber;
//swaping using third variable

class Swap1 {
    //funtion to swap two numbers
    static void swapUsingThirdVariable (int m, int n) {
        int temp = m; //store value of m in temp
        m=n;
        n=temp;
        System.out.println("value of m is " + m + " and value of n is " + n);
        }
    public static void main(String[] args) {
        //declaring two variables
        int m = 20;
        int n = 15;
        swapUsingThirdVariable(m, n);
    }
}