/**
 * 
 */
package question10;


import java.io.IOException;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */
public class SubClass extends SuperClass {
	  // This is allowed because IOException is a subclass of Exception
	    void method() throws IOException {
	      System.out.println("IOException");
	    }
public static void main(String args[]) {
	SubClass s = new SubClass();
	try {
		s.method();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
