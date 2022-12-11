package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Scanner;

public class Task_09_Caesar_Cipher {
    private int[] englishUpperAlphabetRange = new int[]{65, 90};
    private String englishUpperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";// 65-90
    private int[] englishLowerAlphabetRange = new int[]{97, 122};
    private String englishLowerAlphabet = "abcdefghijklmnopqrstuvwxyz";// 97-122
    private int[] russianUpperAlphabetRange = new int[]{1040, 1071};
    private String russianUpperAlphabet = "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯЁ";// 1040-1071 1025=Ё
    private int[] russianLowerAlphabetRange = new int[]{1072, 1103};
    private String russianLowerAlphabet = "абвгдежзийклмнопрстуфхцчшщъыьэюяё";// 1072-1103 1105=ё

    private double[][] englishLettersRate = new double[][] {
            { 12.7, 9.06, 8.17, 7.51, 6.97, 6.75, 6.33, 6.09, 5.99, 4.25, 4.03, 2.78, 2.76, 2.41, 2.36, 2.23, 2.02, 1.97, 1.93, 1.49, 0.98, 0.77, 0.15, 0.15, 0.1, 0.07 },
            { 101, 116, 97, 111, 105, 110, 115, 104, 114, 100, 108, 99, 117, 109, 119, 102, 103, 121 ,112, 98 ,118, 107, 106, 120 ,113, 122 }
    };
    private double[][] russianLettersRate = new double[][] {
            { 10.97, 8.45, 8.01, 7.35, 6.70, 6.26, 5.47, 4.73, 4.54, 4.40, 3.49, 3.21, 2.98, 2.81, 2.62, 2.01, 1.90, 1.74, 1.70, 1.65, 1.59, 1.44, 1.21, 0.97, 0.94, 0.73, 0.64, 0.48, 0.36, 0.32, 0.26, 0.04 },
            { 1086, 1077, 1072, 1080, 1085, 1090, 1089, 1088, 1074, 1083, 1082, 1084, 1076, 1087, 1091, 1103, 1099, 1100, 1075, 1079, 1073, 1095, 1081, 1093, 1078, 1096, 1102, 1094, 1097, 1101, 1092, 1098 }
    };

    // частота повторения букв в русском
    // https://ru.wikipedia.org/wiki/%D0%A7%D0%B0%D1%81%D1%82%D0%BE%D1%82%D0%BD%D0%BE%D1%81%D1%82%D1%8C
    // частота повторения букв в английском
    // https://eng4school.ru/the_alphabet/687-chastota-vstrechaemosti-bukv.html

    String EncryptText(String text, int shift) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            int temp = text.charAt(i);
            if (text.charAt(i) == 1025 || text.charAt(i) == 1105) {
                switch (text.charAt(i)) {
                    case 1025:
                        temp = 1045;// =Е
                        break;
                    case 1105:
                        temp = 1077;// =е
                        break;
                }
            }
            if (temp >= englishUpperAlphabetRange[0] && temp <= englishUpperAlphabetRange[1]) {
                temp = temp + shift;
                temp = (temp - englishUpperAlphabetRange[0]) % 26 + englishUpperAlphabetRange[0];
            } else if (temp >= englishLowerAlphabetRange[0] && temp <= englishLowerAlphabetRange[1]) {
                temp = temp + shift;
                temp = (temp - englishLowerAlphabetRange[0]) % 26 + englishLowerAlphabetRange[0];
            } else if (temp >= russianUpperAlphabetRange[0] && temp <= russianUpperAlphabetRange[1]) {
                temp = temp + shift;
                temp = (temp - russianUpperAlphabetRange[0]) % 32 + russianUpperAlphabetRange[0];
            } else if (temp >= russianLowerAlphabetRange[0] && temp <= russianLowerAlphabetRange[1]) {
                temp = temp + shift;
                temp = (temp - russianLowerAlphabetRange[0]) % 32 + russianLowerAlphabetRange[0];
            } else {
                // ничего не будем делать
            }
            result += (char)temp;
        }
        return result;
    }

    String DencryptText(String text, int shift) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int temp = text.charAt(i);
            if (temp >= englishUpperAlphabetRange[0] && temp <= englishUpperAlphabetRange[1]) {
                temp = temp - shift;
                temp = (temp - englishUpperAlphabetRange[1]) % 26 + englishUpperAlphabetRange[1];
            } else if (temp >= englishLowerAlphabetRange[0] && temp <= englishLowerAlphabetRange[1]) {
                temp = temp - shift;
                temp = (temp - englishLowerAlphabetRange[1]) % 26 + englishLowerAlphabetRange[1];
            } else if (temp >= russianUpperAlphabetRange[0] && temp <= russianUpperAlphabetRange[1]) {
                temp = temp - shift;
                temp = (temp - russianUpperAlphabetRange[1]) % 32 + russianUpperAlphabetRange[1];
            } else if (temp >= russianLowerAlphabetRange[0] && temp <= russianLowerAlphabetRange[1]) {
                temp = temp - shift;
                temp = (temp - russianLowerAlphabetRange[1]) % 32 + russianLowerAlphabetRange[1];
            } else {
                // ничего не будем делать
            }
            result += (char)temp;
        }
        return result;
    }

    void PickUpCode(String text) {
        text = text.toLowerCase();
        String smallText = text.substring(0, 20);
        boolean isEnd = false;
        boolean isRussianText = false;
        int shift = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Текст рускоязычный? Иначе будет англоязычным. (ответ: да/нет): ");
        String answer = scanner.nextLine();
        if (isNext(answer))
            isRussianText = true;
        System.out.println("Будет подбор ключа. Если вы видите, что текст имеет смысл, пишите \"да\", иначе \"нет\".");

        int i = 0;
        if (isRussianText) {
            int[] rate = russianLettersRepetitionRate(text);
            int maxRate = MaxRate(rate);
            rate[maxRate] = 0;
            while (i < russianLettersRate[1].length && !isEnd) {
                //System.out.println("-->" + maxRate + " " + (char)russianLowerAlphabet.charAt(maxRate));// проверка
                shift = maxRate + russianLowerAlphabetRange[0];
                //System.out.println("-->" + shift + " " + (char)shift);// проверка
                //System.out.println("-->" + (int)russianLettersRate[1][i] + " " + (char)russianLettersRate[1][i]);// проверка
                shift -= (int)russianLettersRate[1][i];
                //System.out.println("-->" + shift);// проверка

                System.out.println("TEXT: " + DencryptText(smallText, shift));
                System.out.print("Текст имеет смысл? (да/нет): ");
                answer = scanner.nextLine();

                if (isNext(answer))
                    isEnd = true;
                i++;
            }
        }
        if (!isRussianText) {
            int[] rate = englishLettersRepetitionRate(text);
            int maxRate = MaxRate(rate);
            rate[maxRate] = 0;
            while (i < englishLettersRate[1].length && !isEnd) {
                System.out.println("-->" + maxRate + " " + (char)englishLowerAlphabet.charAt(maxRate));// проверка
                shift = maxRate + englishLowerAlphabetRange[0];
                System.out.println("-->" + shift + " " + (char)shift);// проверка
                System.out.println("-->" + (int)englishLettersRate[1][i] + " " + (char)englishLettersRate[1][i]);// проверка
                shift -= (int) englishLettersRate[1][i];
                System.out.println("-->" + shift);// проверка

                System.out.println("TEXT: " + DencryptText(smallText, shift));
                System.out.print("Текст имеет смысл? (да/нет): ");
                answer = scanner.nextLine();

                if (isNext(answer))
                    isEnd = true;
                i++;
            }
        }
        scanner.close();
        System.out.println("*** Весь текст ниже ***");
        System.out.println(DencryptText(text, shift));
    }

    int[] englishLettersRepetitionRate(String text) {
        int amountLetters = 0;
        int[] rate = new int[26];
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            amountLetters++;
            int temp = text.charAt(i);
            if (temp >= 'a' && temp <= 'z')
                rate[temp - englishLowerAlphabetRange[0]] += 1;
        }

        // всего букв и вывод алфавита
        System.out.println("Всего букв в тексте: " + amountLetters);
        for (int i = 0; i < englishLowerAlphabet.length(); i++) {
            System.out.print("    " + englishLowerAlphabet.charAt(i) + " ");
        }
        System.out.println();

        // количество букв в тексте
        for (int i = 0; i < rate.length; i++) {
            StringBuilder sbuf = new StringBuilder();
            Formatter fmt = new Formatter(sbuf);
            fmt.format("%03d", rate[i]);
            System.out.print("  " + sbuf.toString() + " ");
        }
        System.out.println();

        // вычисляем частоту букв в тексте
        double sumAvrRate = 0f;
        for (int i = 0; i < rate.length; i++) {
            sumAvrRate += 1.0 * rate[i] / amountLetters;
            System.out.printf(" %.2f ", 1.0 * rate[i] / amountLetters);
        }
        System.out.println();
        System.out.printf("Средняя частота: %.2f", sumAvrRate / 6);// средняя частота по количеству гласных букв 10
        System.out.println();
        return rate;
    }

    int[] russianLettersRepetitionRate(String text) {
        int amountLetters = 0;
        int[] rate = new int[33];
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            amountLetters++;
            int temp = text.charAt(i);
            if (temp == 'ё') {
                rate[32] += 1;
            } else if (temp >= 'а' && temp <= 'я') {
                rate[temp - russianLowerAlphabetRange[0]] += 1;
            }
        }

        // всего букв и вывод алфавита
        System.out.println("Всего букв в тексте: " + amountLetters);
        for (int i = 0; i < russianLowerAlphabet.length(); i++) {
            if (russianLowerAlphabet.charAt(i) != 'ё')
                System.out.print("    " + russianLowerAlphabet.charAt(i) + " ");
        }
        System.out.print("    " + 'ё' + " ");
        System.out.println();

        // количество букв в тексте
        for (int i = 0; i < rate.length; i++) {
            StringBuilder sbuf = new StringBuilder();
            Formatter fmt = new Formatter(sbuf);
            fmt.format("%03d", rate[i]);
            System.out.print("  " + sbuf.toString() + " ");
        }
        System.out.println();

        // вычисляем частоту букв в тексте
        double sumAvrRate = 0f;
        for (int i = 0; i < rate.length; i++) {
            sumAvrRate += 1.0 * rate[i] / amountLetters;
            System.out.printf(" %.2f ", 1.0 * rate[i] / amountLetters);
        }
        System.out.println();
        System.out.printf("Средняя частота: %.2f", sumAvrRate / 10);// средняя частота по количеству гласных букв 10
        System.out.println();
        return rate;
    }

    void PrintLettersNumber(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print((int)text.charAt(i) + " ");
        }
        System.out.println();
    }

    int[] SortedRate(int[] rate) {
        int[] sortedRate = Arrays.stream(rate)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("Отсортированный Rate");
        System.out.println(sortedRate);
        return sortedRate;
    }

    int MaxRate(int[] rate) {
        int result = 0;
        int index = 0;
        for (int i = 0; i < rate.length; i++) {
            if (rate[i] > result) {
                result = rate[i];
                index = i;
            }
        }
        return index;
    }

    boolean isNext (String answer) {
        if (answer.equals("да") || answer.equals("Да") || answer.equals("ДА")
                || answer.equals("Y") || answer.equals("y")
                || answer.equals("yes") || answer.equals("YES") || answer.equals(""))
            return true;
        return false;
    }


}
