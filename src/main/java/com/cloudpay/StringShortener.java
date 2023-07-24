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

	/**
     The logic behind the algorithm is to process the input string character by character.
     Whenever a different character is encountered, it is appended to the output string, 
     and the algorithm proceeds to count consecutive occurrences of that character.
     If subsequent characters match the previous one, their count is determined and added 
     to the output string along with the character itself. This process continues, 
     allowing the algorithm to compress the output string, reducing its length relative 
     to the input string.
     This algorithm will lose efficiency when the input strings have few repetitions and 
     when the repetitions occur in groups of a maximum of 2 positions. It will achieve 
     its highest efficiency when there are occurrences of groups with three or more 
     identical characters.     
    */
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

}
