package by.jonline.module3.array_of_chars;

import java.util.Scanner;

/*В строке найти количество цифр.*/

public class Number_3 {
	public static void main(String[] args) {

		String str = enterFromConsole();

		String[] strArray = str.split("\\D+");

		int sum = 0;

		for (int i = 0; i < strArray.length; i++) {
			sum += strArray[i].length();
		}

		System.out.println("В данной строке следующее количество цифр: " + sum);

	}

	public static String enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку: ");

		return sc.nextLine();
	}

}
