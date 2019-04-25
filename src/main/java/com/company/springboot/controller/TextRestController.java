package com.company.springboot.controller;

import com.company.springboot.entity.Text;
import com.company.springboot.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/texts")
public class TextRestController {
    private TextService textService;

    @Autowired
    public TextRestController(TextService textService) {
        this.textService = textService;
    }

    @GetMapping()
    List<Text> getAllTexts() {
        return textService.getAllTexts();
    }

    @PostMapping
    Text saveText(@RequestParam String name){
        return textService.saveText(name);
    }

}
