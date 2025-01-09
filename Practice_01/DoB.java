import java.util.Scanner;
public class DoB
{
    public static void main(String[] args)
    {
        Scanner dob = new Scanner(System.in);

        System.out.print("Enter the date you born: ");
        int date = dob.nextInt();

        System.out.print("Enter the month you born: ");
        int month = dob.nextInt();

        System.out.print("Enter the year you born: ");
        int year = dob.nextInt();

        System.out.println("Hi!!! mate you are born in "+date+"/"+month+"/"+year);
    }
}