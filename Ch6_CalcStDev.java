package chapter6;
//prompt user enter n, min, max. generate n random double values from min - max. store in array numbers. display, calculate and display low, high, average(mean)
// and standard deviation of sample.
//Standard deviation is a measure of how spread out a set of data values is from the mean (average).
import java.util.*;
public class Ch6_CalcStDev {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, lowIndex, highIndex;
		double min, max, avg, stDev, sum;
		double [] numbers;
		System.out.print("Enter n, min, max: ");
		n = input.nextInt();
		min= input.nextDouble();
		max=input.nextDouble();
		numbers = new double[n];
		fillWithRandom(numbers, min, max);
		
		lowIndex = getLow(numbers);
		highIndex = getHigh(numbers);
		
		sum = calcSum(numbers);
		avg = sum/(double)numbers.length;
		stDev=calcStDev(numbers, avg);
		
		display(numbers);
		System.out.println("\n-----| Statistics |------");
		System.out.printf("Low[%d] = %.2f\n", lowIndex, numbers[lowIndex]);
		System.out.printf("High[%d] = %.2f\n", highIndex, numbers[highIndex]);
		System.out.printf("Summation = %.2f\n", sum);
		System.out.printf("Average = %.2f\n", avg);
		System.out.printf("Standard Deviation = %.2f\n", stDev);
		input.close();
	}
	private static void display(double[] array) {
		int n = array.length;
		
		for (double elem : array)
			System.out.printf("%.2f ", elem);
	}
	private static double calcStDev(double[] array, double avg) {
		double sum = 0, stDev = 0;
		int n = array.length;
		//calculate the difference of squares between avg and current element
		for (double elem : array)
			sum += Math.pow(avg-elem, 2);
		
		stDev = Math.sqrt(sum/(double)(n-1));
		return stDev;
	}
	private static double calcSum(double[] array) {
		double sum = 0;
		for (double elem : array)
			sum += elem;
		return sum;
	}
	private static int getHigh(double[] array) {
		double high = array[0];
		int index =0, n = array.length;
		for (int i =1; i<n; i++) {
			if (array[i]>high) {
				high = array[i];
				index = i;
			}
		}
		return index;
	}
	//return the index of the lowest element of the array
	private static int getLow(double[] array) {
		//assume the first element is the lowest
		double low = array[0];
		int index =0, n = array.length;
		for (int i =1; i<n; i++) {
			if (array[i]<low) {
				low = array[i];
				index = i;
			}
		}
		return index;
	}

	private static void fillWithRandom(double[] array, double min, double max) {
		int n = array.length;
		for (int i =0; i<n; i++)
			array[i]=randBetween(min, max);
	}

	private static double randBetween(double min, double max) {
		return (Math.random()*(max-min-1)+min);
	}

}
