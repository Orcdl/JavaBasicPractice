package Question2;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Please input one number that you are think it is a prime number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input <= 1) {
            System.out.println(input + "is not the prime number");
        return;
        }

        boolean isPrime = true;
        for (int i = 2; i < input -1 ; i++) {
            if(input %  i == 0) {
                isPrime = false;
            }
        }

        if(isPrime) {
            System.out.println(input + " is prime number");
        } else {
            System.out.println(input +" " + "is not the prime number");
        }
    }

}