package ir.ahmadi.springProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestRequestController {

    @RequestMapping(path = "/")
    public String showBarStudent() {
        return "barStudent";
    }

    @RequestMapping(path = "/name")
    public String a() {
        return "name";
    }

    @RequestMapping(path = "/home")
    public String b() {
        return "home";
    }

    @RequestMapping(path = "/main")
    public String c() {
        return "main";
    }

    @RequestMapping(path = "/one1")
    public String one1() {
        return "one";
    }

    @RequestMapping(path = "/one2")
    public String one2() {
        return "one";
    }
}
