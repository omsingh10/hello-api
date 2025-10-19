package human_1.hello_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students") // MongoDB collection name
public class Student {

    @Id
    private String id;

    private String name;
    private int age;
    private String course;
    private double marks;
    private double attendance;

    // Constructors
    public Student() {
    }

    public Student(String name, int age, String course, double marks, double attendance) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
        this.attendance = attendance;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }
}
