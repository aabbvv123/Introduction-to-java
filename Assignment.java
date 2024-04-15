package javaprogram;

public class Assignment {
	public static void main(String[] args) {
		int a,b,c;
		a=100;
		b=200;
		c=a+b;
		
				
		System.out.println("Addition : "+c);
		System.out.println("Addition : "+(a+=b));
		System.out.println("Subtraction : "+(a-=b));
		System.out.println("Multiplication : "+(a*=b));
		System.out.println("Division : "+(a/=b));
		System.out.println("Modulus :  "+(a%=b));
		
	}

}
