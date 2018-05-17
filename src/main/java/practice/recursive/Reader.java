package practice.recursive;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FilenameUtils;


public class Reader {

	public static final String[] patterns = {"/runtime/", "\\runtime\\"};  
	
	public void toRead(String pathToDir){
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
		
		File dir = new File(pathToDir);
		
		if(dir.exists() && dir.isDirectory()){
			
			List<File> itsFiles = Arrays.asList(dir.listFiles());  
			
			itsFiles.forEach(f->{
				
				if(!f.isDirectory())
				
					try {
						
						String fileType = FilenameUtils.getExtension(f.getName());
						
						if(!fileType.equalsIgnoreCase("zip") && !fileType.equals("rar") && !fileType.equals("jar")){
						
							String itsContet =  new String(Files.readAllBytes(Paths.get(f.getAbsolutePath())));
							
							if(itsContet.contains(patterns[0]) || itsContet.contains(patterns[1]))
								System.out.println(f.getAbsolutePath());
						
						}
						
					} catch (Exception e) {
						
						e.printStackTrace();
						
					}
					
			});
			
		}
			
		
	}
	
}
