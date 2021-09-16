package Karl;

import org.xml.sax.SAXNotRecognizedException;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        boolean calculateAgain = true;
        while (calculateAgain) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.print("Enter weight in kilogram: ");
            double weight = sc.nextDouble();
            System.out.print("\nEnter height in meters: ");
            double height = sc.nextDouble();
            double BMI = weight / (height * height);
            if (BMI < 18.5) {
                System.out.println("Hi " + name + "\nThe Body Mass Index (BMI) is "
                        + BMI + " You are underweight. Eat more!");
            } else if (BMI > 18.5 && BMI < 24.9) {
                System.out.println("Hi " + name +"\nThe Body Mass Index (BMI) is "
                        + BMI + " " + "Stay normal!");
            } else if (BMI > 25 && BMI < 29.9) {
                System.out.println("Hi " + name +"\nThe Body Mass Index (BMI) is "
                        + BMI + " " + "You are overweight! low your carbs.");
            } else if (BMI > 30 && BMI < 34.9) {
                System.out.println("Hi " + name +"\nThe Body Mass Index (BMI) is "
                        + BMI + " " + "You are obese. Try to diet!");
            } else if (BMI < 35) {
                System.out.println("Hi " + name +"\nThe Body Mass Index (BMI) is "
                        + BMI + " " + "You are extremely overweight. You are in danger!");
            }
            System.out.println("Calculate Again?");
            calculateAgain = sc.nextBoolean();
        }
    }
}
