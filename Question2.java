import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */

  Scanner heightObj = new Scanner(System.in);
  System.out.println("Enter height:");
  double height = heightObj.nextDouble();

  Scanner weightObj = new Scanner(System.in);
  System.out.println("Enter weight:");
  double weight = weightObj.nextDouble();

  double bmi = weight / (height * height);
  System.out.println("Your BMI is: " + bmi);

  }
}
