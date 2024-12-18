package flows;

import java.util.*;

public class FlowControl4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first character");
		char c1 = sc.next().charAt(0);

		System.out.println("Enter the second character");
		char c2 = sc.next().charAt(0);
		sc.close();

		if (c1 > c2) {
			System.out.println(c2 + "," + c1);
		} else {
			System.out.println(c1 + "," + c2);
		}
	}

}
