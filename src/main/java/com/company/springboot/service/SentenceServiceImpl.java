package com.company.springboot.service;

import com.company.springboot.entity.Sentence;
import com.company.springboot.entity.Text;
import com.company.springboot.repository.SentenceRepository;
import com.company.springboot.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SentenceServiceImpl implements SentenceService {
    private SentenceRepository sentenceRepository;
    private TextRepository textRepository;

    @Autowired
    public SentenceServiceImpl(SentenceRepository sentenceRepository, TextRepository textRepository) {
        this.sentenceRepository = sentenceRepository;
        this.textRepository = textRepository;
    }

    @Override
    public List<Sentence> getAllSentences() {
        return sentenceRepository.findAll();
    }

    @Override
    public Sentence saveSentence(String data, int textId) {
        Text text = textRepository.findById(textId).orElseThrow(IllegalArgumentException::new);
        Sentence sentence = new Sentence(data, text);
        return sentenceRepository.save(sentence);
    }

    @Override
    public List<Sentence> parseStringToSentences(String inputString, int textId) {
        String[] arr = inputString.split("((\\.++)|(\\?++)|([!]++))(\\s++)");
        List<Sentence> result = new ArrayList<>();
        for (String data : arr) {
            result.add(saveSentence(data, textId));
        }
        return result;
    }
}
