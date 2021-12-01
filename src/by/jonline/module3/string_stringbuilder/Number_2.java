package by.jonline.module3.string_stringbuilder;

import java.util.Scanner;

/*В строке вставить после каждого символа 'a' символ 'b'*/

public class Number_2 {
	public static void main(String[] args) {

		String str = enterFromConsole();

		str = str.replace("a", "ab");

		System.out.println(str);

	}

	public static String enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку:  ");

		return sc.nextLine();
	}

}
