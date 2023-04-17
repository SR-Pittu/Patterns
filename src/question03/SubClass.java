/**
 * 
 */
package question03;

/**
 * @author Sobhareddy Pittu Apr 16, 2023
 */
public class SubClass extends SuperClass {

	@Override
	public SubClass sum() {
		System.out.println("From Sub Class");
		return new SubClass();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperClass s = new SubClass();

		SuperClass a = s.sum();

		System.out.println("The name of the class" + a.getClass());

	}

}
