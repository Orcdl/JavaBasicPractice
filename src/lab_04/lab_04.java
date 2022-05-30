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

        List<Integer> myArraylist = new ArrayList<Integer>();
        myArraylist.add(1);
        myArraylist.add(2);
        myArraylist.add(3);
        myArraylist.add(4);
        System.out.println("My arraylist is: "+ myArraylist);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one number:   ");
        int userinput = input.nextInt();

        switch (userinput) {
            case 1:
                System.out.println("Add number into Array list");
                myArraylist.add(input.nextInt());
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

