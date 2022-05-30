package lab_04;
/*
Requirement:
Create a simple menu with 4 options:
=====MENU======
1. Add number into ArrayList
2. Print numbers
3. Get maximum number
4. Get minimum number
5. search number: Add option number 5 to find a number -> index
 */

import java.util.*;

public class lab_04 {

    public static void main(String[] args) {

        List<Integer> myArraylist = Arrays.asList(2, 4, 6, 8);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one number:   ");
        int userinput = input.nextInt();
        myArraylist.add(userinput);
        myArraylist.add(0,userinput);


        switch (userinput) {
            case 1:
                System.out.println("Add number into Array list");
                break;
            case 2:
                System.out.println("Please Print number");
                break;
            case 3:
                System.out.println("Get maximum number ");
                break;
            case 4:
                System.out.println("Get maximum number");
                break;
            default:
                System.out.println("Try another number pls");
        }
    }
}

