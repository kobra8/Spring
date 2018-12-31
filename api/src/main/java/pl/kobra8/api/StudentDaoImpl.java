package pl.kobra8.api;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


// Implementacja interfejsu Student DAO -> symulujemy bazę danych
@Component // Ta klasa będzie zarządzana przez Springa
public class StudentDaoImpl implements StudentDao {

    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student("Adam", "Kowalski"));
        studentList.add(new Student("Jan", "Nowak"));
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }
}
