package com.company.springboot.service;

import com.company.springboot.entity.Text;

import java.util.List;

public interface TextService {
    List<Text> getAllTexts();
    Text saveText(String name);
}
