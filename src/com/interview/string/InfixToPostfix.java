package com.interview.string;

import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		String expression = "a+b*c^d/e+f-g-i";
		String convertedExpression = postfixConversion(expression);
		System.out.println("expression: \n"+expression+" postfix: \n"+convertedExpression);
	}

	private static String postfixConversion(String expression) {
		String result ="";
		Stack<Character> stack = new Stack<>();
		int i = 0;
		for (; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				result += ch;
				
			}else if(stack.isEmpty()) {
				stack.push(ch);
			}
			else{
				int pre = InfixToPostfix.preference(ch);
				int stackPre = InfixToPostfix.preference(stack.peek());
				while(!stack.isEmpty() && pre<=stackPre)
					result+=stack.pop();
				stack.push(ch);
			
			}
		}
		while(!stack.isEmpty()) {
			result+=stack.pop();
		}
		return result;
	}

	public static int preference(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return -1;

		}
	}

}
