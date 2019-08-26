package objectinputoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStream {
	
	public static void main(String[] args)
	{
		Employee employee = new Employee("10", "sachin",20000,"mumbai");
		System.out.println("Employee to write is" +employee);
		
		try {
			FileOutputStream out = new FileOutputStream("employee.out");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(employee);
			oos.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Problem Serializing:" +e);
		}
		
		try {
			FileInputStream in = new FileInputStream("employee.out");
			ObjectInputStream ois = new ObjectInputStream(in);
			employee = (Employee)(ois.readObject());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Problem serializing: "+e);
		}
		System.out.println("Employee Read is :" +employee);
		
	}

}
