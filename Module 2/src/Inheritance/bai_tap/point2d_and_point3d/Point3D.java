package Inheritance.bai_tap.point2d_and_point3d;

public class Point3D extends Point2D {

	private float z ;

	public Point3D () {

	}

	public Point3D (float x, float y, float z) {
		super(x,y) ;
		this.z = z ;
	}

	public void setZ (float z) {
		this.z = z;
	}

	public float getZ () {
		return z;
	}

	public void setXYZ (float x, float y, float z){
		setXY(x,y);
		this.z = z;
	}

	public float[] getXYZ(){
    	float[] array1 = {getX(), getY(), this.getZ()};
        return array1 ;
    }

    @Override
    public String toString(){
        return "\nX = " + getX() + "\nY = " + getY() + "\nZ = " + z;
    }


}