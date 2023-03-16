package strings;

import java.util.List;
import java.util.stream.Collectors;

public class Collectors1 {

    public static void main(String[] args) {
var strs = List.of("one", "two", "three");
String s1 = strs.stream().collect(Collectors.joining());
// onetwothree

String s2 = strs.stream().collect(Collectors.joining("\t"));
// one	two	three

String s3 = strs.stream().collect(Collectors.joining(",", "{", "}"));
// {one,two,three}

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
