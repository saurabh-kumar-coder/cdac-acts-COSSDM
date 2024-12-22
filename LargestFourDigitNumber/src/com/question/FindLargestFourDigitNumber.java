package com.question;

// java program to find largest 4 digit number divisible by 10 and 13
public class FindLargestFourDigitNumber {
	public static void main(String[] args) {
		int largestFourDigitNumber = 9999;

		for (int i = largestFourDigitNumber; i >= 1000; i--) {
			if (i % 10 == 0 && i % 13 == 0) {
				System.out.println("The largest 4-digit number divisible by 10 and 13 is: " + i);
				break; // Exit the loop once we find the number
			}
		}
	}
}
