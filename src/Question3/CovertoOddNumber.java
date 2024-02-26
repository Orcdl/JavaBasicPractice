package Question3;

import java.util.Arrays;
import java.util.List;

public class CovertoOddNumber {

    public static void main(String[] args) {
        List<Integer> myIntArr = new java.util.ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int index = 0; index < myIntArr.size(); index++) {
            int targetNum = myIntArr.get(index);
            boolean isOddNumber = targetNum % 2 !=0;
            if(isOddNumber){
                myIntArr.set(index, targetNum * 2);
            }
        }
        for (int value : myIntArr) {
            System.out.println(value);
            
        }
    }
}
