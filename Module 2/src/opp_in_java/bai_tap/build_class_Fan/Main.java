package opp_in_java.bai_tap.build_class_Fan;

public class Main {
	public static void main(String[] args) {
		
		Fan fan1 = new Fan();
		fan1.setSpeed(fan1.getFast());
		fan1.setOn(true);
		fan1.setRadius(10);
		fan1.setColor("yellow");

		Fan fan2 = new Fan();
		fan2.setSpeed(fan2.getSlow());
		fan2.setOn(false);
		fan2.setRadius(5);
		fan2.setColor("blue");

		String disFan1 = fan1.toString();
		String disFan2 = fan2.toString();

		System.out.print(disFan1);
		System.out.print("\n==========================================================");
		System.out.print(disFan2);


	}
}