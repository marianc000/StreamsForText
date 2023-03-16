package strings;

import java.util.stream.Collectors;

public class String2 {
 
    public static void main(String[] args) {
var str = """
        One
        Two
        Three
        """;

var str2 = str.lines().collect(Collectors.joining());
System.out.println(str2); // OneTwoThree
    }
}
