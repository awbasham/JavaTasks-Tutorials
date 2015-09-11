/**
*@author Adam Basham, awbasham@purdue.edu
*Basic if-else conditional testing
*/

import java.util.Scanner;
public class CheckPassFail {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter an integer from 1 to 100");
		int mark = s.nextInt();

		if (mark < 50) {
			System.out.println("FAIL! Your Number is less than 50!");
		} else {
			System.out.println("PASS! Your number is greater than or equal to 50!");
		}
	}

}