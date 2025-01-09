import java.util.Scanner;
public class DoB
{
    public static void main(String[] args)
    {
        Scanner dob = new Scanner(System.in);

        ////////////////////////////////////////////////////////////////
        /// Get the date when user born
        System.out.print("Enter the date you born: ");
        int date = dob.nextInt();

        ////////////////////////////////////////////////////////////////
        /// Get the month when user born
        System.out.print("Enter the month you born: ");
        int month = dob.nextInt();

        ////////////////////////////////////////////////////////////////
        /// Get the year when user born
        System.out.print("Enter the year you born: ");
        int year = dob.nextInt();

        System.out.println("Hi!!! mate you are born in "+date+"/"+month+"/"+year);
    }
}