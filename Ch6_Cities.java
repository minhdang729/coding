package chapter6;

import java.util.*;

public class Ch6_Cities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] cities = {"Miami", "Dallas", "New York", "Chicago", "Atlanta","Los Angeles"};
		int n = cities.length;
		
		
		System.out.println("Sorted list of cities");
		Arrays.sort(cities); //sort the array following the alphabet
//		displayArray(cities);
		
		//prompt the user to enter index's value
		System.out.print("Enter index of the element you want to see: ");
		int indexVal = input.nextInt();
		System.out.printf("Cities[%d] %s\n", indexVal, cities[indexVal]);
		
		//close previous input
		input.nextLine();
		
		System.out.print("Enter new city name: ");
		String newVal = input.nextLine();
		System.out.print("Enter index of the element you want to change: ");
		indexVal = input.nextInt();
		cities[indexVal] = newVal;
		displayArray(cities);
		Arrays.sort(cities);//sort the array
		input.nextLine();
		
		//search for city
		System.out.print("Enter city to search: ");
		String city2Search = input.nextLine();
		
		//binary search returns the index of the city we are looking for or -1 if not found
		//WARNING: Binary search only works if the array is already sorted in ascending order
		int index = Arrays.binarySearch(cities, city2Search);
		if ((index>-1)&&(index<n))
			System.out.printf("cities[%d] = %s\n", index, cities[index]);
		else
			System.out.println("City not found");
		input.close();
	}

	private static void displayArray(String[] cities) {
		for (int i =0; i<cities.length;i++) {
			System.out.printf("[%4d] = %s\n", i, cities[i]);
		}
		
	}
}
