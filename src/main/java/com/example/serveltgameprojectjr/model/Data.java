package com.example.serveltgameprojectjr.model;


import java.util.HashMap;
import java.util.Map;

public class Data {
    private final Map<String, Pair> choice = new HashMap<>();
    private final Map<String, String> answers = new HashMap<>();
    private final Map<String, String> quests = new HashMap<>();


    {
        choice.put("Играть в игру?", new Pair("Играть", "Отказаться"));
        choice.put("Ты отказался. Поражение", null);
        choice.put("Сделать ход", new Pair("Сходить", "Уйти"));
        choice.put("Ты не осилил игру. Поражение", null);
        choice.put("Парировать ход?", new Pair("Сделать Шах и Мат", "Сходить пешкой"));
        choice.put("Ты победил. Победа", null);
        choice.put("Тебе поставили Шах и Мат. Поражение", null);

        answers.put("Играть", "Сделать ход");
        answers.put("Отказаться", "Ты отказался. Поражение");
        answers.put("Сходить", "Парировать ход?");
        answers.put("Уйти", "Ты не осилил игру. Поражение");
        answers.put("Сделать Шах и Мат", "Ты победил. Победа");
        answers.put("Сходить пешкой", "Тебе поставили Шах и Мат. Поражение");

        quests.put("Играть в игру?", "Какой то мужик позвал играть тебя в шахматы. Пойдешь играть?");
        quests.put("Ты отказался. Поражение", "Мужик крикнул тебе в след, что ТЫ ДАЖЕ НЕ ГРАЖДАНИН!!!");
        quests.put("Сделать ход", "Перед тобой начатая партия. Нужно сделать ход.");
        quests.put("Ты не осилил игру. Поражение", "Мужик крикнул тебе в след, что ТЫ ДАЖЕ НЕ ГРАЖДАНИН!!!");
        quests.put("Парировать ход?", "Мужик сходил ответно. Тебе стоит задуться и сходить правильно для победы.");
        quests.put("Ты победил. Победа", "Мужик собирает доску и идет помой. А ты продолжаешь наслаждаться вечером на набережной.");
        quests.put("Тебе поставили Шах и Мат. Поражение", "Ну чтож, бывает. Но ТЫ ДАЖЕ НЕ ГРАЖДАНИН!!!");
    }

    public static class Pair {
        private final String str1, str2;

        public Pair(String str1, String str2) {
            this.str1 = str1;
            this.str2 = str2;
        }

        public String getStr1() {
            return str1;
        }

        public String getStr2() {
            return str2;
        }

    }

    public Map<String, Pair> getChoice() {
        return choice;
    }

    public Map<String, String> getAnswers() {
        return answers;
    }

    public Map<String, String> getQuests() {
        return quests;
    }
}