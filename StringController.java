package com.exemplo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.springboot.util.StringUtil;

@RestController
public class StringController {

    @GetMapping("/inverter/{texto}")
    public String inverterString(@PathVariable String texto) {
        return StringUtil.inverterString(texto);
    }
}