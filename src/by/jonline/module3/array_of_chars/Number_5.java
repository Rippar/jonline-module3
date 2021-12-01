package by.jonline.module3.array_of_chars;

import java.util.Scanner;

/*Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.*/

public class Number_5 {
	public static void main(String[] args) {
		
		String str = enterFromConsole();

		str = str.trim();

		str = str.replaceAll("\\s+", " ");

		System.out.println(str);

	}

	public static String enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку: ");

		return sc.nextLine();
	}
}
