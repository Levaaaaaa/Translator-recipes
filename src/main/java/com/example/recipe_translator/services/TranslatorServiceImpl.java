package com.example.recipe_translator.services;

import com.example.recipe_translator.dto.TranslateStringRequest;
import com.example.recipe_translator.dto.TranslateStringResponse;
import org.springframework.stereotype.Component;
import space.dynomake.libretranslate.Language;
import space.dynomake.libretranslate.Translator;

@Component
class TranslatorServiceImpl implements TranslatorService{
    public TranslateStringResponse translate(TranslateStringRequest request) {
        return new TranslateStringResponse(Translator.translate(Language.RUSSIAN, Language.SPANISH, request.getStr()));
    }
}
