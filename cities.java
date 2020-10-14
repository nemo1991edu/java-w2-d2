import java.util.Scanner;

public class cities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first city: ");
		String c1 = input.nextLine();
		System.out.print("Enter second city: ");
		String c2 = input.nextLine();
		System.out.print("Enter third city: ");
		String c3 = input.nextLine();

		String temp;
		if ((c2.compareTo(c1) < 0) && (c2.compareTo(c3) < 0))
		{
			temp = c1;
			c1 = c2;
			c2 = temp;	
		}
		else if ((c3.compareTo(c1) < 0) && (c3.compareTo(c2) < 0))
		{
			temp = c1;
			c1 = c3;
			c3 = temp;
			
		}
		if (c3.compareTo(c2) < 0)
		{
			temp = c2;
			c2 = c3;
			c3 = temp;
		}
		System.out.println("The three cities in alphabetical order are " +
			c1 + " " + c2 + " " + c3);
	}
}
