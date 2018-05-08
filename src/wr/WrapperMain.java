package wr;

public class WrapperMain {

	public static void main(String[] args) {
		int x = Integer.parseInt("1001",2);
		System.out.println("x=" + x);
		double d = Double.parseDouble("3.14");
		new Double(3.14).doubleValue();
		System.out.println("d=" + d);
		Integer y = new Integer(9);
		System.out.println("y=" + y);
		Integer z = new Integer("9");
		System.out.println("z=" + z);
		
		int w = y; // UNWRAPPING w = y.intValue(); AKA UNBOXING
		Integer q = 33; //WRAPPING Integer.valueOf(33) - AKA BOXING
		// 
		Integer q1 = new Integer(33);
		Integer q2 = Integer.valueOf(33);
		//
		Integer nu = null;
		int xxxxx = nu;
		
		boolean b = w == q; // UNBOXING TO INT
		Integer abc = new Integer(44);
		abc.equals(66); // BOXING TO INTEGER
	}

}
