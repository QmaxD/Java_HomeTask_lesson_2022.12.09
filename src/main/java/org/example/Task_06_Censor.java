package org.example;

public class Task_06_Censor {
    private String text = "";

    public Task_06_Censor() {}
    public Task_06_Censor(String text) {
        this.text = text;
        System.out.println("* Задача 6: Напишите метод, " +
                "заменяющий в тексте все вхождения определенной фразы на «[вырезано цензурой]».");
    }

    public void CensuringPlease(String[] censoredWords) {
        String censor = "[вырезано цензурой]";

        for (int i = 0; i < censoredWords.length; i++)
            text = text.replace(censoredWords[i], censor);
        System.out.println(text);
    }



}
