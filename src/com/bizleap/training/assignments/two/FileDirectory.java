package com.bizleap.training.assignments.two;

import java.io.File;
import java.io.IOException;
public class FileDirectory {

	public static void main(String[] args) throws IOException{		
					
		File currentDir = new File("."); 
		displayDirectoryContents(currentDir);
	}

	public static void displayDirectoryContents(File dir) {
		
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("directory:" + file.getAbsolutePath());
					displayDirectoryContents(file);
					
				} else {
					System.out.println("     file:" + file.getAbsolutePath());

				}
			}
		}
}


