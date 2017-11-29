package org.myas.jettyspring.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mykhailo Yashchuk
 */
@RestController
public class IncomeController {
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String greet() {
        return "Hi there!";
    }

    @PostMapping("/income")
    @ResponseStatus(HttpStatus.OK)
    public String income(HttpServletRequest request) throws IOException {
        System.out.println("Income");
        request.getReader().lines().forEach(System.out::println);
        return "Received";
    }
}
