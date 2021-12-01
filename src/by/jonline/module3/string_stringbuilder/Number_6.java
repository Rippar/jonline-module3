package by.jonline.module3.string_stringbuilder;

import java.util.Scanner;

/*Из заданной строки получить новую, повторив каждый символ дважды*/

public class Number_6 {
	public static void main(String[] args) {

		String str = enterFromConsole();

		char[] chars = str.toCharArray();

		char[] doubleChars = new char[chars.length * 2];

		for (int i = 0, j = 0; i < chars.length; i++, j += 2) {

			doubleChars[j] = chars[i];
			
			doubleChars[j + 1] = chars[i];

		}

		String str1 = String.valueOf(doubleChars);

		System.out.println(str1);

	}

	public static String enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку: ");

		return sc.nextLine();
	}

}
