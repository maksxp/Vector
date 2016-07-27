
public class TestVector {
public static void main(String[] args) {
	Vector a = new Vector(5,8,4); 
	Vector b = new Vector(3,4,5); 
	Vector cSumStatic = Vector.sum(a,b);
	Vector cSum = a.sum(b);
	double cScalarMultiply = Vector.scalarMultiply(a,b);
	Vector cVectorMultiply = Vector.vectorMultiply(a,b);
	System.out.println("sumStatic = "+ cSumStatic);
	System.out.println("ScalarMultiply = "+ cScalarMultiply);
	System.out.println("VectorMultiply = "+ cVectorMultiply);
	//test of non-static method
	System.out.println("sum = "+ cSum);
}
}
