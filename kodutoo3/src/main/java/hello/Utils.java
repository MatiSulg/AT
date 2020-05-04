package hello;

import java.util.List;

public class Utils {
    public static void studentNames(List<Student> students){
        for (Student student: students) System.out.println(student.getName());
    }
}
