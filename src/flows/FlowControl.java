package flows;

import java.util.*;

public class FlowControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("Positive");
		} else if (a < 0) {
			System.out.println("Negtive");
		} else {
			System.out.println("Zero");
		}
		sc.close();
	}

}
