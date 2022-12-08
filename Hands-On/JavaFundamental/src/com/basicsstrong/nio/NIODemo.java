package com.basicsstrong.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.FileChannel;

public class NIODemo {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("file.txt");
		FileChannel source = fis.getChannel();
	}

}
