package basic2;

import java.util.*;
//CollectionsS

public class Arrays1 {

	public static void main(String args[]) {

		int[] input1 = { 222, 456, 752, 8363, 73563 };
		String res = "";
		int a = set1(input1);
		int b = set2(input1);
		res = String.valueOf(a) + String.valueOf(b);
		System.out.println(res);
	}

	public static int set1(int[] arr) {
		List<Integer> arrList = new ArrayList<Integer>();
		for (int i : arr) {
			String str = String.valueOf(i);
			for (int j = 0; j < str.length(); j++) {
				arrList.add(Character.getNumericValue(str.charAt(j)));
			}
		}
		int max = Collections.max(arrList);
		int min = Collections.min(arrList);
		return max + min;
	}

	public static int set2(int[] arr) {
		List<Integer> arrList = new ArrayList<Integer>();
		for (int num : arr) {
			if (num > 99 && num < 1000) {
				arrList.add(num);
			} else {
				arrList.add(findMax(num));
			}
		}
		return Collections.max(arrList);
	}

	public static int findMax(int num) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int i = 0;
		int j = 3;

		String str = String.valueOf(num);
		while (j != str.length() + 1) {
			String subStr = str.substring(i, j);
			arrList.add(Integer.parseInt(subStr));
			i++;
			j++;
		}
		return Collections.max(arrList);
	}
}