package strings;

import java.io.IOException;
import java.util.Random;
import java.util.regex.Pattern;

public class Matcher2 {

    static String str = """
Map<Department, Set<Employee>> wellPaidEmployeesByDepartment
              = employees.stream().collect(
                groupingBy(Employee::getDepartment,
                           filtering(e -> e.getSalary() > 2000,
                                     toSet())));
           """;

    public static void main(String[] args) throws IOException {

var str = "Anyone born between 1981 and 1996 is considered a candidate";

var r = new Random();

var str2 = Pattern.compile("[0-9]+").matcher(str)
        .replaceAll(m -> String.valueOf(Integer.parseInt(m.group()) + r.nextInt(5)));

System.out.println(str2);
// Anyone born between 1983 and 1999 is considered a candidate
    }

}
