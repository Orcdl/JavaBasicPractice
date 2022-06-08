package lab_06;
/*
Requirement:
String myPassword = "password123";
Allow user to input maximum 3 times
 */

import java.util.Scanner;
public class Lab_06_02 {
    public static void main(String[] args) {
        String myPassword = "password123";
        for (int i = 0; i < 3; i++) {
        Scanner scanner = new Scanner(System.in);
        String newInput = scanner.nextLine();
            if(newInput.equals(myPassword)){
                System.out.println("Correct password");
            }else System.out.println("Wrong password,please try agan");
        }
    }
}
