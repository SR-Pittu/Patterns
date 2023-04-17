/**
 * 
 */
package question21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */
public class Cat implements Serializable{

		private String name;
	    private int age;
	    private double price;

	   public Cat(String name, int age, double price) {
			super();
			this.name = name;
			this.age = age;
			this.price = price;
		}


		public static void main(String[] args) throws Exception {
	        Cat c = new Cat("Doe", 4, 5000.0);

	        // Serialization
	        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"));
	        out.writeObject(c);
	        out.close();

	        // Deserialization
	        ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"));
	        Cat c2 = (Cat) in.readObject();
	        in.close();

	        System.out.println("Name: " + c2.name);
	        System.out.println("Age: " + c2.age);
	        System.out.println("Salary: " + c2.price);
	    }

}
