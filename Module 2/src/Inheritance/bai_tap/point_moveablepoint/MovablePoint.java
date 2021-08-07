package Inheritance.bai_tap.point_moveablepoint;
// 
import java.util.*;

public class MovablePoint extends Point {

	private float xSpeed;
	private float ySpeed;

	public MovablePoint (){

	}

	public MovablePoint (float xSpeed, float ySpeed){
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public MovablePoint (float x, float y, float xSpeed, float ySpeed){
		super(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public void setXSpeed (float xSpeed){
		this.xSpeed = xSpeed;
	}

	public float getXSpeed (){
		return xSpeed;
	}

	public void setYSpeed (float ySpeed){
		this.ySpeed = ySpeed;
	}

	public float getYSpeed (){
		return ySpeed;
	}

	public void setSpeed (float xSpeed, float ySpeed){
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public float[] getSpeed (){
		float[] array = {this.xSpeed, this.ySpeed};
		return array;
	}

	@Override
	public String toString (){
		return "\nX = "+getX()+"\nY = "+getY()+"\nSpeed : "+ Arrays.toString(getSpeed());
	}

	
	MovablePoint move (){
		setXY((getX() + this.xSpeed),(getY() + this.ySpeed));
        // setY(getY() + this.xSpeed);
		return this;
	}

}
