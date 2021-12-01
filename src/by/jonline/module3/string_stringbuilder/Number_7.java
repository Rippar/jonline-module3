package by.jonline.module3.string_stringbuilder;

import java.util.Scanner;

/*Вводится строка. Требуется удалить из нее повторяющиеся символы и пробелы. Например, если было введено 
"abc cde def", то должно быть выведено "abcdef".*/

public class Number_7 {
	public static void main(String[] args) {

		String str = enterFromConsole();

		str = str.replaceAll("\\s+", "");

		String str1 = "";

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			char[] tmp = str1.toCharArray();

			boolean flag = true;

			for (int j = 0; j < tmp.length; j++) {

				if (Character.toLowerCase(ch[i]) == Character.toLowerCase(tmp[j])) {

					flag = false;

					break;
				}
			}

			if (flag) {

				str1 += ch[i];
			}
		}

		System.out.println(str1);

	}

	public static String enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку: ");

		return sc.nextLine();
	}
}