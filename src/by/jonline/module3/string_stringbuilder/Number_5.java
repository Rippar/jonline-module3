package by.jonline.module3.string_stringbuilder;

import java.util.Scanner;

/*Подсчитать, сколько раз среди символов заданной строки встречается буква "а"*/

public class Number_5 {
	public static void main(String[] args) {

		String str = enterFromConsole();

		char[] ch = str.toCharArray();

		int count = 0;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'а' || ch[i] == 'A' || ch[i] == '�') {

				count++;
			}
		}

		System.out.println("В данной строке буква 'a' встречается следующее количество раз: " + count);

	}

	public static String enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку: ");

		return sc.nextLine();
	}

}
