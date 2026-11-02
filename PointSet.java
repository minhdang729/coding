package chapter7;
import java.util.*;
public class PointSet {
	//data fields, properties or instance variables
	private ArrayList<Point2D> pointList;
	//default constructor
	public PointSet() {
		//initialize pointList
		pointList = new ArrayList<Point2D>();
	}
	
	public void add(Point2D p) {pointList.add(p);}
	public void remove(Point2D p) {pointList.remove(p);}
	public void removeAll() {pointList.clear();}
	public Point2D get(int index) {return pointList.get(index);}
	public int getNumPoints() {return pointList.size();}
	
	public void displayAll(boolean includeIndex) {
		if(includeIndex) {
			int n = getNumPoints();
			for(int i =0; i< n; i++) {
				System.out.printf("[%5d] = %s\n", i, get(i).toString());
			}
		}
		else {
			//display pointList without index
			for (Point2D p : pointList)
				System.out.printf("%s, ", p.toString());
		}
		//display number of points
		System.out.printf("%d points\n",getNumPoints());
	}
	//this method generates random points
	//it first removes all previous points
	//then it generates n random points between (minX, minY); (maxX, maxY)
	public void generateRandomPoints(int n, double minX, double minY, double maxX, double maxY) {
		removeAll();
		for (int i =0; i<n;i++) {
			double x = randBetween(minX, maxX);
			double y = randBetween(minY, maxY);
			
			add(new Point2D(x,y));
		}
	}

	private double randBetween(double minX, double maxX) {
		return (Math.random()*(maxX-minX)+minX);
	}
	//return the index of the point closest to the center
	public int getClosestPointToCenter() {
	
		int n = getNumPoints();
		//if there are no points, return -1
		if (n<1)
			return -1;
		
		// center point
		Point2D pCenter = getCenterCoordinates();
		//calculate the point closest to the center
		//assume the point of the index 0 is closest
		int index = 0;
		double minDistance=pointList.get(index).getDistanceToPoint(pCenter);
		for (int i =1; i<n;i++) {
			Point2D p = pointList.get(i);
			double distance = p.getDistanceToPoint(pCenter);
			
			if (distance<minDistance) {
				minDistance = distance;
				index = i;
			}
		}
		return index;
	}
	//returns coordinates of center
	private Point2D getCenterCoordinates() {
		int n = getNumPoints();
		double sumX=0, sumY=0;
		for (Point2D p : pointList) {
			sumX +=p.getX();
			sumY +=p.getY();
		}
		Point2D center = new Point2D(sumX/(double)n, sumY/(double)n);
		return center;
	}
	
}
