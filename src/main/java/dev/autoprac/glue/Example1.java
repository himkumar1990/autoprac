package dev.autoprac.glue;

import java.util.Stack;

public class Example1 {

	public static void main(String[] args) {
		System.out.println(towerBreakers(1, 4));

	}

	public static int towerBreakers(int n, int m) {

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			stack.push(m);
		}

		int turn = 1;

		while (stack.size() > 0 && stack.get(0) > 1) {
			int first = stack.pop();
			for (int k = 1; k < first; k++) {
				if (first % k == 0) {
					first = k;
					break;
				}
			}
		
			if (first > 1)
				stack.push(first);

			if (turn == 1) {
				turn = 2;
			} else if (turn == 2) {
				turn = 1;
			}
		}

		int winner = (turn == 1) ? 2 : 1;
		return winner;
	}

}
