package proje;

import java.util.Scanner;

public class reversed_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to reverse: ");
        String word = scanner.nextLine();

        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        System.out.println("Reversed word: " + reversedWord);
    }
}














