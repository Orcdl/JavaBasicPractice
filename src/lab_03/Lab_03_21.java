package lab_03;

//Finding maximum value/minimum value from an integer array
//int[] intArr = {1, 2, 3, 4, 5};
//Minimum: 1
//Maximum: 5
public class Lab_03_21 {

    public static void main(String[] args) {
        int[] inArr = {2, 1, 3, 4, 5};
        int max = 0;
        for (int i = 0; i < inArr.length; i++) {
            if (inArr[i] > max) {
                max = inArr[i];
            }
        }
        System.out.println("Max value is" +" " + max);

        int min = 6;
        for(int i = 0; i<inArr.length; i++){
            if(inArr[i]<min){
                min = inArr[i];
            }
        }
        System.out.println("Min value is"+ " " + min);
    }
}