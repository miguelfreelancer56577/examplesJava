package practice;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import org.springframework.web.client.RestTemplate;

import practice.model.User;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	
	final static int BUFFER = 2048;

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		String connectionUrl = "jdbc:sqlserver://xxxxxxxxxxx:1433;" +
	            "databaseName=xxxxxxxxxxxxxxx;user=xxxxxxxxxxxx; password=xxxxxxxxxxxxxxxxxxxxx;";      
	    // Declaramos los sioguientes objetos
	    	Connection con = null;
	        //Establecemos la conexión
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        con = DriverManager.getConnection(connectionUrl);
	        // Create and execute an SQL statement that returns some data.
	        String SQL = "select * from dbo.r_mm_comprobante_xml_part WHERE c_comprobante = 315786";
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery(SQL);
	        while (rs.next()) {
	        	
	        	 BufferedOutputStream dest = null;
	        	
	        	InputStream memoryStreamZip = new ByteArrayInputStream(rs.getBytes(3));
	        	
	        	ZipInputStream compressedFiles = new ZipInputStream(memoryStreamZip); 
	        	
	        	ZipEntry entry;
	        	
	        	while ((entry = compressedFiles.getNextEntry()) != null)
	            {
	                System.out.println("file: " + entry.getName() + ", size: " + entry.getSize());
	                System.out.println("Extracting: " +entry);
	                int count;
	                
	                byte data[] = new byte[BUFFER];
	                
	                // write the files to the disk
	                FileOutputStream fos = new FileOutputStream(entry.getName());
	                
	                dest = new BufferedOutputStream(fos, BUFFER);
	                
	                while ((count = compressedFiles.read(data, 0, BUFFER)) != -1) {
	                   dest.write(data, 0, count);
	                }
	                
	                dest.flush();
	                
	                dest.close();
	                
	            }
	        	
	        	compressedFiles.close();
	        	
//	        	System.out.println(rs.getString(3));
	        }
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	}

}
