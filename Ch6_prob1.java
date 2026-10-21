package chapter6;

/*
 * Create an integer array named dice1 of size 10
 * populate each array location with a roll of a six-sided die
 * (hint: an int value of 1 - 6)
 * Print the array out using an enhanced for loop
 * sample output dice1 = 1 1 6 2 3 5 1 5 4 5
 */
public class Ch6_prob1 {

	public static void main(String[] args) {
		final int NUM_ROLLS = 10;
		int[] dice1 = new int[NUM_ROLLS];
		int i, min =1, max=6;
		
		for (i = 0; i<dice1.length;i++)
			dice1[i]=randBetween(min, max);
		//display with enhanced for loop; cai nay kha giong voi for i in list trong python
		for(int num : dice1)
			System.out.printf("%d ", num);
	}

	private static int randBetween(int min, int max) {
		return (int)(Math.random()*(max-min+1)+min);
	}

}
