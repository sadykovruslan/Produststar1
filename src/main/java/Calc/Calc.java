package Calc;

import java.util.Arrays;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double[] arrayResult = new double[3];

        int i=0;
        for (;;) {
            double result=0.0;

            System.out.println("Input 1st number: ");
            double first = reader.nextDouble();

            System.out.println("Input 2nd number: ");
            double second = reader.nextDouble();

            System.out.println("Введите оператор: (+, -, *, /): ");
            char operator = reader.next().charAt(0);

            switch (operator) {
                case '+':
                    result = first + second;
                    arrayResult[i] = result;
                    i++;
                    break;

                case '-':
                    result = first - second;
                    arrayResult[i] = result;
                    i++;
                    break;

                case '*':
                    result = first * second;
                    arrayResult[i] = result;
                    i++;
                    break;

                case '/':
                    result = first / second;
                    arrayResult[i] = result;
                    i++;
                    break;

                default:
                    System.out.println("Введите корректный оператор");
                    return;
            }
            System.out.println(Arrays.toString(arrayResult));
        }

//            System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);

//        String exit = reader.next();
//        if (exit.equals("Exit"))
//            break;
    }




}

