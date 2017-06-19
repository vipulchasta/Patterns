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

class Ideone
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for( int r_i = 0 ; r_i < n ; r_i++ )
		{
			for( int c_i = 0 ; c_i < r_i ; c_i++ )
				System.out.print(" ");
			
			for( int c_i = 0 ; c_i < n - r_i ; c_i++ )
				System.out.print("* ");
			
			System.out.println("");
		}
		for( int r_i = n-2 ; r_i >= 0 ; r_i-- )
		{
			for( int c_i = 0 ; c_i < r_i ; c_i++ )
				System.out.print(" ");
			
			for( int c_i = 0 ; c_i < n - r_i ; c_i++ )
				System.out.print("* ");
			
			System.out.println("");
		}
		
	}
}
