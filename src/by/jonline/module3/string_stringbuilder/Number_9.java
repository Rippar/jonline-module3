package by.jonline.module3.string_stringbuilder;

import java.util.Scanner;

/*Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы*/

public class Number_9 {
	public static void main(String[] args) {

		String str = enterFromConsole();

		str = str.replaceAll("\\s+", "");

		char[] charArray = str.toCharArray();

		int upperCase = 0;
		int lowerCase = 0;

		for (int i = 0; i < charArray.length; i++) {

			char tmp = charArray[i];

			if (tmp >= 'a' && tmp <= 'z') {
				lowerCase++;
			}

			if (tmp >= 'A' && tmp <= 'Z') {
				upperCase++;
			}
		}

		System.out.println("Количество прописных букв: " + upperCase);

		System.out.println("Количество строчных букв: " + lowerCase);

	}

	public static String enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку: ");

		return sc.nextLine();
	}
}