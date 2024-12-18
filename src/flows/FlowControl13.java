package flows;

//Prime numbers between 10 and 99
public class FlowControl13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for (j = 10; j <= 99; j++) {
			int count = 0;
			for (i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.print(j + "  ");
		}
	}
}