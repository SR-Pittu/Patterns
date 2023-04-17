/**
 * 
 */
package question26;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */
public class Student {

	private static final Student instance = new Student();

	private Student() {
		System.out.println("Creating a Student instance.");
	}

	public static Student getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("This is a Student object.");
	}

	public static void main(String[] args) {
		Student obj1 = Student.getInstance();
		Student obj2 = Student.getInstance();

		System.out.println("obj1 hash code: " + obj1.hashCode());
		System.out.println("obj2 hash code: " + obj2.hashCode());

		obj1.showMessage();
	}

}
