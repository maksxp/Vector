
public class TestVector {
public static void main(String[] args) {
	Vector a = new Vector(5,8,4); 
	Vector b = new Vector(3,4,5); 
	Vector cSum = Vector.sum(a,b);
	double cScalarMultiply = Vector.scalarMultiply(a,b);
	Vector cVectorMultiply = Vector.vectorMultiply(a,b);
	System.out.println("sum = "+ cSum);
	System.out.println("ScalarMultiply = "+ cScalarMultiply);
	System.out.println("VectorMultiply = "+ cVectorMultiply);
}
}
