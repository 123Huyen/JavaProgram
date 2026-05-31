package AddNumber;

import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many numbers to sum: ");
        //Taking the input
        N = sc.nextInt();

        int sum = 0;
        //Take N input and find the sum
        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            sum += a;
        }
        System.out.println("The sum is : " + sum) ;
    }
}
