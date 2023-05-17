import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    try (var in = new Scanner(System.in)) {
      System.out.println("Please enter a word:");
      String name = in.nextLine();

      int total = backcode.getlastindex(name);

      System.out.println("The last word is " + backcode.getlastword() +
                         " with length " + total);
      System.out.println(backcode.getIntro());
    }
  }
}