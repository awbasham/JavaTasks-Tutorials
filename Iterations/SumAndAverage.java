/**
*@author Adam Basham, awbasham@purdue.edu
*Iterates through a minimum and maximum value, returning the sum and average of the range.
*/

import java.util.Scanner;

public class SumAndAverage {

	public double calculateAverageSum(int min, int max) {
		int x;
		int count = 0;
		if ((max + Math.abs(min)) > 100) {
			System.out.println("Woah!! Slow down there! Keep the range within a difference of 100!  We don't own supercomputers!");
		} else {
			int sum = 0;
			double average;
			if (min != max) {
				for (x = min; x <= max; ++x) {
				sum += x;
				count += 1;
				}
			} else if (min == max) {
				sum = min + max;
				count = 2;
			}
			average = sum / (double)count;
		
			System.out.printf("The sum of your range is %d, and the average is %f \n", sum, average);
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		SumAndAverage m = new SumAndAverage();

		System.out.println("Enter your minimum range value!");
		int minimum = s.nextInt();

		System.out.println("Enter your maximum range value!");
		int maximum = s.nextInt();

		System.out.println("\n \n");
		System.out.println(m.calculateAverageSum(minimum, maximum));
	}
}