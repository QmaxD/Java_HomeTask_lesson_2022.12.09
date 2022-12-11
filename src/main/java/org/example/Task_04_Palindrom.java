package org.example;

public class Task_04_Palindrom {

    private String str = "sdsdsdsdsdfsdgsgsDSASDASF65465213123_slide@$Fghshh0" +
                         "0" +
                         "0hhshgF$@edils_32131256456FSADSASDsgsgdsfdsdsdsdsds";

    public Task_04_Palindrom() {}
    public Task_04_Palindrom(String str) {
        if (str == "NULL")
            str = null;
        if (str == "EMPTY")
            str = "";
        this.str = str;
    }

    /**Является ли слово палиндромом?: посимвольное сравнение в цикле*/
    public boolean isPalindrom_v1() {
        if(str == null) {
            System.out.println("Строки нет!");
            return false;
        }
        if(str.length() == 0) {
            System.out.println("Строка пуста!");
            return false;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if ( str.charAt(i) != str.charAt(str.length() - 1 - i) )
                return false;
        }
        return true;
    }

    /**Является ли слово палиндромом?: реверс строки и сравнение compareTo*/
    public boolean isPalindrom_v2() {
        if(str.isEmpty()) {
            System.out.println("Строка пуста!");
            return false;
        }
        String rStr = reverse();
        if (str.compareTo(rStr) == 0)
            return true;
        return false;
    }
    /**Является ли слово палиндромом?: реверс строки и сравнение equals*/
    public boolean isPalindrom_v3() {
        if(str.isEmpty()) {
            System.out.println("Строка пуста!");
            return false;
        }
        String rStr = reverse();
        if (str.equals(rStr))
            return true;
        return false;
    }
    public String reverse() {
        return new StringBuilder(str).reverse().toString();
    }


}
