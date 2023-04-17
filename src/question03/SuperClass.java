/**
 * 
 */
package question03;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */
public class SuperClass {

	public SuperClass sum() {
		System.out.println("The sum method in SuperClass");
		return new SuperClass();
	}
}
