import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Lab1{
	public static double computeArea( Point3d point1, Point3d point2, Point3d point3 ){
		double a = point1.distanceTo(point2) / 2;
		double b = point1.distanceTo(point3) / 2;
		double c = point2.distanceTo(point3) / 2;
		double s = sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c));
		return s;
	};
	static public Point3d point1, point2, point3;
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		point1 = new Point3d( scan.nextDouble(), scan.nextDouble(), scan.nextDouble() );
		point2 = new Point3d( scan.nextDouble(), scan.nextDouble(), scan.nextDouble() );
		point3 = new Point3d( scan.nextDouble(), scan.nextDouble(), scan.nextDouble() );
		if ( point1.equals(point2) | point1.equals(point3) | point2.equals(point3) ){
			System.out.println("одна из точек равна другой точке" );
		}
		else {
			System.out.println(computeArea(point1, point2, point3));
		}
	}
}
