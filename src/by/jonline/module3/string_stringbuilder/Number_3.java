package by.jonline.module3.string_stringbuilder;

import java.util.Scanner;

/*Проверить, является ли заданное слово палиндромом*/

public class Number_3 {
	public static void main(String[] args) {

		String word = enterFromConsole();

		StringBuilder tmp = new StringBuilder(word);

		tmp.reverse();
			
		String reverseWord = tmp.toString();

		if (reverseWord.toLowerCase().contentEquals(word.toLowerCase())) {

			System.out.println("Данное слово является палиндромом");

		} else {
			System.out.println("Данное слово не является палиндромом");
		}

	}

	public static String enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите слово: ");

		return sc.next();
	}

}
