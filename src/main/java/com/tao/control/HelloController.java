package com.tao.control;

import com.tao.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String say(){
        return person.toString();
    }
}
