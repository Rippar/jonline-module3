package by.jonline.module3.regex;

/*Дана строка, содержащая следующий текст (xml-документ). Напишите анализатор, позволяющий последовательно возвращать 
содержимое узлов xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела). 
Пользоваться готовыми парсерами XML для решения данной задачи нельзя.*/

public class Number_2 {
	public static void main(String[] args) {

		String xml = "<notes>\n" + 
		        "<note id = \"1\">\n" + 
				"<to>Вася</to>\n" + 
		        "<from>Света</from>\n"+ 
				"<heading>Напоминание</heading>\n" + 
		        "<body>Позвони мне завтра!</body>\n" + 
				"</note>\n"+ 
		        "<note id = \"2\">\n" + 
				"<to>Петя</to>\n" + 
				"<from>Маша</from>\n"+ 
				"<heading>Важное напоминание</heading>\n" + 
				"<body />\n" + 
				"</note>\n" + 
				"</notes>";

		String openingTag = "<[^/].*?>"; 

		String closingTag = "</.*?>"; 

		String selfClosingTag = "<[^/].*?\\s/>"; 

		String[] lines = xml.split("\n");

		for (int i = 0; i < lines.length; i++) {

			String[] units = lines[i].split("(?<=>)|(?=<)");

			for (int j = 0; j < units.length; j++) {

				if (units[j].matches(selfClosingTag)) {
					System.out.println("тег без тела : " + units[j]);
					continue;

				} else if (units[j].matches(openingTag)) {
					System.out.println("открывающий тег:  " + units[j]);
					continue;
					
				} else if (units[j].matches(closingTag)) {
					System.out.println("закрывающий тег:  " + units[j]);
					
				} else {
					System.out.println("содержимое тега:  " + units[j]);
				}

			}

		}

	}

}
