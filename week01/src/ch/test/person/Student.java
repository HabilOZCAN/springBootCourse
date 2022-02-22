package ch.test.person;

import java.time.LocalDate;

public class Student extends Person {
    private LocalDate birthDate;

    public Student(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName);
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.getFirstName() + '\'' + " " +
                "lastName='" + super.getLastName() + '\'' + " " +
                "birthDate=" + birthDate +
                '}';
    }
}
