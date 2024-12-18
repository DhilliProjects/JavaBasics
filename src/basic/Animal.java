package basic;

import java.util.Scanner;

class Animal {

	public static void main(String str[]) {
		int i;
		int j;
		for (i = 250; i < 500; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.println(i);
			}
		}
	}
}
