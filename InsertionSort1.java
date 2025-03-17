import java.util.Scanner;
public class InsertionSort1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number that will be the array's lenght: ");
		int num1 = sc.nextInt();
		
		int [] num2 = new int[num1];
		System.out.print("Enter"+num1+" Numbers: ");
		for(int x=0; x<num1; x++)
		{
			num2[x]= sc.nextInt();
		}
		
		for(int i=1; i<num1; i++) 
		{
			
			for(int j=i; j>0&&num2[j-1]>num2[j]; j--)
			{
				int temp = num2[j-1];
				num2[j-1] = num2[j];
				num2[j] = temp;
			}
		}
		for (int k=0; k < num1; k++)
		{
			System.out.print(num2[k]);
		}
	}

}
