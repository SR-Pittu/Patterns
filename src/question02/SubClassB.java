/**
 * 
 */
package question02;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */
public class SubClassB extends SuperClassA {

	
//	private void methodOne() {
//		System.out.println("Method One in Sub Class B ");
//	}
	@Override
	 void methodTwo() {
		 System.out.println("Method Two in Sub Class B ");
	 }
	@Override
	 protected void methodThree() {
		 System.out.println("Method Three in Sub Class B ");
	 }
	@Override
	 public void methodFour() {
		 System.out.println("Method Four in Sub Class B ");
	 }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperClassA a  = new SubClassB();
		a.methodTwo();
		a.methodThree();
		a.methodFour();
		

	}

}
