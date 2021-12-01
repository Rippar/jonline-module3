package by.jonline.module3.string_stringbuilder;

/*С помощью функции копирования и операции конкатетации составить из частей слова "информатика" слово "торт".*/

public class Number_4 {
	public static void main(String[] args) {

		String cs = "информатика";

		char[] csArray = cs.toCharArray();

		String cake = "";

		String t = String.valueOf(csArray, 7, 1);

		cake += t;

		cake += String.valueOf(csArray, 3, 2);

		cake += t;

		System.out.println(cake);

	}

}
