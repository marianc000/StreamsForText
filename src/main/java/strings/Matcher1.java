package strings;

import java.io.IOException;
import java.util.LinkedList;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class Matcher1 {
 

    public static void main(String[] args) throws IOException {
        var str = """
 List<String> results = stream
        .filter(s -> pattern.matcher(s).matches()).toList();
        """;

        var m = Pattern.compile("[\\p{L}]+").matcher(str); // letters

        var words = new LinkedList<>();
        while (m.find()) {
            words.add(m.group());
        }
        System.out.println(words);
// [List, String, results, stream, filter, s, pattern, matcher, s, matches, toList]

        m.reset();

        var words2 = m.results().map(MatchResult::group).toList();

        System.out.println(words2);
// [List, String, results, stream, filter, s, pattern, matcher, s, matches, toList]

      
    }

}
