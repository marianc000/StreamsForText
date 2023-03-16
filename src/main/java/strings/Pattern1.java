package strings;

import java.io.IOException;
import java.util.regex.Pattern;

public class Pattern1 {

    public static void main(String[] args) throws IOException {

        var str = """
         List<String> results = stream
                .filter(s -> pattern.matcher(s).matches()).toList();
                """;

        var words = Pattern.compile("[^\\p{L}]+") // not letters
                .splitAsStream(str).distinct().sorted().toList();

        System.out.println(words);
// [List, String, filter, matcher, matches, pattern, results, s, stream, toList]

        var words2 = words.stream().filter(Pattern.compile("List").asPredicate()).toList();
        var words3 = words.stream().filter(Pattern.compile("List").asMatchPredicate()).toList();

        System.out.println(words2); // [List, toList]
        System.out.println(words3); // [List]

    }

}
