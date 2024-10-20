package com.example.recipe_translator.services;

import com.example.recipe_translator.dto.TranslateStringRequest;
import com.example.recipe_translator.dto.TranslateStringResponse;
import org.springframework.stereotype.Component;

@Component
public interface TranslatorService {
    public TranslateStringResponse translate(TranslateStringRequest request);
}
