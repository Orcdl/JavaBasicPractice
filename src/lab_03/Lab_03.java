package lab_03;
// Requirement:
// Count how many odd, even number(s) in an integer array
// int[] intArr = {1, 2, 3, 4, 5};
// Even numders: 2
// Odd numbers: 3
public class Lab_03 {
    public static void main(String[] args) {
        int[] inArr ={1,2,3,4,5};
        int evennumber = 0;
        for (int index = 0; index < inArr.length; index++) {
            if(index %2 !=0){
                evennumber++;
            }
        }
        System.out.printf("Number of the Even nunber in the array is :" + (evennumber) + "\n");
        System.out.println("Number of the Odd number in the array is :" +  ((inArr.length - evennumber)));
    }

}