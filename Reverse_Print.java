import java.io.*;
import java.lang.*;
import java.util.*;

class Reverse_Print
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();

		Reverse_Print obj=new Reverse_Print();
		obj.print_reverse_number(n);
	}

	public void print_reverse_number(int n)
	{
		if(n==0)
			return;
		System.out.println(n);
		print_reverse_number(n-1);

	}
}