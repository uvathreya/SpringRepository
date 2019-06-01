package org.spring.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping(value = "/login")
    @ResponseBody
    public String sayHello() {
        return "hello world dummy";
    }

    @RequestMapping("/login2")
    public String loginMessage(){
        return "login";
    }
}
