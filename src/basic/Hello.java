package basic;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count1 = 1, count2 = 0;

		// int[] A = {1,2,3,4};
		int[] B = { 3, 3, 3, 3, 2, 2, 2, 4, 4, 5, 8 };
		int i;
		int[] arr = new int[B.length];
		for (i = 0; i < B.length - 1; i++) {
			if (B[i] == B[i + 1]) {
				count1++;
				if (count1 > 1) {
					for (int j = 0; j < B.length; j++) {
						arr[j] = B[i];
						System.out.println(arr[i]);
						j++;
					}
				}
			} else {
				count1 = 1;
			}
		}

		if (count1 == 1) {
			System.out.print(B[i]);
		} else {

		}

	}
}
