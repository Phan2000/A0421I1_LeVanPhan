package Inheritance.thuc_hanh;

public class Shape {

	private String color = "green";
	private boolean filled = true;

	public  Shape(){

	}

	public Shape (String color , boolean filled){
		this.color = color;
		this.filled = filled;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setFill(boolean filled){
		this.filled = filled;
	}

	public boolean getFill(){
		return filled;
	}

	public String toString(){
		return "\nA Shape with color of " + getColor() + " and " + (getFill()?"filled":"not filled"); 
	}
}
 