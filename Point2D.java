package chapter7;

public class Point2D {
	//data fields, properties or instance variables
	//x,y coordinates. Bc they are declared private
	//they can only be accessed from Point2D class
	private double x,y;
	
	//constructor
	// this is a special method that is the first one to be executed
	// when an object is created, its purpose is usually to initialize data fields
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//default constructor
	public Point2D() {
		//initialize x and y at the origin (0,0)
		//invoke the constructor of line 12 by using this keyword
		this(0.0,0.0);
	}
	
	//getters or accessors
	public double getX() {return this.x;}
	public double getY() {return this.y;}
	
	//setters or mutators
	public void setX(double x) {this.x = x;}
	public void setY(double y) {this.y = y;}
	
	@Override
	public String toString() {
		// round x and y to 2 decimals
		double x0 = Math.round(this.x*1000.0)/1000.0;
		double y0 = Math.round(this.y*1000.0)/1000.0;
		return "(" + x0 + ", " + y0 + ")";
	}
	
	public static double getDistance(Point2D p0, Point2D p1) {
		double distX = p0.x - p1.x;
		double distY = p0.y - p1.y;
		
		return Math.sqrt(Math.pow(distX,2)+Math.pow(distY, 2));
	}
	
	public double getDistanceToOrigin() {
		Point2D origin = new Point2D();
		return getDistance(this, origin);
	}
	//return the midpoint between current point and p1
	public Point2D getMidPoint(Point2D p1) {
		double midX = (this.x + p1.x)/2.0;
		double midY = (this.y + p1.y)/2.0;
		Point2D midPoint = new Point2D(midX, midY);
		return midPoint;
	}
}

