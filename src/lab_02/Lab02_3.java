package lab_02;

import java.util.Scanner;

// Requirement:
//Get input from user about height(m) and weight(kg) then calculate BMI
//Underweight = <18.5
//Normal weight = 18.5 – 24.9
//Overweight = 25–29.9
//Obesity = BMI of 30 or greater
//BMI = weight / (height x 2)
// Suggest user to increase/decrease weight
public class Lab02_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height (m)");
        double height = input.nextDouble();
        System.out.println("Please enter your weight (kg)");
        double weight = input.nextDouble();
        double BMI = weight / (height * 2);
        if(BMI <= 18.5 ){
            System.out.println("You should be increase your weight in range from: " + (18.5 - BMI) * 2 * height + "kg to " + (24.9 - BMI) * 2 * height + "kg");
        }else if(BMI > 24.9){
            System.out.println("You should be decrease your weight in range from:  " + (BMI - 24.9) * 2 * height + "kg to " + (BMI - 18.5) * 2 * height + "kg");
        }else{
            System.out.println("You're in the Normal weight range");
        }
    }
}
