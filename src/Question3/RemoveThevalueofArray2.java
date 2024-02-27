package Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveThevalueofArray2 {
    public static void main(String[] args) {
        List<Integer> Array1 = new ArrayList<>();
        while (Array1.size() < 20) {
            Scanner scanner = new Scanner(System.in);
            Array1.add(scanner.nextInt());
        }
        System.out.println(Array1);
    }
}
