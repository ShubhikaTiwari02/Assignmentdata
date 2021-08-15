package com.techment.Day9.IO;

import java.io.File;
import java.io.IOException;

public class FilecreateDemo {

	public static void main(String[] args) throws IOException{
          File file = new File("abc.txt");
          System.out.println(file.exists());  

       // file.createNewFile(); // create a new file 
          file.mkdir();              //create a new directory...
     System.out.println(file.exists());  

	}

}
