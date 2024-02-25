package Question1;

import java.util.Scanner;

public class PrintfromScannerOptimize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + " to the game");

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if(age > 18 && age < 50 ){
            System.out.println("You are enough to this game");
        } else {
            System.out.println("Sorry, you have to stop here");
        }
    }
}
