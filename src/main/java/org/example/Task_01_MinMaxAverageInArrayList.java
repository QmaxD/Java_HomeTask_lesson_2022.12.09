package org.example;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_01_MinMaxAverageInArrayList {
    // Заполнить массив случайным значениями и вывести максимальное, минимальное и среднее значение.
    private int elementsNumberInList = 500_000;
    private double elementsMinInList = -100_000d;
    private double elementsMaxInList = 100_000d;
    private List<Double> numbersList;

    public List<Double> getNumbersList() {
        if (numbersList.size() > 0)
            return numbersList;
        System.out.println("Список пуст!");
        return numbersList;
    }

    public Task_01_MinMaxAverageInArrayList() {
        numbersList = new ArrayList<Double>(elementsNumberInList);
    }

    public Task_01_MinMaxAverageInArrayList(int elementsNumberInList, double elementsMinInList, double elementsMaxInList) {
        this.elementsNumberInList = elementsNumberInList;
        this.elementsMinInList = elementsMinInList;
        this.elementsMaxInList = elementsMaxInList;
        numbersList = new ArrayList<Double>(elementsNumberInList);
    }

    public void Start()
    {
        System.out.println("Задача: Заполнить массив случайным значениями. " +
                "Вывести максимальное, минимальное и среднее значение.");
        System.out.println(new DecimalFormat( "Количество элементов в листе: #,###,###" )
                .format(elementsNumberInList));
        WriteNumbersList();
        FindMinMaxAverageInNumbersList();
    }
    void WriteNumbersList() {
        Random random = new Random();
        for (int i = 0; i < elementsNumberInList; i++)
            numbersList.add(random.nextDouble(elementsMinInList, elementsMaxInList + 1));
        //System.out.println(numbersList);
    }
    void FindMinMaxAverageInNumbersList() {
        double min = elementsMaxInList;
        double max = elementsMinInList;
        double avg = 0;

        for (int i = 0; i < numbersList.size(); i++)
        {
            if (numbersList.get(i) < min)
                min = numbersList.get(i);
            if (numbersList.get(i) > max)
                max = numbersList.get(i);
            avg += numbersList.get(i);
        }
        avg = avg / elementsNumberInList;

        System.out.printf("максимальное число: %.5f" + "\n", max);
        System.out.printf("минимальное число: %.5f" + "\n", min);
        System.out.printf("среднее значение: %.5f" + "\n", avg);
    }

}
