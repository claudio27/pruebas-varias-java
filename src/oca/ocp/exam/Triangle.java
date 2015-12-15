package oca.ocp.exam;

public class Triangle {

	class MyResource1 implements AutoCloseable { 
		public void autoClose() { System.out.print("1 "); } // A1
		}
		class MyResource2 implements AutoCloseable { 
		public void autoClose() { System.out.print("2 "); } // A2
		}
		
		
	public static void main(String[] args) {
		try ( MyResource1 r1 = new MyResource1(); // B
		MyResource2 r2 = new MyResource2();) { // B
			System.out.print("t ");
		}
		finally {
			System.out.print("f ");
		}
	}
	
	/**
	 * What is the result? 
A) 1 2 t f 
B) 2 1 t f 
C) t 1 2 f 
D) t 2 1 f
E) Compilation fails due to an error on line B. 
F) Compilation fails due to errors on lines A1 and A2.    (X)
G) Compilation fails due to errors on lines A1, A2, and B.
	 * 
	 * */

}
