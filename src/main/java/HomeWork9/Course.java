package HomeWork9;

public class Course {
    String course;

    public Course(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course='" + course + '\'' +
                '}';
    }
}
