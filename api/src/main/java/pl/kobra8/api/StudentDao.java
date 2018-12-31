package pl.kobra8.api;

import java.util.List;


//DAO - Data Access Object - warstwa interfejsu definiująca dostęp do danych -> wzorzec projektowy
public interface StudentDao {


    void addStudent(Student student);
        List<Student> findAll();

}
