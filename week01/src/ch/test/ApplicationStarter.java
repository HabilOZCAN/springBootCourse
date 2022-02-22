package ch.test;

import ch.test.person.Student;
import ch.test.person.Teacher;
import ch.test.place.Classroom;

import java.time.LocalDate;
import java.util.List;

public class ApplicationStarter {
    //her public class kendi dosyasında yasar
    public static void main(String[] args) {
        Student student1 = new Student("habil", "ozcan", LocalDate.of(2020, 1, 8));
        System.out.println(student1);
        Teacher teacher1 = new Teacher("Hamza", "tasdelen", LocalDate.of(1990, 1, 8));
        teacher1.setCourses(List.of("Math", "Turkce"));
        System.out.println(teacher1);

        Classroom classroom = new Classroom();
        for (int count = 0; count< 10; count++) {
           classroom.getStudents().add(new Student("isim"+count, "soyisim"+count, LocalDate.now()));
        }
        for (int count = 0; count< 5; count++) {
            classroom.getTeachers().add(new Teacher("isim"+count, "soyisim"+count, LocalDate.now()));
            classroom.getTeachers().get(count).setCourses(List.of("Math"+count,"Eng"+count));
        }

        System.out.println(classroom);
    }
}