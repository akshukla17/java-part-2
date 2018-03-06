package com.interview.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * using java stack, checking given string which contains (only brackets ) are balanced or not 
 * ()(){{}} -- is balanced
 * {() -- is not balanced
 * }} -- not balanced
 * 
 */
public class BalancedOperator {
	static Map<Character, Character> map = new HashMap<>();

	public static void main(String[] args) {
		String str = "((}}";
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		System.out.println("given string is balanced: " + isBalanced(str));
	}

	private static boolean isBalanced(String str) {
		char ch[] = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				stack.push(ch[i]);
			} else if (stack.isEmpty() && map.containsValue(ch[i])) {
				return false;
			} else if (!stack.isEmpty() && map.containsValue(ch[i])) {

				char top = stack.peek();
				if (map.get(top) == ch[i]) {
					stack.pop();
				} else {
					return false;
				}

			}
		}
		if (stack.empty())
			return true;
		return false;
	}

}
