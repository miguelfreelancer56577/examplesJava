package practice;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO how create a file
		File test = new File("test.txt");
		if(test.exists()){
			System.out.println("Absolute path: " + test.getAbsolutePath());
			Scanner in = new Scanner(test).useDelimiter("\n");
			int cont = 0;
			while (in.hasNext()) {
				++cont;
				System.out.println("Record number " + cont + " : " + in.next());
			}
		}else{
			if(test.createNewFile()){
				System.out.println("File Create");
				//names
				String names[] = {"Miguel", "Luis" , "Pedro", "Carlos", "Pepe", "Raul", "Manuel", "Carlitos"};
//				create object of output
				PrintWriter out = new PrintWriter(test);
				// Populate a new file
				for (int i = 0; i < names.length; i++) {
					out.println(names[i]);
				}
				out.flush();
				out.close();
				// re-run  an application
				main(null);
			}else{
				assert(false):"Error to create file, or already exist";
			}
		}
		
		
	}

}
