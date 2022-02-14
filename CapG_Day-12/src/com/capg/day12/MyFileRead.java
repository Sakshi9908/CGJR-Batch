package com.capg.day12;
import java.io.File;
import java.util.*;
public class MyFileRead {
	public static void main(String[] args) {
		try {
		File file = new File("D://abc.txt");
		System.out.println("File Name: "+file.getName());
		System.out.println("File Parent: "+file.getParent());
		System.out.println("getAbsolutePath: "+file.getPath());
		System.out.println("Path: "+file.getPath());
		System.out.println("canExecute: "+file.canExecute());
		System.out.println("canRead: " +file.canRead());
		System.out.println("Can Write: "+file.canWrite());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getFreeSpace());
		
		/*Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}*/
		}catch(Exception e) {e.printStackTrace();}
	}
}
