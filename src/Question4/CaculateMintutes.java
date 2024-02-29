package Question4;

import java.util.Arrays;
import java.util.List;

public class CaculateMintutes {
    public static void main(String[] args) {
        String FirstString = "2 hrs and 5 minutes";
        String secondString = FirstString.replaceAll("[^0-9]","");
        int hour = Integer.parseInt(secondString.substring(0,1));
        int minutes = Integer.parseInt(secondString.substring(1));
        int total = hour * 60 + minutes;
        System.out.println(total);
    }
}
