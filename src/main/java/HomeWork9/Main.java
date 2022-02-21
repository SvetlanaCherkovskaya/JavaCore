package HomeWork9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("English");
        Course course2 = new Course("Python");
        Course course3 = new Course("Java");
        Course course4 = new Course("Linux");
        Course course5 = new Course("Data Base");
        Course course6 = new Course("C#");


        Student student1 = new Student("Petrova", course1, course2, course5);
        Student student2 = new Student("Ivanova", course1, course2, course3, course4);
        Student student3 = new Student("Sidorov", course2, course3, course4);
        Student student4 = new Student("Pavlov", course5, course6);
        Student student5 = new Student("Klimov", course6);

        //System.out.println(student1);

        List<Student> allStudents = new ArrayList<>();
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);
        allStudents.add(student5);

        //System.out.println(allStudents);

        List<String> listOfUniqCourses =
                allStudents.stream()
                        .map(e -> e.getCourses())
                        .flatMap(e -> e.stream())
                        .map(e -> e.getCourse())
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println(listOfUniqCourses);

        List<String> listOfBestStudents =
                allStudents.stream()
                        .sorted((e1, e2) -> e2.getCourses().size() - e1.getCourses().size())
                        .limit(3)
                        .map(e -> e.getName())
                        .collect(Collectors.toList());
        System.out.println(listOfBestStudents);

        System.out.println(getStudentsAtCourse(allStudents, course1));
    }

    public static List<String> getStudentsAtCourse(List<Student> students, Course course) {
        List<String> studentsAtCourse =
                students.stream()
                        .filter(e -> e.getCourses().contains(course))
                        .map(e -> e.getName())
                        .collect(Collectors.toList());
        return studentsAtCourse;
    }
}

