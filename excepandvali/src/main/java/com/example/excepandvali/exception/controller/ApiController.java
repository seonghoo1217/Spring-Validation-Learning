
package com.example.excepandvali.exception.controller;

import com.example.excepandvali.exception.dto.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("/api/v1")
@Validated
public class ApiController {

    @GetMapping("/user") // ?name=1234
    public User get(

            @Size(min = 2)
            @RequestParam String name,

            @NotNull
            @Min(1)
            @RequestParam Integer age){
        User user = new User();
        user.setName(name);
        user.setAge(age);

        return user;
    }


    @PostMapping("/user")
    public User post(@Valid @RequestBody User user){
        System.out.println(user);
        return user;
    }

}