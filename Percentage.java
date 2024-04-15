package javaprogram;
import java.util.Scanner;

public class Percentage {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks of the three subject");
		System.out.println("Enter the Chem marks :");int Chem = sc.nextInt();
		System.out.println("Enter the Math marks :");int Math = sc.nextInt();
		System.out.println("Enter the English marks :");int English = sc.nextInt();
		
		//int Chem = sc.nextInt();//
		//int Math = sc.nextInt();//
		//int English = sc.nextInt();//
		
		int Totalmarks = Chem+Math+English;
		
		double Percentage =(Totalmarks/3);
		
		System.out.println("Total marks : " + Totalmarks);
		System.out.println("Percentage is : "+ Percentage + "%");
		
		
		if(Chem<35 || Math<35 || English<35 ) {
			System.out.println("U are Failed ");
		} else {
			System.out.println("U are passed");
		}
		if( Percentage>=75) {
			System.out.println("u are paased with distinction");
		}else if(Percentage>=60) {
			System.out.println("U are passed with first class");
		}else if(Percentage>=45) {
			System.out.println("U are passed with second class");
		}else  {
			System.out.println("u are Failed ");
		}
		
	}

}
