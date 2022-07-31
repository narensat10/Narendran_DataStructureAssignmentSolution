package com.naren.main;
import java.util.*;
public class Driver {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n,val;
		/*Getting required no of floors*/
		System.out.println("Enter the no of floors in the building  : ");
		n=sc.nextInt();
		/*Getting a array to store day wise floor size*/
		int size[]=new int[n+1];
		for(int i=1;i<n+1;i++)
		{
			System.out.println("Enter the size given on day  : "+i);
			val=sc.nextInt();
			size[val]=i;
		}
		int temp=n;
		/*Print the day wise construction order*/
		System.out.println("The order of construction of the floors day wise");
		for(int i=1;i<=n;i++)
		{
			System.out.println("Day "+i+":");
			while(temp>=1&&size[temp]<=i)
			{
				//flag++;
				System.out.print(temp+" ");
				temp--;
			}
				System.out.println();
		}
		sc.close();
	}
}
