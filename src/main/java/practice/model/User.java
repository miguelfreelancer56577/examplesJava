package practice.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User extends Parent implements Serializable {

//	private transient String name;
//	private String surname;
//	public static String gender = "M";
//	
//	private static final long serialversionUID = 45L;
	
	public User() {
		System.out.print("d");
//		this.name = name;
//		this.surname = surname;
	}
	
	
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getSurname() {
//		return surname;
//	}
//	public void setSurname(String surname) {
//		this.surname = surname;
//	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File file = new File("Admin.obj");
		Admin admin = new Admin();
		
//			file.createNewFile();
//			
//			u = new User("Mario","Perez");
//			
//			u.age = 40;
//			
			FileOutputStream fos= new FileOutputStream(file);
			ObjectOutputStream contacts = new ObjectOutputStream(fos);
			contacts.reset();
			contacts.writeObject(admin);
			contacts.close();
			
//			u = null;
			
			FileInputStream input = new FileInputStream(file);
			ObjectInputStream oInput = new ObjectInputStream(input);
			admin = (Admin)oInput.readObject();
			
	}

//	@Override
//	public String toString() {
//		return "User [name=" + name + ", surname=" + surname + "]";
//	}
	
}
class Admin extends User {}	