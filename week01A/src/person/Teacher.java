package person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Student{
    private List<String> courses = new ArrayList<>();
    public Teacher (String firstName, String lastName, LocalDate birthDate){
        super(firstName, lastName, birthDate);
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + super.getFirstName() + '\'' + " " +
                "lastName='" + super.getLastName() + '\'' + " " +
                "birthDate=" + super.getBirthDate() + '\'' + " " +
                "courses=" + this.courses +
                '}';
    }
}
