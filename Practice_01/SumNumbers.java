import java.util.Scanner;
public class SumNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sumnumbers = new Scanner(System.in);

        // Prompt the user to enter two numbers and store them

        // Get the first number from the user
        System.out.print("Enter number1: ");
        int num1 = sumnumbers.nextInt();

        // Get the second number from the user
        System.out.print("Enter number2: ");
        int num2 = sumnumbers.nextInt();


        // Calculate the sum of the two numbers and display it to the user
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        }
}

