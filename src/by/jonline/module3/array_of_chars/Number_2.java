package by.jonline.module3.array_of_chars;

import java.util.Scanner;

/*Заменить в строке все вхождения 'word' на 'letter'*/

public class Number_2 {
	public static void main(String[] args) {

		String str = enterFromConsole();

		str = str.replace("word", "letter");

		System.out.println(str);

	}

	public static String enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку:  ");

		return sc.nextLine();
	}
}
