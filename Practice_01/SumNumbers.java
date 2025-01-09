import java.util.Scanner;
public class SumNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sumnumbers = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 = sumnumbers.nextInt();


        System.out.print("Enter number2: ");
        int num2 = sumnumbers.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
