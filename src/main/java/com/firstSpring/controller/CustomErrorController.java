package com.firstSpring.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController {

    @RequestMapping("/error-custom")
    public String handleError(HttpServletRequest request, Model model) {
        Throwable ex = (Throwable) request.getAttribute("javax.servlet.error.exception");
        String message = (ex != null) ? ex.getMessage() : "Unknown error";

        model.addAttribute("message", message);

        return "error"; // Thymeleaf template error.html under templates/
    }
}


