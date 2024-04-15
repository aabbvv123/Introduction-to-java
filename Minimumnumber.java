package javaprogram;

public class Minimumnumber {
	public static void main(String[] args) {
		int a,b,c;
		a=1;
		b=3;
		c=2;
		   
		if(a<b && a<c) {
			System.out.println("the smallest number is :"+a);
		}
		else if(b<a && b<c) {
			System.out.println("the smallest number is :"+b);
		}
		else {
			System.out.println("the smallest number is :"+c);
		}
	}
}