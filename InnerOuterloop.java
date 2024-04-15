package javaprogram;

public class InnerOuterloop {
	public static void main(String[] args) {
		int i,j;
		outer :for( i=1;i<=5;i++) 
		{
			inner : for(j=1;j<=5;j++) 
			{
				System.out.println(i+" hi "+j);
				if (i==3)
					break outer;
			}
			System.out.println("hi coders");
		}
	}
}
