This code was created by Usman 2152992

//Start of program

import java.util.Scanner;
 
public class BMICalculator {
 
    public static void main(String[] args) throws Exception {
        calculateBMI();
    }

    private static void calculateBMI() throws Exception {
        
        //User needs to input their weight
        
        System.out.print("Please enter your weight in kg: ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        
        //User needs to input their hieght
        
        System.out.print("Please enter your height in cm: ");
        float height = s.nextFloat();
         
        float bmi = (100*100*weight)/(height*height);
         
        System.out.println("Your BMI is: "+bmi);
        printBMICategory(bmi);
    }
     
    // Prints user's BMI in a category
    
    private static void printBMICategory(float bmi) {
        if(bmi < 18.5) {
            System.out.println("You are underweight.");
        }else if (bmi < 25) {
            System.out.println("You are healthy.");
        }else if (bmi < 30) {
            System.out.println("You are overweight.");
        }else {
            System.out.println("You are obese.");
        }
    }
}

//End of program