package com.array;

public class PrintArray {

	public static void main(String[] args) {
		System.out.println("Welcome to array program using generics");
		Integer intArray[] = { 1, 2, 3, 4, 5 };
		Double doubleArray[] = { 1.5, 4.5, 6.7 };
		Character charArray[] = { 'H', 'E', 'L', 'L', 'O' };
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
	}

	private static <T> void displayArray(T[] inputArray) {
		for (T i : inputArray)
			System.out.println(i);
	}

}
