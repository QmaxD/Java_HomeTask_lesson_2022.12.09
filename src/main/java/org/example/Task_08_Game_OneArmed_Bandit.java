package org.example;

import java.util.Random;
import java.util.Scanner;

public class Task_08_Game_OneArmed_Bandit {

    private char[] field = new char[3];
    private char[] symbols = new char[] { 'X', 'O', 'V', '%', '*', '=' };
    private int[] prizes = new int[] { 50, 75, 100, 200, 2, 3 };
    private int score = 100;
    private int minimumScore = 5;
    private boolean isEnd = false;
    String music = "src/main/resources/TRON Music - Separate Ways.wav";

    void StartGame () {
        Sound.playSound(music).setVolume(0.6f);// Трон: Наследие https://www.youtube.com/watch?v=w5B-Emlzwx4

        while (score < minimumScore)
            SetScoreFromConsole();
        PrintRegulations();

        Scanner scannerLine = new Scanner(System.in);
        System.out.println("Начинаем играть? Для выхода введите \"exit / e\", для продолжения введите yes / y / да.");
        String inputLine = scannerLine.nextLine();

        if (inputLine.equals("да") || inputLine.equals("yes") || inputLine.equals("y")) {
            while (!isEnd && score >= minimumScore) {
                score -= minimumScore;
                SpinDrums();

                if (Scoring() > 0) {
                    System.out.println(FontColor.ANSI_GREEN + "Выигрыш есть - можно поесть! Вы выиграли "
                            + Scoring() + " баллов." + FontColor.ANSI_RESET);
                    SetScore(Scoring());
                } else
                    System.out.println(GetWords());
                System.out.println("Очки: " + GetScore());

                inputLine = scannerLine.nextLine();
                if (!IsNextGame(inputLine)) {
                    isEnd = true;
                    Sound.playSound(music).stop();
                    Sound.playSound(music).close();
                }
            }
        }
        scannerLine.close();
        if (isEnd)
            System.out.println("До следующего раза.");
        else
            System.out.println("Что? Все? Иди отсюда, неудачник!");
    }
    private void SpinDrums() {
        Random random = new Random();
        for (int i = 0; i < field.length; i++) {
            int n = random.nextInt(0, 6);
            field[i] = symbols[n];
        }
        for (int i = 0; i < field.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("|");
                    System.out.print(FontColor.ANSI_RED + " " + field[i] + " " + FontColor.ANSI_RESET);
                    break;
                case 1:
                    System.out.print("|");
                    System.out.print(FontColor.ANSI_RED + " " + field[i] + " " + FontColor.ANSI_RESET);
                    System.out.print("|");
                    break;
                case 2:
                    System.out.print(FontColor.ANSI_RED + " " + field[i] + " " + FontColor.ANSI_RESET);
                    System.out.print("|");
                    break;
            }
        }
        System.out.println();
    }
    private int Scoring() {
        int prize = 0;
        if (IsTwoSymbols())
            prize = minimumScore;
        if (IsFullSymbols()) {
            if (GiveSymbols() == GetSymbols(0))
                prize = GetPrizes(0);
            else if (GiveSymbols() == GetSymbols(1))
                prize = GetPrizes(1);
            else if (GiveSymbols() == GetSymbols(2))
                prize = GetPrizes(2);
            else if (GiveSymbols() == GetSymbols(3))
                prize = GetPrizes(3);
            else if (GiveSymbols() == GetSymbols(4))
                prize = GetScore() * (GetPrizes(4) - 1);
            else if (GiveSymbols() == GetSymbols(5))
                prize = GetScore() * (GetPrizes(5) - 1);
            else
                prize = 0;
        }
        return prize;
    }
    private boolean IsFullSymbols() {
        if ( (field[0] == field[1]) && (field[1] == field[2]) && (field[0] == field[2]) )
            return true;
        return false;
    }
    private boolean IsTwoSymbols() {
        if (field[0] == field[1])
            return true;
        if (field[1] == field[2])
            return true;
        if (field[2] == field[0])
            return true;
        return false;
    }
    private char GiveSymbols() {
        return field[0];
    }
    private boolean IsNextGame(String input) {
        if (input.equals("exit") || input.equals("e") || input.equals("е"))
            return false;
        return true;
    }
    private String GetWords() {
        String[] words = new String[] { "Еще разок.", "В другой раз повезет.", "Крути барабаны.",
                                        "Ну бывает...", "Везение вот-вот придет.", "Давай до последнего." };
        Random random = new Random();
        int n = random.nextInt(0, 6);
        return words[n];
    }
    private int GetScore() {
        return score;
    }
    private void SetScore(int prize) {
        score += prize;
    }
    public char GetSymbols(int n) {
        return symbols[n];
    }
    public int GetPrizes(int n) {
        return prizes[n];
    }
    private void SetScoreFromConsole() {
        Scanner scanForScore = new Scanner(System.in);
        System.out.print("Введите количество денег на счету: ");
        int temp = scanForScore.nextInt();
        scanForScore.close();
        if (temp < minimumScore)
            System.out.println("Нужно не менее 5 баллов, чтобы сыграть!");
        else {
            SetScore(temp);
            System.out.println(FontColor.ANSI_GREEN + "На вашем счету сейчас " + score + FontColor.ANSI_RESET);
        }
    }
    private void PrintRegulations () {
        System.out.println(FontColor.ANSI_YELLOW + "Если выпадет два одинаковых знака - вам вернуться ваши деньги за игру!" +
                "Если выпадет три одинаковых знака - бомба!!!\n" +
                symbols[0] + " - получите к счету " + GetPrizes(0) + " очков\n" +
                symbols[1] + " - получите к счету " + GetPrizes(1) + " очков\n" +
                symbols[2] + " - получите к счету " + GetPrizes(2) + " очков\n" +
                symbols[3] + " - получите к счету " + GetPrizes(3) + " очков\n" +
                symbols[4] + " - ваши баллы умножаем в " + GetPrizes(4) + " раза\n" +
                symbols[5] + " - ваши баллы умножаем в " + GetPrizes(5) + " раза\n" +
                "Одна игра стоит " + minimumScore + " баллов. Если у вас нет баллов - валите!" + FontColor.ANSI_RESET);
    }
}
