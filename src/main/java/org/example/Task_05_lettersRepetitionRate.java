package org.example;
import java.util.*;

public class Task_05_lettersRepetitionRate {
    private String text = "";
    // ЧТО ЗА КОДИРОВКА, когда в ASCII всего 256 символов?! символ 8212!!!

    public Task_05_lettersRepetitionRate() {}
    public Task_05_lettersRepetitionRate(String text) {
        this.text = text;
        System.out.println("* Задача 5: Постройте частотный словарь букв " +
                "русского (или английского) алфавита по небольшому фрагменту текста.\n");
    }

    void WorkWithTreeMap() {
        if (isNotEmpty()) {
            SortedMap<Character, Integer> sortedMap = new TreeMap<>();
            //AddKeysToMapManually((AbstractMap)sortedMap);
            WriteKeysToMapFromText((AbstractMap)sortedMap);
            PrintMap((AbstractMap)sortedMap);
        }
    }

    void WorkWithHashMap() {
        if (isNotEmpty()) {
            Map<Character, Integer> hashMap = new HashMap<>();
            //AddKeysToMapManually((AbstractMap)hashMap);
            WriteKeysToMapFromText((AbstractMap) hashMap);
            PrintMap((AbstractMap) hashMap);
        }
    }

    void WorkWithList() {
        if (isNotEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            for (char c = 0; c < 9999; c++) {
                list.add(0);
            }
            WriteValuesToListFromText(list);
            PrintMap(list);
        }
    }

    void WorkWithArray() {
        if (isNotEmpty()) {
            int[] array = new int[9999];
            for (int i = 0; i < 9999; i++) {
                array[i] = 0;
            }
            WriteValuesToArrayFromText(array);
            PrintMap(array);
        }
    }

    void AddKeysToMapManually(AbstractMap map) {
        for (char c = 0; c < 1200; c++) {
            if (c >= 65 && c <= 90) {
                map.put(c, 0);
                map.put((char)(c + 32), 0);
                //System.out.println(c + "" + (char)(c + 32));
            }
            else if (c >= 1040 && c <= 1071) {
                map.put(c, 0);
                map.put((char)(c + 32), 0);
                //System.out.println(c + "" + (char)(c + 32));
            }
        }
        WriteKeysToMapFromText(map);
    }

    void WriteKeysToMapFromText(AbstractMap map) {
        for (int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))) {
                int value = (int) map.get(text.charAt(i)) + 1;
                map.put(text.charAt(i), value);
                //System.out.println(text.charAt(i) + "-add");
            } else {
                map.putIfAbsent(text.charAt(i), 1);
                //System.out.println(text.charAt(i) + "-new");
            }
        }
    }

    void WriteValuesToListFromText(List list) {
        for (int i = 0; i < text.length(); i++) {
            int index = (int)text.charAt(i);
            list.set(index, (int)list.get(index) + 1);
        }
    }

    void WriteValuesToArrayFromText(int[] array) {
        for (int i = 0; i < text.length(); i++)
            array[(int)text.charAt(i)] += 1;
    }

    void PrintMap(AbstractMap map) {
        System.out.println("\n* " + map.getClass().getSimpleName().toString());
        if (map.isEmpty()) {
            System.out.println("Однако, коллекция пуста. Попробуйте позже.");
            return;
        }
        System.out.println(map);
    }

    void PrintMap(List list) {
        System.out.println("\n* " + list.getClass().getSimpleName().toString());
        if (list.isEmpty()) {
            System.out.println("Однако, коллекция пуста. Попробуйте позже.");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if ((int)list.get(i) > 0) {
                System.out.print((char)i + "=");
                System.out.print(list.get(i) + ", ");
            }
            if (i == list.size() - 1)
                System.out.println();
        }
    }

    void PrintMap(int[] array) {
        System.out.println("\n* " + array.getClass().getSimpleName().toString());
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print((char)i + "=");
                System.out.print(array[i] + ", ");
            }
            if (i == array.length - 1)
                System.out.println();
        }
    }

    boolean isNotEmpty() {
        if (text.isEmpty())
            return false;
        return true;
    }
}
