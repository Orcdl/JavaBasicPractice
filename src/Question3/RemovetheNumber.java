package Question3;

import java.util.Arrays;
import java.util.List;

public class RemovetheNumber {

    public static void main(String[] args) {
        List<Integer> myIntArr = new java.util.ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int index = 0; index < myIntArr.size(); index++) {
            int targetNum = myIntArr.get(index);
            if(targetNum == 2){
                myIntArr.remove(index);
            }
        }
//          Cach 1: myIntArr.removeIf(value -> value ==2);
            myIntArr.removeAll(List.of(2));
//          myIntArr.removeIf(value -> (value == 2 || value == 1));
//          myIntArr.removeAll(List.of(2,4));
        for (int value : myIntArr) {
            System.out.println(value);
            
        }
    }
}
