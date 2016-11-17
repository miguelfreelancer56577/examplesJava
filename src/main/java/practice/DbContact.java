package practice;

import java.io.File;
import java.io.IOException;

public class DbContact extends File {
	
	private String nameDb;
	
	public DbContact(String nameDb){
		
		super(nameDb);
		
		this.nameDb = nameDb;
		
	}
	
	public void init() throws IOException {
		if(createNewFile()){
			
		}else{
			throw new IOException("");
		}
	}
}
