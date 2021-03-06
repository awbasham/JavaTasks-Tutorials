/**
*@author Adam Basham, awbasham@purdue.edu
*A basic switch conditional demo that returns the month based on an input integer
*/

import java.util.Scanner;

public class SwitchMonthDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String monthString;
		
		System.out.println("Enter the integer value for your desired month!");
		int month = s.nextInt();

		switch(month) {
			case 1: monthString = "January";
				break;
			case 2: monthString = "February";
				break;
			case 3: monthString = "March";
				break;
			case 4: monthString = "April";
				break;
			case 5: monthString = "May";
				break;
			case 6: monthString = "June";
				break;
			case 7: monthString = "July";
				break;
			case 8: monthString = "August";
				break;
			case 9: monthString = "September";
				break;
			case 10: monthString = "October";
				break;
			case 11: monthString = "November";
				break;
			case 12: monthString = "December";
				break;
			default: monthString = "Your month doesn't exist fool!";
				break;
		}
		System.out.printf("Your month is: %s\n", monthString);
	}

}