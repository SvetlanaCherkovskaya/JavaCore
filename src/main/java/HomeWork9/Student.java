package HomeWork9;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Course> courses;


    public Student(String name, Course... nameCourse) {
        this.name = name;
        courses = new ArrayList<>();
        for (int i = 0; i < nameCourse.length; i++) {
            courses.add(nameCourse[i]);
        }
    }

    public void addCourse(Course nameCourse) {
        courses.add(nameCourse);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
