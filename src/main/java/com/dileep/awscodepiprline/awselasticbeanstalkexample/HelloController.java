package com.dileep.awscodepiprline.awselasticbeanstalkexample;

import com.dileep.awscodepiprline.awselasticbeanstalkexample.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public String Hello(){
        return "Hello Codepipeline";
    }

    @GetMapping("/getPerson")
    public Person getPerson(){
        return new Person("Dileep","28");
    }

}
