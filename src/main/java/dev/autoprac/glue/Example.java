package dev.autoprac.glue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Example {

	public static int cookies(int k, List<Integer> A) {

		int iteration = 0;
		Collections.sort(A);
		if (A.isEmpty())
			iteration = -1;
		else {

			int intermediate = 0;
			while (!A.parallelStream().allMatch(i -> i >= k) && !A.isEmpty()) {
				try {
					intermediate = A.remove(0) + A.remove(1) * 2;
					addSorted(A, intermediate);
					iteration++;
				} catch (Exception e) {
					iteration = -1;
					break;
				}
			}
		}
		return iteration;
	}

	public static void addSorted(List<Integer> a, int k) {
		if (k > a.get(a.size() - 1)) {
			a.add(k);
			return;
		}
		for (int i = 0; i < a.size(); i++) {
			if (k < a.get(i)) {
				a.add(i, k);
				break;
			}
		}

	}

	public static void main(String[] args) {
		int k = 9;

		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(9);
		list.add(10);
		list.add(12);
		System.out.println(cookies(k, list));
	}
}
