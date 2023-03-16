package strings;

import java.io.IOException;
import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) throws IOException {

var str = """
          List<String> results = stream
            .filter(s -> pattern.matcher(s).matches()).toList();
          """;

var words = new Scanner(str).useDelimiter("[^\\p{L}]+")
        .tokens().distinct().sorted().toList();

System.out.println(words);
// [List, String, filter, matcher, matches, pattern, results, s, stream, toList]
    }

}
