package by.jonline.module3.array_of_chars;

import java.util.Scanner;

/*В строке найти количество чисел.*/

public class Number_4 {
	public static void main(String[] args) {

		String str = enterFromConsole();

		String[] strArray = str.split("\\D+");

		int sum = strArray.length;

		System.out.println("В данной строке следующее количество чисел:  " + sum);

	}

	public static String enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку: ");

		return sc.nextLine();
	}
}
