package chapter6;

import java.util.*;

public class Ch6_ArrayRandomScores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] scoreArray;
		int n, min, max;
		System.out.print("Enter n, min, max: ");
		n = input.nextInt();
		min = input.nextInt();
		max = input.nextInt();
		//initialize the array
		scoreArray = new int[n];
		
		//generate and assign random scores
		System.out.println("---- | Original | -----");
		fillWithRandom(scoreArray, min, max);
		//displayWithIndex(scoreArray);
		input.close();
	}

	private static void fillWithRandom(int[] array, int min, int max) {
		for (int i =0; i<array.length; i++)
			array[i] = randBetween(min,max);
		
	}

	private static int randBetween(int min, int max) {
		return (int)(Math.random()*(max-min+1)+min);
	}
	public static void displayWithIndex(int[]array) {
		for (int i =0; i<array.length;i++) {
			System.out.printf("[%d] = %d\n", i, array[i]);
		}
	}

}
