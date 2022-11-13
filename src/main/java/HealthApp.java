import java.util.Scanner;

public class HealthApp {


    public static void main(String[] args) {
        System.out.println("- Body Mass Index calculator -");
        System.out.println("");
        System.out.println("BMI is the most commonly used tool to correlate risk of health problems with the weight " +
                "at population level." +
                "\n" + "It is defined as a person’s weight in kilograms divided by the square of " +
                "the person’s height in metres (kg/m2).");

        System.out.println("");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your height in m:");
        float height = scanner.nextFloat();

        System.out.println("Please enter your weight in kg:");
        float weight = scanner.nextFloat();

        float bmi = weight / (height * height);
        System.out.println("Your BMI is:" + " " + bmi);

            if (bmi <18.5) {
                System.out.println("You are in the Underweight category. You should visit a dietitian.");
            }
            else if (bmi > 18.5 && bmi < 25 ) {
                System.out.println("You have normal weight.");
            }
            else if (bmi > 25 && bmi < 30) {
                System.out.println("You are in the Overweight category. You should visit a dietitian.");
            }
            else {
                System.out.println("You are in the Obese category. You should visit a doctor and a dietitian.");
            }
        }

    }
