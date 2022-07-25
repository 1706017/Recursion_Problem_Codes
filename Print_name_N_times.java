import java.io.*;
import java.lang.*;
import java.util.*;

class Print_name_N_times
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();

		Print_name_N_times obj=new Print_name_N_times();
		obj.print_names(1,n);
	}

	public void print_names(int i,int n)
	{
		if(i>n)
			return;

		System.out.println("Amrit Manash");
		print_names(i+1,n);
	}
}