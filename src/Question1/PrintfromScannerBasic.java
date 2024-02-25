package Question1;

import java.util.Scanner;

public class PrintfromScannerBasic {
    public static void main(String[] args) {
        String inputofuserQ1;
        System.out.println("Please input your name");
        Scanner scanner1 = new Scanner(System.in);
        inputofuserQ1 = scanner1.nextLine();
        System.out.println("Welcome "  + inputofuserQ1 + " to this game");

        System.out.println("How old are you?");
        Scanner scanner2 = new Scanner(System.in);
        int inputuserQ2 = scanner2.nextInt();
        if(inputuserQ2 > 18 && inputuserQ2 < 50 ){
            System.out.println("You are enough old to join this game");
        } else {
            System.out.println("Sorry! You have to stop at here");
        }
    }
}
