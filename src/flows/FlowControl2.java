package flows;

import java.util.*;

public class FlowControl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nuumber");
		int a = sc.nextInt();
		if (a > 0) {
			if (a % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		} else {
			System.out.println("Enter correct value");
		}
		sc.close();
	}
}
