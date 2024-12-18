package flows;

public class FlowControl12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 53;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}
}