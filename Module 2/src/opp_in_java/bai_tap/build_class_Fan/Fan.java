package opp_in_java.bai_tap.build_class_Fan;

public class Fan{

	final int slow  = 1;
	final int medium = 2;
	final int fast = 3;

	private int speed = slow;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";

	public int getSlow(){
		return slow;
	}

	public int getMedium(){
		return medium;
	}

	public int getFast(){
		return fast;
	}

	public int getSpeed(){
		return speed;
	}

	public boolean isOn(){
		return on;
	}

	public double getRadius(){
		return radius;
	}

	public String getColor(){
		return color;
	}

	public void setSpeed(int speed){
		this.speed = speed;
	}

	public void setOn(boolean on){
		this.on = on;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color){
		this.color = color;
	}

	Fan(){

	}

	public String toString(){
		if(on){
			return "Fan has color is : "+this.color+"\nSpeed is : "+this.speed+"\nRadius is : "+this.radius+"\nFan is on";
		}
		else{
			return "\nFan has color is: "+this.color+"\nRadius is: "+this.radius+"\nFan is off";
		}
	}

}