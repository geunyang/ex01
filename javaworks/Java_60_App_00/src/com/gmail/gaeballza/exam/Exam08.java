package com.gmail.gaeballza.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exam08 {
	
	public static void main(String[] args) {
		String filename = "src/com/gmail/gaeballza/exam/data.txt";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(filename);
			scan = new Scanner(is);
			while (scan.hasNext()) {
				String strLine = scan.nextLine();
				System.out.println(strLine);
			}
			scan.close();
			is.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
