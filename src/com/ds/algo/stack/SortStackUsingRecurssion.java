package com.ds.algo.stack;

import java.util.Stack;

public class SortStackUsingRecurssion {

	static Stack<Integer> stack = new Stack<>();
	private static void sortStack() {
		if (!stack.empty()) {
			int x = stack.pop();
			sortStack();
			sortedInsert(x);
		}
	}
	private static void sortedInsert(int x) {
		
		if (stack.empty() || stack.peek() < x) {
			stack.push(x);
			return;
		}
		
		int a = stack.pop();
		sortedInsert(x);
		stack.push(a);
	}
	public static void main(String[] args) {
		stack.push(5);
		stack.push(7);
		stack.push(3);
		stack.push(1);
		stack.push(6);
		stack.stream().forEach(v -> System.out.print(v+" "));
		System.out.println();
		sortStack();
		stack.stream().forEach(v -> System.out.print(v+" "));
	}

}
