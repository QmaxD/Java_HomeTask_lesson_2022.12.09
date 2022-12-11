package org.example;

public class Task_03_Fibonacci {
    private int index = 0;

    public Task_03_Fibonacci(int index) {
        this.index = index;
    }

    public void StartTask_03() {
        //System.out.println("* Задача: Реализовать алгоритм вычисления n первых чисел Фибоначчи");
        if (FibonacciPleaseMofo(index) >= 0)
            System.out.print(FibonacciPleaseMofo(index) + ", ");
    }
    int FibonacciPleaseMofo(int index)
    {
        if (index < 0)
            return (-1);
        else if (index == 0)
            return (0);
        else if (index == 1)
            return (1);
        else
            return (FibonacciPleaseMofo(index - 1) + FibonacciPleaseMofo(index - 2));
    }

}
