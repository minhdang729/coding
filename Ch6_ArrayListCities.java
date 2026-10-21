package chapter6;
import java.util.*;
public class Ch6_ArrayListCities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final String END_OF_INPUT = "<END>";
		ArrayList<String> citiesList = new ArrayList<String>();//you can remove the String after new
		int index, ctr = 0;
		String newCity = "";
		
		System.out.printf("Enter city [%4d]: ", ctr);
		newCity=input.nextLine();
		//keep asking for new cities as long as the user does not enter <END>
		while(!newCity.equals(END_OF_INPUT)) {
			//append new city
			citiesList.add(newCity);
			ctr++;
			
			System.out.printf("Enter city [%4d]: ", ctr);
			newCity=input.nextLine();
			
		}
		//display cities
		System.out.println("------| Original |------");
		System.out.println(citiesList.toString());//this is the function to display the array
		
		//Sort ArrayList
		System.out.println("------| Sorted |------");
		Collections.sort(citiesList);//sort the arrayList
		displayWithIndex(citiesList);
		
		//insert new city
		System.out.println("-----| User's input |-------");
		System.out.print("Enter new city: ");
		newCity = input.nextLine();
		
		System.out.print("Enter index to insert: ");
		index = input.nextInt();
		citiesList.add(index, newCity);
		System.out.printf("Inserting '%s' at the position '%d'.\n", newCity, index);
		displayWithIndex(citiesList);
		
		System.out.print("Enter index to remove: ");
		index = input.nextInt();
		System.out.printf("Removing '%s' at the position '%d'.\n", citiesList.get(index), index);
		citiesList.remove(index);
		displayWithIndex(citiesList);
		
		input.close();
	}
	private static void display(ArrayList<String> list) {
		//enhanced for loop
		for (String elem : list) {
			System.out.printf("%s ", elem);
		}
		//Display a new line
		System.out.println();
	}
	private static void displayWithIndex(ArrayList<String> list) {
		int n = list.size();
		//Display all elements with their index
		for (int i =0; i<n; i++) {
			System.out.printf("[%d] %s, ", i, list.get(i));//use arrayName.get(index) to get the value at i position for arrayList
														// with array we can write arrayName[index]
		}
		//Display a new line
		System.out.println();
	}
}
