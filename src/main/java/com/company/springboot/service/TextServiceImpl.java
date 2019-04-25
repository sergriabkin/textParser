package com.company.springboot.service;

import com.company.springboot.entity.Text;
import com.company.springboot.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextServiceImpl implements TextService {
    private TextRepository textRepository;

    @Autowired
    public TextServiceImpl(TextRepository textRepository) {
        this.textRepository = textRepository;
    }

    @Override
    public List<Text> getAllTexts() {
        return textRepository.findAll();
    }

    @Override
    public Text saveText(String name) {
        return textRepository.save(new Text(name));
    }
}
