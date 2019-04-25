package com.company.springboot.controller;

import com.company.springboot.entity.Sentence;
import com.company.springboot.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sentences")
public class SentenceRestController {
    private SentenceService sentenceService;

    @Autowired
    public SentenceRestController(SentenceService sentenceService) {
        this.sentenceService = sentenceService;
    }

    @GetMapping()
    List<Sentence> getAllSentences() {
        return sentenceService.getAllSentences();
    }

    @PostMapping("/save")
    Sentence saveSentence(@RequestParam String data, @RequestParam int textId){
        return sentenceService.saveSentence(data, textId);
    }

    @PostMapping("/inputString")
    List<Sentence> parseStringToSentences(@RequestParam String inputString, @RequestParam int textId){
        return sentenceService.parseStringToSentences(inputString, textId);
    }


}
