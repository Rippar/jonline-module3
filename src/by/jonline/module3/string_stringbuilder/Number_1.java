package by.jonline.module3.string_stringbuilder;

import java.util.Scanner;

/*Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.*/

public class Number_1 {
	public static void main(String[] args) {

		String str = enterFromConsole();

		String[] spaceArray = str.split("\\S+"); // создаем массив пробельных символов из исходной строки

		int max = 0;

		for (int i = 0; i < spaceArray.length; i++) {

			if (spaceArray[i].length() > max) {

				max = spaceArray[i].length();
			}
		}

		System.out.println("Наибольшее количество идущих подряд пробельных символов: " + max);

	}

	public static String enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку: ");

		return sc.nextLine();
	}

}
