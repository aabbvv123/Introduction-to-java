package javaprogram;
import java.util.*;

public class Positveandnegative {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		if (num>0)
		{
			System.out.println("The number is positive" );
		}
		else {
				System.out.println("The number is negative");
			}
		if (num % 2 == 0)
		{
			System.out.println("The number is even");
		}
		else
			{
				System.out.println("The number is odd");
			}
	}

}
