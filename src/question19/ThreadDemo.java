/**
 * 
 */
package question19;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */

public class ThreadDemo extends Thread {
public void run() {
	System.out.println("Thread created from extending Thread");
	}

public static void main(String args[]) {
	ThreadDemo d = new ThreadDemo();
	d.start();
	MyRunnable r = new MyRunnable();
	Thread d1 = new Thread(r);
	d1.start();
}
}


