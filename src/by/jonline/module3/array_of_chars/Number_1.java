package by.jonline.module3.array_of_chars;

/*Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.*/

public class Number_1 {
	public static void main(String[] args) {

		String[] camelCase = { "firstString", "newArray", "sumOfDigits", "oneByOne", "myFirstVar" };

		String[] snake_case = new String[camelCase.length];

		for (int i = 0; i < camelCase.length; i++) {

			String[] tempArray = camelCase[i].split("(?=[A-Z])");
			String tempString = "";

			for (int j = 0; j < tempArray.length; j++) {
				if (j == tempArray.length - 1) {

					tempString += tempArray[j];
					break;
				}

				tempString += tempArray[j] + "_";
			}

			snake_case[i] = tempString.toLowerCase();

		}

		for (int i = 0; i < snake_case.length; i++) {
			System.out.print(snake_case[i] + ";  ");
		}

	}
}
