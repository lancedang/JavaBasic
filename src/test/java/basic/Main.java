package basic;

import java.util.Arrays;

public class Main {
	static String ssString;
	String str = new String("good");
	char[] ch = { 'a', 'b', 'c' };

	public static void main2(String args[]) {
		Main ex = new Main();
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str + " and ");
		System.out.println(ex.ch);
	}

	public void change(String str, char ch[]) {
		str = "test ok";
		ch[0] = 'g';
	}

	public static void main3(String[] args) {
		int total = 0;
		for (int i = 0; i < 4; i++) {
			if (i == 1)
				continue;
			if (i == 2)
				break;
			total += i;
		}
		System.out.println(total);
	}

	public static void main(String[] args) {

		int a = 5;
		int b = 5;
		String s1 = "abc";
		String s2 = "abc";
		char[] sc = { 'a', 'b', 'c' };

		String s3 = new String("abc");
		String s4 = new String("abc");

		String s5 = new String(sc);

		/*
		 * System.out.println(s1 == s2);// true System.out.println(s3 == s2);//
		 * false System.out.println(s3 == s4);// false System.out.println(s3 ==
		 * s5);// false
		 */
		// AbstractList

		new String().getBytes();
		
		int[] arr1 = { 8, 2, 10, 5 };
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		int[] arr3 = Arrays.copyOfRange(arr1, 1, arr1.length);
		int[] arr4 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		
		int[] arr5 = {4,1, 7, 10, 2};
		Arrays.sort(arr5);
		
		Arrays.binarySearch(arr5, 3);
		
		int[] arr6 = {3, 2, 1};
		Arrays.asList(arr6);
		
		System.out.println();
		for (int item : arr2)
			System.out.print(item + " ");
		System.out.println();
		
		for (int item : arr3)
			System.out.print(item + " ");
		
		System.out.println();
		for (int item : arr4)
			System.out.print(item + " ");
		
		System.out.println();
		for (int item : arr5)
			System.out.print(item + " ");

	}

}