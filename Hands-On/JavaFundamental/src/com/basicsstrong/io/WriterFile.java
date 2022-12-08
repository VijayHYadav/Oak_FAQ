package com.basicsstrong.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {

	public static void main(String[] args) {
		File d = new File("MyFiles");

		d.mkdir();
		File f = new File("D:/file.txt");
		
		
		
		try {
			f.createNewFile();
			
			FileWriter fw = new FileWriter("D:/filewriter.txt");
			fw.write("hello this is java code filewriter");
			fw.flush();
			fw.close();
			
			FileWriter fw2 = new FileWriter("D:/bufferedWriter.txt", true);
			BufferedWriter bw = new BufferedWriter(fw2);
			bw.write("hello this is java code bufferedWriter");
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
