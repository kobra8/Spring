package pl.kobra8.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kobra8.api.Student;
import pl.kobra8.api.StudentDao;
import java.util.List;

@RequestMapping("/api/students") //Scieżki dla wszystkich metod poniżej będa takie jak podana w tej lini.
@RestController // Adnotacja do tworzenia API
public class StudentController {

    /*
    Szuka klasy, która implementuje interfejs StudentDao oraz ma adnotację  @Component
    */

    @Autowired
    private StudentDao studentDao; // studentDao = new StudentDaoImpl();


    @GetMapping("")
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @PostMapping("/")
    public Student add(@ModelAttribute Student student) {
        studentDao.addStudent(student);
        return student;
    }

}
