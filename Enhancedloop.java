package javaprogram;

public class Enhancedloop {
	public static void main(String[] args) {
		int a[] = {18,92,43,47,55};
		for(int i=1;i<=4;i++) {
			
			System.out.println(a[i]);
		}
		System.out.println("print data using Enhanced loop");
		for(int n:a) {
			System.out.println(n);
		}
	}

}
