/**
 * 
 */
package question06;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */
public class Question06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		s = s.concat(" Java");
		System.out.println(s); // Output: Hello World

		StringBuffer sBuffer = new StringBuffer("Hello");
		sBuffer.append(" Programming");
		System.out.println(sBuffer.toString()); // Output: Hello World
	}

}
