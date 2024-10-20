package com.example.recipe_translator.rest;

import com.example.recipe_translator.dto.TranslateStringRequest;
import com.example.recipe_translator.dto.TranslateStringResponse;
import com.example.recipe_translator.services.TranslatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleTranslatorController {

    @Autowired
    private TranslatorService translator;

    @PostMapping(path = "/translate", consumes = "application/json", produces = "application/json")
    public TranslateStringResponse translate(@RequestBody TranslateStringRequest request) {
        return translator.translate(request);
    }
}
