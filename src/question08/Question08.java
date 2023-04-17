/**
 * 
 */
package question08;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */
public class Question08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    // Do some code here
			System.out.println("Inside the try block");
			int a =5/0;
		} finally {
		    // Close resources or release locks here
			System.out.println("Inside the finally block");
		}


	}

}
