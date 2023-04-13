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

    @GetMapping("/{name}")
    public String usePostPls(@PathVariable String name){
        return name.length() == 0? "put a name at the end of the url to show it" : "your name is "+ name +" now use post request to revert it";
    }
    @PostMapping(value = "/{name}")
    public String revertString(@PathVariable(required = false, value = "name") String name){
        return revertStringService.revertStringName(name);
    }


}
