package com.techment.Day9.IO;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;



public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
FileReader fr = new  FileReader("abc.txt");
// System.out.println((char)fr.read());  
//  char ch = fr.read();
  int ch= fr.read();
while(ch!=-1)
{
	System.out.println((char)ch);  
	ch =fr.read();   //increament


}




	}

}
