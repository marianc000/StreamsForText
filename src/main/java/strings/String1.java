package strings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class String1 {

    public static void main(String[] args) throws IOException {
        var str = "Is ☺ the same as 😊?";

        System.out.println(str.codePoints().count() + "," + str.chars().count());

        var distinctChars = str.codePoints().distinct().sorted()
                .mapToObj(Character::toString).toList();

        Files.writeString(Paths.get("src/main/resources/1"), distinctChars.toString());
        // [ , ?, I, a, e, h, m, s, t, ☺, 😊]
    }
}
