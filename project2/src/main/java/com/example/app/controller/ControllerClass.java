package com.example.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Negin Mousavi
 */
@RestController
public class ControllerClass {

    @GetMapping("/app")
    @ResponseBody
    public String controller() {
        return "second app";
    }
}
