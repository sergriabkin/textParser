package com.company.springboot.service;

import com.company.springboot.entity.Sentence;

import java.util.List;

public interface SentenceService {
    List<Sentence> getAllSentences();
    Sentence saveSentence(String data, int textId);
    List<Sentence> parseStringToSentences(String inputString, int textId);
}
