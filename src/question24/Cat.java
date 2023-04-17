/**
 * 
 */
package question24;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */
public class Cat {

	private String name;
	private int age;
	/**
	 * @param name
	 * @param age
	 */
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	protected void finalize() throws Throwable {
		// print message when object is garbage collected
		System.out.println(name + " object is in garbage collection.");
	}
	
	public static void main(String args[]) {
		Cat c = new Cat("Yang",4);
		c = null;
		System.gc();
		System.out.println("Done");
			
	}
}
