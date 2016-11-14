package practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import practice.model.User;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO how write a object in a new file
		File in = new File("people.obj");
		if(in.exists()){
			FileOutputStream file = new FileOutputStream(in);
			ObjectOutputStream people = new ObjectOutputStream(file);
			people.writeObject(new User("Miguel", "Torres"));
			people.writeObject(new User("Eduardo", "Torres"));
			people.writeObject(new User("Marcos", "Torres"));
			people.writeObject(new User("Maria", "Torres"));
			people.writeObject(new User("Angela", "Torres"));
			people.close();
		}else{
			assert(false):"Error to create file, or already exist";
		}
		
	}

}
