package com.example.serveltgameprojectjr.model;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    @Test
    void getChoice() {
        Map<String, Data.Pair> expectedChoice = new HashMap<>();
        expectedChoice.put("Играть в игру?", new Data.Pair("Играть", "Отказаться"));
        expectedChoice.put("Ты отказался. Поражение", null);
        expectedChoice.put("Сделать ход", new Data.Pair("Сходить", "Уйти"));
        expectedChoice.put("Ты не осилил игру. Поражение", null);
        expectedChoice.put("Парировать ход?", new Data.Pair("Сделать Шах и Мат", "Сходить пешкой"));
        expectedChoice.put("Ты победил. Победа", null);
        expectedChoice.put("Тебе поставили Шах и Мат. Поражение", null);
        assertEquals(expectedChoice, new Data().getChoice());
    }

    @Test
    void getAnswers() {
        Map<String, String> expectedAnswers = new HashMap<>();
        expectedAnswers.put("Играть", "Сделать ход");
        expectedAnswers.put("Отказаться", "Ты отказался. Поражение");
        expectedAnswers.put("Сходить", "Парировать ход?");
        expectedAnswers.put("Уйти", "Ты не осилил игру. Поражение");
        expectedAnswers.put("Сделать Шах и Мат", "Ты победил. Победа");
        expectedAnswers.put("Сходить пешкой", "Тебе поставили Шах и Мат. Поражение");
        assertEquals(expectedAnswers, new Data().getAnswers());
    }

    @Test
    void getQuests() {
        Map<String, String> expectedquests = new HashMap<>();
        expectedquests.put("Играть в игру?", "Какой то мужик позвал играть тебя в шахматы. Пойдешь играть?");
        expectedquests.put("Ты отказался. Поражение", "Мужик крикнул тебе в след, что ТЫ ДАЖЕ НЕ ГРАЖДАНИН!!!");
        expectedquests.put("Сделать ход", "Перед тобой начатая партия. Нужно сделать ход.");
        expectedquests.put("Ты не осилил игру. Поражение", "Мужик крикнул тебе в след, что ТЫ ДАЖЕ НЕ ГРАЖДАНИН!!!");
        expectedquests.put("Парировать ход?", "Мужик сходил ответно. Тебе стоит задуться и сходить правильно для победы.");
        expectedquests.put("Ты победил. Победа", "Мужик собирает доску и идет помой. А ты продолжаешь наслаждаться вечером на набережной.");
        expectedquests.put("Тебе поставили Шах и Мат. Поражение", "Ну чтож, бывает. Но ТЫ ДАЖЕ НЕ ГРАЖДАНИН!!!");
        assertEquals(expectedquests, new Data().getQuests());
    }
}