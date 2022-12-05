package com.linear.stack.problems;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BracatMatching {
	
	public static final String regex = "A-Za-z0-9\\.$";
	
	private static Boolean isMatchesBYChar(Character ch) {

		if (Character.isDigit(ch)) {
			return true;
		} else if (Character.isAlphabetic(ch)) {
			return true;
		} else if (ch == '>' || ch == '<')
			return true;

		return false;

	}

	private static Boolean bracatMatching(String str) {
		Stack<Character> stack = new Stack<Character>();

		for (Character character : str.toCharArray()) {

			if(isMatches(character)) 
				continue;	
			
			
			if (character == '}') {
				
				if (!stack.isEmpty() && stack.peek() == '{')
					stack.pop();
				else
					return false;
				
			} else if (character == ')') {

				if (!stack.isEmpty() && stack.peek() == '(')
					stack.pop();
				else
					return false;

			} else if (character == ']') {

				if (!stack.isEmpty() && stack.peek() == '[')
					stack.pop();
				else
					return false;

			} else
				stack.push(character);
		}

		System.out.println(stack.size());
		if(stack.isEmpty())
		return true;
		
		return false;
	}

	private static boolean isMatches(Character ch) {

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(ch+"");
		if (matcher.matches()){
			System.out.println(ch+" "+true);
			
			return true;
		}else if (ch == '>' || ch == '<') {
			System.out.println(ch+" "+true);
			return true;

		}

		return false;
	}

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		Boolean isBalance = bracatMatching(sc.nextLine());
//
//		System.out.println(isBalance);
//
//		sc.close();
		
		int i =0;
		
		i++;
		i++;
		System.out.println(" "+i);

	}

}
