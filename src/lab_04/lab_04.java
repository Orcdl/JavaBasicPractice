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
        myArraylist.add(6);
        myArraylist.add(2);
        myArraylist.add(3);
        myArraylist.add(4);
        System.out.println("My arraylist is: "+ myArraylist);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one number:   ");
        int userinput = input.nextInt();

        switch (userinput) {
            case 1:
                System.out.println("Add to number Array list");

//                myArraylist.add(newElem.nextInt());
//            for (Integer index = 0; index< myArraylist.size(); index++) {
//                System.out.println(myArraylist.get(index));
//                }
                Scanner newElem = new Scanner(System.in);
                System.out.println("Please enter new element:   ");
                myArraylist.add(newElem.nextInt());
                System.out.println(myArraylist);

            case 2:
                System.out.println("Which index you want to Print");
                Scanner newElem1 = new Scanner(System.in);
                System.out.println("Please input the index you want to print: ");
//                System.out.println(newElem1.nextInt());
                System.out.println(myArraylist.get(newElem1.nextInt()));

                break;

            case 3:
                System.out.println("Get maximum number ");
                int max = myArraylist.get(0);
                for (int i = 1; i < myArraylist.size(); i++) {
                    if (myArraylist.get(i) > max) {
                        max = myArraylist.get(i);
                    }
                }
                System.out.println("Max value is" +" " + max);

                break;
            case 4:
                System.out.println("Get maximum number");
                int min = myArraylist.get(0);
                for(int i = 1; i<myArraylist.size(); i++){
                    if(myArraylist.get(i) < min){
                        min = myArraylist.get(i);
                    }
                }
                System.out.println("Min value is"+ " " + min);
                break;
            default:
                System.out.println("Try another number pls");
        }
    }
}

