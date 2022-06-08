package Averageby5s;

import java.util.Scanner;

public class Avgby5s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers=0;
		AverageBy5s(numbers);
	}

	public static int AverageBy5s(float numbers) {
		
    int n,i,count=0;
	double sum=0,avg;
	Scanner sc=new Scanner(System.in); 
	System.out.println("enter the numbers:");
	n = sc.nextInt(); 
	if(n<0 || n>32767) {
	System.out.println ("Invalid input");
	System.exit(0); 
	}
	for(i=5;i<=n;i++)
	{
		if(i%5==0)
		{
			sum=sum+i;
			count++; 
			}
		}
	avg = sum/count;
	System.out.printf("%.2f",avg);
	return count; 
	}
}
