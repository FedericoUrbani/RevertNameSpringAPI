package com.develhope.RevertString.controllers;

import com.develhope.RevertString.services.RevertStringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RevertStringController {
    @Autowired
    RevertStringService revertStringService;

    @GetMapping("/")
    public String usePostPls(){
        return ("use post request in http://localhost:8080/revert/(your name) to see the output");
    }
    @PostMapping(value = "/revert/?{name}")
    public String revertString(@PathVariable(required = false, value = "name") String name){
        return revertStringService.revertStringName(name);
    }


}
