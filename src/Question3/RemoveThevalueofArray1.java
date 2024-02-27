package Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveThevalueofArray1 {
    public static void main(String[] args) {
        List<Integer> myIntArr = new java.util.ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int index = 0; index < myIntArr.size(); index++) {
            int targetNum = myIntArr.get(index);
            if(targetNum == 2){
                myIntArr.remove(index);
            }
        }
        List<Integer> newArray = new ArrayList<>();
        for (int value : myIntArr) {
            if(!newArray.contains(Integer.valueOf(value))){
               newArray.add(value);
            }
        }
        for (Integer newValue : newArray) {
            System.out.println(newValue);
        }
    }
}
