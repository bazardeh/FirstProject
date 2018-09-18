package ir.ahmadi.springProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestRequestController {
    @RequestMapping(path = "/a")
    public String a() {
        return "name";
    }

    @RequestMapping(path = "/b")
    public String b() {
        return "home";
    }

    @RequestMapping(path = "/c")
    public String c() {
        return "main";
    }

    @RequestMapping(path = "/abc")
    public String abc() {
        return "abc";
    }

    @RequestMapping(path = "/abcc")
    public String abcc() {
        return "/abcd";
    }


    @RequestMapping(value = "/abcd", method = RequestMethod.GET)
    public String showLoginPage() {
        return "abcd";
    }

}
