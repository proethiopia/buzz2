public class Backcode {
  private static String lastword;
  private static int lastLength;
  public static int getlastindex(String input) {
    // Split the input string into an array of words using whitespace as the
    // delimiter
    String[] words = input.split("\\s+");

    // Get the length of the words array, which represents the number of words
    // in the input string
    int d = words.length;

    // Check if the array is empty
    if (d > 0) {
      lastLength = words[d - 1].length();
      lastword = words[d - 1];

      return lastLength;
    } else {
      // Handle the case when there are no words in the input string
      return 0;
    }
  }
  public static String getlastword() { return lastword; }
  public static String getIntro() {
    String intro =
        "           \n\n"
        + "                     ---.           ,---.\n"
        + "                    / /\"`.\\.--\"\"\"--./,'\"\\ \n"
        + "                    \\ \\    _       _    / /\n"
        + "                     `./  / __   __ \\  \\,'\n"
        + "                      /    /_O)_(_O\\    \\\n"
        + "                      |  .-'  ___  `-.  |\n"
        + "                   .--|       \\_/       |--.\n"
        + "                 ,'    \\   \\   |   /   /    `.\n"
        + "                /       `.  `--^--'  ,'       \\\n"
        + "             .-\"\"\"\"\"\"-.    `--.___.--'     .-\"\"\"\"\"\"-.\n"
        +
        ".-----------/         \\------------------/         \\--------------.\n"
        +
        "| .---------\\         /----------------- \\         /------------. |\n"
        +
        "| |          `-`--`--'                    `--'--'-'             | |\n"
        +
        "| |                                                             | |\n"
        + "| |     " + formatWord(lastword) + ""
        + " " + formatSpace(lastword) + " |\n"
        +
        "| |                                                             | |\n"
        +
        "| |                                                             | |\n"
        +
        "| |                                                             | |\n"
        +
        "| |                                                             | |\n"
        +
        "| |                                                             | |\n"
        +
        "| |                                                             | |\n"
        +
        "| |                                                             | |\n"
        +
        "| |                                                             | |\n"
        +
        "| |                                                             | |\n"
        +
        "| |                                                             | |\n"
        +
        "| |                                                             | |\n"
        +
        "| |                                                             | |\n"
        +
        "| |                                                             | |\n"
        +
        "| |_____________________________________________________________| |\n"
        +
        "|_________________________________________________________________|\n"
        + "                   )__________|__|__________(\n"
        + "                  |            ||            |\n"
        + "                  |____________||____________|\n"
        + "                    ),-----.(      ),-----.(\n"
        + "                  ,'   ==.   \\    /  .==    `.\n"
        + "                 /            )  (            \\\n"
        + "                 `==========='    `==========='  hjw\n"
        + "                      ";
    return intro;
  }
  public static String formatWord(String word) {
    int diff = word.length();
    StringBuilder formattedWord = new StringBuilder();
    formattedWord.append("=>  " + word + " end length " + diff);
    for (int i = 0; i < diff; i++) {
      // formattedWord.append(" ");
    }
    return formattedWord.toString();
  }

  public static String formatSpace(String word) {
    int diff = 39 - word.length();
    StringBuilder space = new StringBuilder();
    for (int i = 0; i < diff; i++) {
      space.append(" ");
    }
    return space.toString();
  }
}
