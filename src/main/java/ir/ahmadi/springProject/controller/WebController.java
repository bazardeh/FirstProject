package ir.ahmadi.springProject.controller;

import com.google.gson.Gson;
import ir.ahmadi.springProject.model.Student;
import ir.ahmadi.springProject.repository.StudentRepository;
import ir.ahmadi.springProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class WebController {

    @Autowired
    StudentService studentService;

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(path = "/")
    public String date() {
        return "date : " + new Date();
    }

    @RequestMapping("/find")
    public String processFind() {
        try {
            Gson gson = new Gson();

            List<Student> allStudent = studentService.findAllStudent();
            String gsonString = gson.toJson(allStudent);
            return gsonString;

        } catch (Exception ee) {
            ee.printStackTrace();
            return "Error";
        }
    }

    @RequestMapping("/save")
    public String processSave(@RequestParam("name") String name, @RequestParam("lastname") String lastname) {
        try {
            name = name.trim();
            lastname = lastname.trim();
            System.out.println("\nname = " + name + " lastname = " + lastname);
            if (name != null && lastname != null) {
                studentRepository.save(new Student(name, lastname));
                return "Save Ok \n\n\n\t\t Count All Student : " + studentService.countAllStudent().toString();
            }
            return "Not save Ok";
        } catch (Exception ee) {
            ee.printStackTrace();
            return "Error save";
        }
    }
}

