package com.gmail.gaeballza.array.utils;

public class Line {

	public static final String dLine = "=".repeat(100);
	public static final String sLine = "-".repeat(100);

	public static String dLine(int count) {
		String dLine = "=";
		return dLine.repeat(count);
	}

	public static String sLine(int count) {
		String sLine = "-";
		return sLine.repeat(count);
	}

}