package by.jonline.module3.string_stringbuilder;

import java.util.Scanner;

/*Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
Случай, когда самых длинных слов может быть несколько, не обрабатывать.*/

public class Number_8 {
	public static void main(String[] args) {

		String str = enterFromConsole();

		String[] strArray = str.split("\\s+");

		int max = 0;

		String longestWord = "";
		String nextLongestWord = "";

		for (int i = 0; i < strArray.length; i++) {

			if (strArray[i].codePointCount(0, strArray[i].length()) >= max) { 

				max = strArray[i].codePointCount(0, strArray[i].length());

				nextLongestWord = longestWord;

				longestWord = strArray[i];

			}

		}

		if (longestWord.length() == 0) {
			System.out.println("Введенная строка пуста");
		}

		else if (longestWord.length() == nextLongestWord.length()) {
			System.out.println(
					"В введенной строке найдено несколько слов с максимальной длиной. Выполнение программы прекращено.");

		} else {
			System.out.println("Самое длинное введенное слово: " + longestWord);
		}

	}

	public static String enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку: ");

		return sc.nextLine();
	}
}