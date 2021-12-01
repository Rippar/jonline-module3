package by.jonline.module3.string_stringbuilder;

import java.util.Scanner;

/*Строка Х состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.*/

public class Number_10 {
	public static void main(String[] args) {

		String x = enterFromConsole();

		x = x.replaceAll("\\s+", "");

		char[] ch = x.toCharArray();

		int count = 0;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == '.' || ch[i] == '!' || ch[i] == '?') {
				count++;
			}

		}

		System.out.println("Количество предложений в строке: " + count);

	}

	public static String enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку: ");

		return sc.nextLine();
	}

}
