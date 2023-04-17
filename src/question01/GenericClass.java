/**
 * 
 */
package question01;

import java.util.TreeSet;

/**
 * @author Sobhareddy Pittu Apr 16, 2023
 */
public class GenericClass<E> {

	private E value;
	public GenericClass(E value) {
		super();
		this.value = value;
	}
	public E getValue() {
		return value;
	}
	public void setValue(E value) {
		this.value = value;
	}
	public static void main(String[] args) {
		GenericClass<String> g = new GenericClass("Hello");
		GenericClass<String> g1 = new GenericClass("Java");
		System.out.println(g.getValue()+" "+g1.getValue());
	}

}
