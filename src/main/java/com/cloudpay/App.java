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
public class App {

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
				int lineLenght = line.length();
				System.out.println("Imput string: " + line + ", length: " + line.length());
				StringShortener transfomer = new StringShortener();
				String outPut = transfomer.encodeStr(line);
				int outPutLength = outPut.length();
				System.out.println("String output: " + outPut + ", length: " + outPutLength);
				if(lineLenght > outPutLength){
					System.out.println("Success, input string lenght (" + lineLenght+ ") is larger than output string lenght (" + outPutLength + ")\n");
				}else{
					System.err.println("Fail, input string lenght (" + lineLenght+ ") is shorter or equal than output string lenght (" + outPutLength + ")\n");
				}
			}
			System.out.println("Please enter a string to process: (send 'q or Q' to exit) \n");
		}
	}

}
