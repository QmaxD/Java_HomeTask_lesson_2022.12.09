package org.example;

public class Task_06_Censor {
    private String text = "";

    public Task_06_Censor() {}
    public Task_06_Censor(String text) {
        this.text = text;
        System.out.println("* Задача 6: Напишите метод, " +
                "заменяющий в тексте все вхождения определенной фразы на «[вырезано цензурой]».");
    }

    public void CensuringPlease() {
        String c = "XAXA";
        String cc = "[вырезано цензурой]";

        System.out.println(text.replace(c, cc));
    }



}
