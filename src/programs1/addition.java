package programs1;

import java.util.Scanner;

public class addition {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values:");
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("Addition of a="+a+" and b="+b+" is"+c);
	}

}
