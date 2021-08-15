package com.techment.Day9.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException{
		FileWriter  fw = new FileWriter("abc.txt");
		fw.write("helllo");
		fw.write("Shubhika");
		fw.write("Tiwari");
		fw.write(23);
	     System.out.println("writtten Successfullly...");  

		fw.close();
		
	}

	
	
	

}
	
