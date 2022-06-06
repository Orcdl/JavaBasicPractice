package lab_06;
/*
Requirement:
Given input string: "2hrs and 5 minutes"
Please calculate how many minutes in total
 */
public class Lab_06_01 {
    public static void main(String[] args) {
        String myInputTime = new String("2 hours and 5 mintues");
        char hourvalue = myInputTime.charAt(0);
        char mintuesvalue = myInputTime.charAt(12);
        int myHour = Integer.parseInt(String.valueOf(hourvalue));
        int myMintues = Integer.parseInt(String.valueOf(mintuesvalue));
        int mintuesCovert = (myHour * 60);
        System.out.println("Total mintues is " + (mintuesCovert + myMintues));
    }
}
