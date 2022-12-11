package org.example;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Заполнить массив случайным значениями. Вывести максимальное, минимальное и среднее значение.
        /*Task_01 task1_01 = new Task_01();
        task1_01.StartTask_01();
        Task_01 task1_02 = new Task_01(100_000, 0, 1_000);
        task1_02.StartTask_01();*/

        // Задача 2: Алгоритм решения квадратного уравнения по известным коэффициентам
        /*Task_2_QuadraticEquation task2_01 = new Task_2_QuadraticEquation();
        task2_01.Start();
        Task_2_QuadraticEquation task2_02 = new Task_2_QuadraticEquation(0, 0, 0);
        task2_02.Start();
        Task_2_QuadraticEquation task2_03 = new Task_2_QuadraticEquation(0, 5, 5);
        task2_03.Start();
        Task_2_QuadraticEquation task2_04 = new Task_2_QuadraticEquation(0, 0, 5);
        task2_04.Start();
        Task_2_QuadraticEquation task2_05 = new Task_2_QuadraticEquation(0, 5, 25);
        task2_05.Start();
        Task_2_QuadraticEquation task2_06 = new Task_2_QuadraticEquation(25, 0, 0);
        task2_06.Start();
        Task_2_QuadraticEquation task2_07 = new Task_2_QuadraticEquation(5, 0, 25);
        task2_07.Start();
        Task_2_QuadraticEquation task2_08 = new Task_2_QuadraticEquation(5, 0, -25);
        task2_08.Start();
        Task_2_QuadraticEquation task2_09 = new Task_2_QuadraticEquation(5, 25, 0);
        task2_09.Start();
        Task_2_QuadraticEquation task2_10 = new Task_2_QuadraticEquation(5, 125, 25);
        task2_10.Start();*/

        // Задача 3: Реализовать алгоритм вычисления n первых чисел Фибоначчи
        /*for (int i = -1; i < 25; i++) {
            Task_03_Fibonacci task3_00 = new Task_03_Fibonacci(i);
            task3_00.StartTask_03();
        }*/

        // Задача 4: Реализовать алгоритм проверки строки на палиндромность
        /*Task_04_Palindrom task4_01 = new Task_04_Palindrom();
        System.out.println(task4_01.isPalindrom_v2());
        System.out.println(task4_01.isPalindrom_v1());
        Task_04_Palindrom task4_02 = new Task_04_Palindrom("123555321");
        System.out.println(task4_02.isPalindrom_v2());
        System.out.println(task4_02.isPalindrom_v1());
        Task_04_Palindrom task4_03 = new Task_04_Palindrom("1234567890");
        System.out.println(task4_03.isPalindrom_v2());
        System.out.println(task4_03.isPalindrom_v1());
        System.out.println(task4_03.reverse());
        Task_04_Palindrom task4_04 = new Task_04_Palindrom("NULL");
        System.out.println(task4_04.isPalindrom_v1());*/

        // Задача 5: Постройте частотный словарь букв русского (или английского) алфавита по небольшому фрагменту текста.
        Task_Add_Text.WriteText();
        /*String text = Task_Add_Text.GetRandomText();
        Task_05 task5_01 = new Task_05(text);

        WorkTime.StartTime();
        task5_01.WorkWithTreeMap();
        WorkTime.StopTime();

        WorkTime.StartTime();
        task5_01.WorkWithHashMap();
        WorkTime.StopTime();

        WorkTime.StartTime();
        task5_01.WorkWithList();
        WorkTime.StopTime();

        WorkTime.StartTime();
        task5_01.WorkWithArray();
        WorkTime.StopTime();*/

        // Задача 6: Напишите метод, заменяющий в тексте все вхождения определенной фразы на «[вырезано цензурой]».
        /*Task_Add_Text.WriteText();
        String text2 = Task_Add_Text.GetRandomText();
        Task_06_Censor task6_01 = new Task_06_Censor(text2);
        task6_01.CensuringPlease();*/

        // Задача 7: Реализация игры в Камень-Ножницы-Бумага с компьютером
        // реализовано отдельно в JavaFX

        // Задача 8: Реализация игры в однорукого бандита |X|O|V|
        Task_08_Game_OneArmed_Bandit task8 = new Task_08_Game_OneArmed_Bandit();
        task8.StartGame();

        // Задача 9: Шифр Цезаря: шифрование, дешифрование, подбор ключа, анализ чатоты букв
        /*String str1 = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";// 1040-1071
        String str2 = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";// 1072-1103
        String str3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";// 65-90
        String str4 = "abcdefghijklmnopqrstuvwxyz";// 97-122
        int key = 10;

        Task_09_Caesar_Cipher task9_01 = new Task_09_Caesar_Cipher();
        // посмотрим какие цифры у букв
        //task9_01.PrintLettersNumber(str1);
        //task9_01.PrintLettersNumber(str2);
        //task9_01.PrintLettersNumber(str3);
        //task9_01.PrintLettersNumber(str4);

        // зашифровка ключом
        //System.out.println(task9_01.EncryptText(str1, key));
        //System.out.println(task9_01.EncryptText(str2, key));
        //System.out.println(task9_01.EncryptText(str3, key));
        //System.out.println(task9_01.EncryptText(str4, key));

        // расшифровка ключом
        //System.out.println(task9_01.DencryptText(task9_01.EncryptText(str1, key), key));
        //System.out.println(task9_01.DencryptText(task9_01.EncryptText(str2, key), key));
        //System.out.println(task9_01.DencryptText(task9_01.EncryptText(str3, key), key));
        //System.out.println(task9_01.DencryptText(task9_01.EncryptText(str4, key), key));

        // какой текст на выбор
        //Task_Add_Text.LookTexts();

        // посмотрим частоту букв в тексте
        task9_01.russianLettersRepetitionRate(Task_Add_Text.GetCurrentText(4));
        //task9_01.englishLettersRepetitionRate(Task_Add_Text.GetCurrentText(9));

        // подбираем ключ
        task9_01.PickUpCode(task9_01.EncryptText(Task_Add_Text.GetCurrentText(4), 10));
        //task9_01.PickUpCode(task9_01.EncryptText(Task_Add_Text.GetCurrentText(9), 10));*/
    }
}