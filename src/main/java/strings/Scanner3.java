package strings;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class Scanner3 {

    public static void main(String[] args) throws IOException {
var str = """
          List<String> results = stream
              .filter(s -> pattern.matcher(s).matches()).toList();
           """;

var words = new Scanner(str).findAll("[\\p{L}]+").map(MatchResult::group).toList();

System.out.println(words);
// [List, String, results, stream, filter, s, pattern, matcher, s, matches, toList]

    }

}
