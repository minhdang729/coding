package chapter7;

public class Point2D_Tester {

	public static void main(String[] args) {
		// create an object p0 of the class Point2D (instantiation)
		Point2D p0 = new Point2D(4.5, 6.3);
		Point2D p1 = new Point2D(); //it will use default constructor
		Point2D p2 = new Point2D(Math.PI, Math.sqrt(2.0));
		
		System.out.printf("P0 = %s\n", p0.toString());
		System.out.printf("Distance to origin: %.3f\n", p0.getDistanceToOrigin());

		System.out.printf("P1 = %s\n", p1.toString());
		System.out.printf("Distance to origin: %.3f\n", p1.getDistanceToOrigin());
		
		System.out.printf("P2 = %s\n", p2.toString());
		System.out.printf("Distance to origin: %.3f\n", p2.getDistanceToOrigin());
		
		Point2D midPoint0_1 = p0.getMidPoint(p1);
		System.out.printf("Midpoint P0 and P1 = %s, ", midPoint0_1.toString());
		System.out.printf("Distance to origin: %.3f\n", midPoint0_1.getDistanceToOrigin());
	}

}
