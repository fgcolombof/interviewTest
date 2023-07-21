/**
 * 
 */
package com.cloudpay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author fcolombo
 *
 */
public class StringShortener {

	public String encodeStr(String s) {
		StringBuilder sb = new StringBuilder();
		if (s.length() == 1) {
			sb.append(s.charAt(0)).append(1);
			return sb.toString();
		}
		int counter = 0;
		char[] str = s.toCharArray();
		char currentChar = str[0];
		counter++;
		for (int i = 1; i <= str.length; i++) {
			if (i < str.length) {
				if (currentChar == str[i]) {
					counter++;
				} else {
					sb.append(currentChar).append(counter);
					counter = 0;
					currentChar = str[i];
					counter++;
					if (i + 1 == str.length) {
						sb.append(currentChar).append(counter);
						break;
					}
				}
			} else {
				sb.append(currentChar).append(counter);
			}
		}
		return sb.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> userData = new ArrayList();
		System.out.println("Please enter a string to process: (send 'q or Q' to exit) ");
		Scanner input = new Scanner(System.in);
		while (true) {
			String line = input.nextLine();
			if (line != null && line.length() > 0) {
				String tmp = line;
				if ("Q".equalsIgnoreCase(tmp.toUpperCase())) {
					System.out.println("bye!!");
					break;
				}
				// String cad = "AAAAAANNNMMMMYYYYuuuuUUUUaaaarWWLLLLJ888DDDDDDDD";
				// String cad = "11234TTTTttttthhhHHHHKkKkLLLiiii9999u";
				System.out.println("Imput string: " + line);
				StringShortener transfomer = new StringShortener();
				System.out.println("String output: " + transfomer.encodeStr(line));
			}
			System.out.println("Please enter a string to process: (send 'q or Q' to exit) ");
		}
	}

}
