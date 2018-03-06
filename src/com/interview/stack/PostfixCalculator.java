package com.interview.stack;
import java.util.Stack;
// calculating postfix expression for integer
public class PostfixCalculator {

	public static void main(String[] args) {

		String expression="123*+5-";
		String[] tokens=new String[expression.length()];
		for(int i=0;i<expression.length();i++) {
			char ch = expression.charAt(i);
			//System.out.print(ch+" ");
			tokens[i]=String.valueOf(ch);
		}
		System.out.println("\nresultant "+postfixEvalution(tokens));
	}

	private static int postfixEvalution(String[] tokens) {
		Stack<Integer> stack=new Stack<>();
		int result;
		int first;
		int sec;
		for(String token:tokens) {
			if(token.equals("+")) {
				first=stack.pop();
				sec=stack.pop();
				result=sec+first;
				stack.push(result);
			}else if(token.equals("-")) {
				first=stack.pop();
				sec=stack.pop();
				result=sec-first;
				stack.push(result);;
			}
			else if(token.equals("*")) {
				first=stack.pop();
				sec=stack.pop();
				result=sec*first;
				stack.push(result);
			}else if(token.equals("/")) {
				first=stack.pop();
				sec=stack.pop();
				result=sec/first;
				stack.push(result);
			}else {
				stack.push(Integer.valueOf(token));
			}
		}
		return stack.pop();
	}

}
