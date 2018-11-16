package ir.ahmadi.springProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestRequestController {

    @RequestMapping(path = "/")
    public String showLoginPage() {
        return "loginPage";
    }

    @RequestMapping(path = "/table")
    public String table() {
        return "table";
    }

    @RequestMapping(path = "/home")
    public String b() {
        return "home";
    }

    @RequestMapping(path = "/main")
    public String c() {
        return "main";
    }

    @RequestMapping(path = "/barStudent")
    public String barStudent() {
        return "barStudent";
    }

    @RequestMapping(path = "/loginPage2")
    public String loginPage2() {
        return "loginPage2";
    }

    @RequestMapping(path = "/homePage")
    public String homePage() {
        return "homePage";
    }
}
