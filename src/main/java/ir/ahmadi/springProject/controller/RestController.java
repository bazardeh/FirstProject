package ir.ahmadi.springProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestController {
    @RequestMapping(path = "/test")
    public String test() {
        return "/home.html";
    }
}
