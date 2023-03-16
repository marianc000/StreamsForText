package strings;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) throws IOException {
var str = """
  List<String> results = stream
      .filter(s -> pattern.matcher(s).matches()).toList();
          """;

var words = new LinkedList<>();
new Scanner(str).useDelimiter("[^\\p{L}]+").forEachRemaining(words::add);

System.out.println(words);
// [List, String, results, stream, filter, s, pattern, matcher, s, matches, toList]

    }

}
