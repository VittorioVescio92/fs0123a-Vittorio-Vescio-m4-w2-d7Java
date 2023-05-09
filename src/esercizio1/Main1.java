package esercizio1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		while (true) {
			try {
				System.out.println("Inserisci il numero di parole da inserire: ");
				number = scanner.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Input non valido, inserisci un numero positivo!");
			}
		}
		Set<String> words = new HashSet<>();
		Set<String> duplicateWords = new HashSet<>();
		if (number > 0) {
			for (int i = 0; i < number; i++) {
				System.out.println("Inserisci la parola numero " + (i + 1) + ": ");
				String word = scanner.next();
				if (words.contains(word)) {
					duplicateWords.add(word);
				} else {
					words.add(word);
				}
			}
			System.out.println("parole duplicate: " + duplicateWords);
			System.out.println("numero di parole: " + words.size());
			System.out.println("parole distinte: " + words);
		}
		scanner.close();
	}
}
