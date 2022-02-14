package com.capg.day12;

import java.io.FileWriter;

public class MyFile {
	public static void main(String[] args) {
		try {
			String str="Hello Java\n";
			int a=22;
			FileWriter fw = new FileWriter("D://abc.txt");
			fw.write(str);
			System.out.println();
			fw.write(65);

			fw.write("\nI am Java\n");
			fw.close();
		}catch (Exception e) {
			System.out.println("File not created");
		}
	}
}
