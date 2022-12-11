package org.example;
import java.util.Random;

public class Task_02_QuadraticEquation {
    // Алгоритм решения квадратного уравнения по известным коэффициентам
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private double x1 = 0d;
    private double x2 = 0d;

    public Task_02_QuadraticEquation() {
        Random random = new Random();
        this.a = random.nextInt(-1000, 1000);
        this.b = random.nextInt(-1000, 1000);
        this.c = random.nextInt(-1000, 1000);
    }

    public Task_02_QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void StartTask_02() {
        System.out.println(String.format("* Введено: %s %s %s", a, b, c));
        /*System.out.println("* Задача: Алгоритм решения квадратного уравнения по известным коэффициентам");
        System.out.println("Введите значения квадратичного уравнения \"ax2 + bx + c = 0\" ниже:");
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("- введите a: ");
        a = inputNumber.nextInt();
        System.out.print("- введите b: ");
        b = inputNumber.nextInt();
        System.out.print("- введите c: ");
        c = inputNumber.nextInt();
        inputNumber.close();*/

        if (a != 0 && b != 0 && c != 0)
            SolveQuadraticEquation();
        else {
            if (a == 0 && b == 0 && c == 0)
                System.out.println("Шутник, блин?");
            else if (a == 0 && b == 0 && c != 0)
                System.out.println("Какие корни? " + c + " = 0 ?");
            else if (a == 0) {
                x1 = (1.0 * -c) / b;
                System.out.println("Это линейное уравнение! Один корень: " + x1);
            }
            else if (b == 0 && c == 0)
                System.out.println("Это неполное квадратное уравнение.\nКорень: 0");
            else if (b == 0 ) {
                System.out.println("Это неполное квадратное уравнение.");
                double temp = (1.0 * -c) / a;
                if (temp < 0)
                    System.out.println("Уравнение не имеет корней.");
                else {
                    x1 = Math.sqrt((1.0 * -c) / a);
                    System.out.println("Первый корень: -" + x1 + "\nВторой корень: " + x1);
                }
            }
            else if (c == 0) {
                x1 = (1.0 * -b) / a;
                System.out.println("Это неполное квадратное уравнение." +
                        "\nПервый корень: " + x2 + "\nВторой корень: " + x1);
            }
            else
                System.out.println("ERROR: вы сломали мне программу (шипит и точит топор).");
        }

    }

    private boolean GetRootsNumber() {
        d = b * b - 4 * a * c;
        if (d < 0)
        {
            System.out.println("Уравнение не имеет корней.");
            return false;
        }
        if (d == 0)
            System.out.println("Уравнение имеет один корень.");
        if (d > 0)
            System.out.println("Уравнение имеет два различных корня.");
        return true;
    }

    private void SolveQuadraticEquation() {
        if (GetRootsNumber())
        {
            if (d == 0) {
                x1 = (-b - Math.sqrt(1.0 * d)) / (2 * a);
                System.out.println("Единственный корень уравнения " + x1);
            }
            if (d > 0) {
                x1 = (-b - Math.sqrt(1.0 * d)) / (2 * a);
                x2 = (-b + Math.sqrt(1.0 * d)) / (2 * a);
                if (x1 < x2) {
                    System.out.println("Первый корень уравнения: " + x1);
                    System.out.println("Второй корень уравнения: " + x2);
                }
                else {
                    System.out.println("Первый корень уравнения: " + x2);
                    System.out.println("Второй корень уравнения: " + x1);
                }
            }
        }

    }
}
