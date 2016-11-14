package practice;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO how create a file
		File test = new File("test.txt");
		if(test.createNewFile()){
			System.out.println("File Create");
		}else{
			assert(false):"Error to create file, or already exist";
		}
		
	}

}
