package AddNumber;

import java.math.BigInteger;

public class BigIntSum {
    public static void main(String[] args) {
        //BIgInteger object to store the result
        BigInteger sum;
        //Create two String to hold the string value
        String input1 = "9482423949832423492342323546";
        String input2 = "6484464684864864864864876543";

        //Convert string input to BigInteger
        BigInteger num1 = new BigInteger(input1);
        BigInteger num2 = new BigInteger(input2);

        //Sum method
        sum = num1.add(num2);
        
        System.out.println("Sum of the two big integer: " + sum);

    }
    
}
