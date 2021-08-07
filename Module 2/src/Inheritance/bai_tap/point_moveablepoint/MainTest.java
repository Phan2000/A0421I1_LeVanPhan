package Inheritance.bai_tap.point_moveablepoint;
// 
import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		
		// Point point = new Point(3,5);
		// System.out.print(point.toString()); 

		MovablePoint movep = new MovablePoint(1,2,3,4);
		// movep.setSpeed(1,2);
		// String array = Arrays.toString(movep.getSpeed());
		// System.out.print("\n"+array);
		System.out.print(movep.move());
	}
}