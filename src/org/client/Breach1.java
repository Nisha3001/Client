package org.client;

import java.io.File;
import java.io.IOException;

public class Breach1 {
	public static void main(String[] args) throws IOException {
		File f= new File("D:\\java\\nisha.xlsx");
		//String[] list = f.list();
		//for (String x: list) {
		//System.out.println(x);
			
			boolean mkdir = f.mkdir(); 
		 System.out.println(mkdir);
			
			
			 boolean createNewFile = f.createNewFile(); 
			  System.out.println(createNewFile);
			  
			  boolean canRead = f.canRead(); 
			 System.out.println(canRead); 	
			 
			 boolean canWrite = f.canWrite();
			 System.out.println(canWrite);
			 
			 boolean exists = f.exists();
			 System.out.println(exists)
			 ;
			 boolean file = f.isFile();
			 System.out.println(file);
			 
			 boolean directory = f.isDirectory();
			 System.out.println(directory);
		  
		 
		
	}


}
