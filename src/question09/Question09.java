/**
 * 
 */
package question09;

import java.util.Scanner;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */
public class Question09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0 ;
		try (Scanner s  = new Scanner(System.in)) {
			    // Execute code that uses the resources
			System.out.println("Enter a number");
			int sc = s.nextInt();
			int b = sc/a;
			} catch (ArithmeticException e) {
			    System.out.println("Found divided by zero exception");
			}
	}

}
