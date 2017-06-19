/*
	Pattern Printing

			* * * * * 
			 * * * * 
			  * * * 
			   * * 
			    * 
			   * * 
			  * * * 
			 * * * * 
			* * * * * 
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class MyClass
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int r_i = 0;
		while( r_i < n )
		{
			for( int c_i = 0 ; c_i < r_i ; c_i++ )
				System.out.print(" ");
			
			for( int c_i = 0 ; c_i < n - r_i ; c_i++ )
				System.out.print("* ");
			
			System.out.println("");
			r_i++;
		}
		r_i -=2;
		while( r_i >= 0 )
		{
			for( int c_i = 0 ; c_i < r_i ; c_i++ )
				System.out.print(" ");
			
			for( int c_i = 0 ; c_i < n - r_i ; c_i++ )
				System.out.print("* ");
			
			System.out.println("");
			r_i--;
		}
		
	}
}
