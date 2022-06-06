package lab_03;

// Requirement: Sort an integer array from min to max
//Input: {12, 34, 1, 16, 28}
//Expected output: {1, 12, 16, 28, 34}
public class Lab_03_3 {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 34, 1, 16, 28};
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i + 1; i1 < arr.length; i1++) {
                if(arr[i] > arr[i1]){
                    int selectE = 0;
                    selectE = arr[i];
                    arr[i] = arr[i1];
                    arr[i1] = selectE;
                }
            }
            System.out.println(arr[i]);
        }
    }

}