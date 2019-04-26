package com.company.springboot.controller;

import com.company.springboot.entity.Sentence;
import com.company.springboot.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/sentences")
public class SentenceController {
    private SentenceService sentenceService;

    @Autowired
    public SentenceController(SentenceService sentenceService) {
        this.sentenceService = sentenceService;
    }

    @GetMapping
    public String getAllSentences(Map<String, Object> model) {
        List<Sentence> sentences = sentenceService.getAllSentences();

        model.put("sentences", sentences);

        return "main";
    }

    @PostMapping
    String parseStringToSentences(@RequestParam int textId, @RequestParam String inputString, Map<String, Object> model){
        List<Sentence> sentences = sentenceService.parseStringToSentences(inputString, textId);

        model.put("sentences", sentences);
        return "main";
    }

}
