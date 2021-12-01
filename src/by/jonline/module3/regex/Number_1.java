package by.jonline.module3.regex;

import java.util.Scanner;

/*Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.*/

public class Number_1 {

	public static void main(String[] args) {

		String s = "Совсем недавно первая в истории криптовалюта Bitcoin достигла своего исторического максимума, поднявшись до отметки в 58400 долларов. В 2017 году огромное количество людей называло криптовалюту пузырем и пирамидой, бурный рост вызывал недоверие и негатив. Так чем же был и стал биткоин? Разбираемся.\n"

				+ "Одной из основных причин популярности биткоина в текущем году стала пандемия COVID 19. Обрушение мировой экономики в результате карантинных мер заставило ведущие мировые ЦБ идти на беспрецедентные меры по спасению и поддержке экономики путем эмиссии триллионов долларов необеспеченных денег.\n"

				+ "Разумеется, это отражается на американском долларе, который обесценивается по отношению к ведущим мировым валютам. Нулевые процентные ставки привлекают людей чаще брать кредиты, делать вклады невыгодно, как и инвестировать в облигации, чья доходность практически равна нулю. Единственным источником получения прибыли стали так называемые рисковые активы: фондовые рынки и криптовалюты.\n"

				+ "Фондовые рынки, как и криптовалюты, обеспечили инвесторам высокую прибыль, но если акции компаний используются в качестве инвестиционного актива, то биткоин и другие криптовалюты используются также и в качестве дефляционного актива, который позволяет уберечь капитал от обесценивания.";

		String[] paragraphs = s.split("\n");

		int button = enterNumFromConsole();

		if (button == 1) { // 1-я операция: сортировка абзацев по убыванию количества предложений и
							// вывод результата

			sortingParagraphs(paragraphs);

			printResult(paragraphs);

		} else if (button == 2) { // 2-я операция: Сортировка слов по убыванию их длины в каждом предложении
									// (без учета знаков препинания) и вывод результата

			for (int i = 0; i < paragraphs.length; i++) {

				String[] sentences = paragrToSentenceArray(paragraphs[i]);

				for (int j = 0; j < sentences.length; j++) {

					sentences[j] = sortingWordsByLength(sentences[j]);
				}

				paragraphs[i] = sentencesToParagr(sentences);

			}

			printResult(paragraphs);

		} else if (button == 3) { // 3-я операция: сортировка лексем (слов) в предложении по убыванию количества
									// вхождений заданного символа, а в случае равенства - по алфавиту и вывод
									// результата

			String ch = enterCharFromConsole();

			char[] tmp = ch.toCharArray();
			char searchFor = tmp[0];

			for (int i = 0; i < paragraphs.length; i++) {

				String[] sentences = paragrToSentenceArray(paragraphs[i]);

				for (int j = 0; j < sentences.length; j++) {

					sentences[j] = sortingWordsByChar(sentences[j], searchFor);

				}

				paragraphs[i] = sentencesToParagr(sentences);

			}

			printResult(paragraphs);

		}
	}

	public static void sortingParagraphs(String[] p) {

		int[] len = new int[p.length];

		for (int i = 0; i < p.length; i++) {

			String[] tmp = paragrToSentenceArray(p[i]);
			len[i] = tmp.length;
		}

		sortStringArray(p, len);

	}

	public static String sortingWordsByChar(String sentence, char searchFor) {

		String[] words = sentenceToWordArray(sentence);

		int[] numOfEntries = new int[words.length];

		for (int i = 0; i < words.length; i++) {

			char[] chars = words[i].toCharArray();

			for (int j = 0; j < chars.length; j++) {

				if (Character.toLowerCase(chars[j]) == Character.toLowerCase(searchFor)) {
					numOfEntries[i]++;
				}
			}

		}

		sortStringArray(words, numOfEntries);

		return wordsToSentence(words);

	}

	public static String sortingWordsByLength(String sentence) {

		String[] words = sentenceToWordArray(sentence);

		int[] len = new int[words.length];

		for (int i = 0; i < words.length; i++) {

			len[i] = words[i].codePointCount(0, words[i].length());

		}

		sortStringArray(words, len);

		return wordsToSentence(words);

	}

	public static String[] paragrToSentenceArray(String paragraph) {

		String[] result = paragraph.split("[.!?]+");

		return result;
	}

	public static String[] sentenceToWordArray(String sentence) {

		sentence = sentence.replaceAll("\\p{Punct}", "");

		sentence = sentence.trim();

		String[] result = sentence.split("\\s+");

		for (int i = result.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {

				if (result[i].compareToIgnoreCase(result[j]) > 0) {
					String tmp = result[i];
					result[i] = result[j];
					result[j] = tmp;

				}
			}
		}

		return result;
	}

	public static void sortStringArray(String[] str, int[] key) {

		for (int i = str.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (key[j] < key[j + 1]) {

					int tmp = key[j];
					String temp = str[j];

					key[j] = key[j + 1];
					str[j] = str[j + 1];

					key[j + 1] = tmp;
					str[j + 1] = temp;
				}

			}

		}
	}

	public static String wordsToSentence(String[] words) {

		String result = "";

		for (int i = 0; i < words.length; i++) {

			if (i == words.length - 1) {

				result += words[i] + ". ";
				break;
			}

			result += words[i] + " ";

		}

		return result;
	}

	public static String sentencesToParagr(String[] sentences) {

		String result = "";

		for (int i = 0; i < sentences.length; i++) {

			result += sentences[i];
		}

		return result;
	}

	public static void printResult(String[] paragraphs) {

		for (int i = 0; i < paragraphs.length; i++) {

			System.out.println(paragraphs[i]);
			System.out.println("\n");
		}
	}

	public static int enterNumFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Если вы хотите отсортировать абзацы по количеству предложений, введите 1\n"
				+ "2. Если вы хотите в каждом предложении отсортировать слова по длине, введите 2\n"
				+ "3. Если вы хотите отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, введите 3 (Примечание: в случае,\n "
				+ "если данный символ встречается в лексемах равное количество раз (или не встречается ни разу), они будут отсортированы по алфавиту \n");

		while (!sc.hasNext("[1-3]")) {

			System.out.println("Нужно ввести 1, 2 или 3!");
			sc.next();
		}

		return sc.nextInt();
	}

	public static String enterCharFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите символ, по которому будут отсортированы лексемы: ");

		while (!sc.hasNext("[a-zA-Zа-яА-ЯёЁ]")) {

			System.out.println("Введите одиночный буквенный символ!");
			sc.next();
		}

		System.out.println("\n");
		return sc.next();
	}
}
