package Question3;

import java.util.*;

public class UseHashSet {
    public static void main(String[] args) {
        List<Integer> Array3 = new ArrayList<>(Arrays.asList(0,0,6,5,8,9,0,12,56,24,1000,1));
        Set<Integer>  set = new HashSet<>(Array3);
        System.out.println(set);

        List<Integer> coverList = new ArrayList<>(set);
        List<Integer> Firstnumber = coverList.subList(0,3);
        System.out.println(Firstnumber);
    }
}
