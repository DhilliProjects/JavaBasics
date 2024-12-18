package flows;

public class FlowControl3 {
	public static void main(String args[]) {
		int n = args.length;
		if (n == 0) {
			System.out.println("No Values");
		} else {
			for (int i = 0; i < n - 1; i++) {
				System.out.print(args[i] + ",");
			}
			System.out.println(args[n - 1]);
		}
	}
}
