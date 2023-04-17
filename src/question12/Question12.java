/**
 * 
 */
package question12;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */
public class Question12 {
	
	
	public final int sum() {
		return 12+13;
	}
	
	public static void main(String args[]) throws Throwable {
		final int a = 10;
		Question12 q = new Question12();
		try {
		System.out.println(q.sum());
		q.finalize();
		int b = a/0;
		}
		catch(Exception e){
			System.out.println(" Exception Caught"+e);
		}
		finally {
			
			System.out.println("Finally");
		}
		
	}

}
