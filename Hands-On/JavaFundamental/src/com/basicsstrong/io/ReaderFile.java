package com.basicsstrong.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderFile {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/file.txt");
		f.createNewFile();
		
		FileWriter fw = new FileWriter(f, true);
		fw.write("hello this is java code filewriter!! ");
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader(f); 
		char[] ch = new char[(int)f.length()];
		fr.read(ch); //this will copy data from file into char array.
		
		for (char c : ch) {
			System.out.println(c);
		}
		
		fr.close();
		
		FileReader fr2 = new FileReader(f); 
		BufferedReader br = new BufferedReader(fr2);
		String line = br.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line = br.readLine();
		}
		
		fr.close();
	}

}
