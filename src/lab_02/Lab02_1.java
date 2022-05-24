package lab_02;
// Requirement:
//Get input from user about height(m) and weight(kg) then calculate BMI
    //Underweight = <18.5
    //Normal weight = 18.5 – 24.9
    //Overweight = 25–29.9
    //Obesity = BMI of 30 or greater
//BMI = weight / (height x 2)
import java.util.Scanner;
public class Lab02_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height (m)");
        double height = input.nextDouble();
        System.out.println("Please enter your weight (kg)");
        double weight = input.nextDouble();
        double BMI = weight / (height * 2);
        if(BMI <= 18.5 ){
            System.out.println("You're in the underweight range");
        }else if(BMI > 18.5 && BMI <=24.9){
            System.out.println("You're in the Normal weight range");
        }else if(BMI <=25 && BMI <=29.9){
            System.out.println("You're in the Overweight range");
        }else{
            System.out.println("You're in the Obesity range");
        }
    }
}
