package practice;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {

		int[] arr = {4,5,6,3,8,15,14,13};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-3]); //get the 3rd largest number
		String s = "Ap ple";
		System.out.println(s.substring(1,3));
		System.out.println(s.charAt(3));
		String[] s1 = s.split(" ");
		System.out.println(s1);


		//char[] ar = s1.toCharArray();
		System.out.println(s1[0]);
	}

}
