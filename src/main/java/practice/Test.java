package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import practice.model.User;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO how write a object in a new file
		File file = new File("people.obj");
		if(file.exists()){
			FileInputStream input = new FileInputStream(file);
			ObjectInputStream oInput = new ObjectInputStream(input);
			while (input.available() > 0) {
				System.out.print((User)oInput.readObject() + "\n");
			}
		}else{
			if(file.createNewFile()){
				System.out.println("File Create");
//				people
				FileOutputStream fos= new FileOutputStream(file);
				ObjectOutputStream people = new ObjectOutputStream(fos);
				people.writeObject(new User("Miguel", "Torres"));
				people.writeObject(new User("Eduardo", "Torres"));
				people.writeObject(new User("Marcos", "Torres"));
				people.writeObject(new User("Maria", "Torres"));
				people.writeObject(new User("Angela", "Torres"));
				people.close();
				// re-run  an application
				main(null);
			}else{
				assert(false):"Error to create file, or already exist";
			}
		}
		
	}

}
