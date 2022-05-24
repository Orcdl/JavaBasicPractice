package lab_02;
///Requirement: Allow user to input a number, print out it’s an odd or even number

import java.util.Scanner;
public class Lab02_2 {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = input1.nextInt();
        if(x % 2 !=0){
            System.out.println( x  + " " +"is the odd number");
        }
        else{
            System.out.println( x   + " " + "is the even number");
        }
    }
}
