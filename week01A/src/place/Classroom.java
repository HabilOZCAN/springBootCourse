package place;

import person.Student;
import person.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private String name = "classroom";
    private String Location = "Bern";

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "students=" + students +
                ", teachers=" + teachers +
                ", name='" + name + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }
}
