/**
 * 
 */
package question18;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */
public class Question18 extends Thread {
	
   public void run() {
     System.out.println("Thread Started");
	}
	public static void main(String args[]) {
		Question18 t = new Question18();
		t.start();
		t.start();
				
	}

}
