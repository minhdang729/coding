package chapter7;
import java.util.*;
public class PointSetTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, index;
		double minX, maxX, minY, maxY;
		PointSet pSet = new PointSet();
		
		System.out.print("Enter n, minX, maxX, minY, maxY: ");
		n = input.nextInt();
		minX = input.nextDouble();
		maxX = input.nextDouble();
		minY = input.nextDouble();
		maxY = input.nextDouble();
		
		pSet.generateRandomPoints(n, minX, minY, maxX, maxY);
		
		//display points; true -> with index; false -> without index
		pSet.displayAll(true);
		
		System.out.print("The closest point to the center: ");
		index = pSet.getClosestPointToCenter();
		Point2D pCenter = pSet.get(index);
		System.out.printf(pCenter.toString());
		
		input.close();
	}

}
