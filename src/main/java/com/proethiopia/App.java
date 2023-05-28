package com.proethiopia;

/**
 * Hello world!
 *
 */
/* Online Java Compiler and Editor */
import java.util.Scanner;
public class App {

  public static void main(String[] args) {
    int maxwords = 0;
    String sentenceWithMaxWords = "";
    try (Scanner in = new Scanner(System.in)) {
      System.out.println("Please enter a sentence first  :");
      String sentence1 = in.nextLine();
      System.out.println("Please enter a sentence second  :");
      String sentence2 = in.nextLine();

      System.out.println("Please enter a sentence last :");
      String sentence3 = in.nextLine();
      String sentences[] = {sentence1, sentence3, sentence2};

      for (String sentence : sentences) {
        int wordCount = countWords(sentence);
        if (wordCount > maxwords) {
          maxwords = wordCount;
          sentenceWithMaxWords = sentence;
        }
      }
    }
    System.out.println("sentence that has max word is = > " +
                       sentenceWithMaxWords);
    System.out.println("and its length =>  " + maxwords);
  }
  private static int countWords(String sentence) {
    String[] words = sentence.trim().split("\\s+");
    return words.length;
  }
}
