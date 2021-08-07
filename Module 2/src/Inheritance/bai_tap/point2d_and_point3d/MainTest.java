package Inheritance.bai_tap.point2d_and_point3d;

import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		
		// Point2D point2d = new Point2D(2,3);
		// System.out.println(point2d.toString());
		// Point2D point2d = new Point2D();
		// point2d.setXY(2,3);
		// System.out.print(point2d.toString());
		// 
		Point3D point3d = new Point3D();
		point3d.setXYZ(2,4,5);
		String arr = Arrays.toString(point3d.getXYZ());
		System.out.print(arr);
		System.out.print(point3d.toString());
	}
}