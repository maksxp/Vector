
public class Vector {
private double x;
private double y;
private double z;

public Vector() {
	super();
}

public Vector(double x, double y, double z) {
	super();
	this.x = x;
	this.y = y;
	this.z = z;
}

public static Vector sum (Vector a, Vector b){
	return new Vector ((a.x+b.x),(a.y+b.y),(a.z+b.z));
}
//this method produces the same result as static sum(Vector a, Vector b)
public Vector sum (Vector a){
	return new Vector ((a.x+this.x),(a.y+this.y),(a.z+this.z));
}
public static double scalarMultiply (Vector a, Vector b){
	return (a.x*b.x)+(a.y*b.y)+(a.z*b.z);
}
public static Vector vectorMultiply (Vector a, Vector b){
	//works for right-oriented system of axes
	return new Vector ((a.y*b.z-a.z*b.y),(a.z*b.x-a.x*b.z),(a.x*b.y-a.y*b.x));
}

@Override
public String toString() {
	return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
} 
}
