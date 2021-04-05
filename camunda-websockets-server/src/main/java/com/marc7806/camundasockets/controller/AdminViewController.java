package com.marc7806.camundasockets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/camunda-websockets/admin")
public class AdminViewController {
    @GetMapping
    public String getAdminPage() {
        return "admin";
    }
}
