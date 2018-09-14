package ir.ahmadi.springProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestController {
    @RequestMapping(path = "/a")
    public String a() {
        return "/name.html";
    }

    @RequestMapping(path = "/b")
    public String b() {
        return "/home.html";
    }

    @RequestMapping(path = "/c")
    public String c() {
        return "/home2.html";
    }

}
