package FizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 16;
        int[] arrayNumber = new int[number]; // хранение чисел в массиве
        String[] numbersString = new String[number];

//      заполняем массив чисел согдано условию задачи:
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = i;

//          делаем маркер для нужных чисел:
            if (arrayNumber[i] % 3 == 0 && arrayNumber[i] % 5 == 0) {
                arrayNumber[i] = 300500;
            } else if (arrayNumber[i] % 5 == 0) {
                arrayNumber[i] = 500;
            } else if (arrayNumber[i] % 3 == 0) {
                arrayNumber[i] = 300;
            }

//          т.к. 0 формально подходит под условие, но его менять не нужно - вучную присваиваем ему значение 0
            arrayNumber[0] = 0;
        }
//          переводим массив чисел в массив строк, т.к. fizz, buzz, fizzbuzz не int
            for (int i = 0,j = 0; j < arrayNumber.length; j++, i++) {
                numbersString[j] = Integer.toString(arrayNumber[i]);
//                System.out.println(numbersString[j]);
            }
//            заменяем маркеры (300,500,300500) на нужные значения (fizz, buzz, fizzbuzz)
        for (String a: numbersString){
            if (a.equals("300")){
                a = "fizz";
            }

            if (a.equals("500")){
                a = "buzz";
            }

            if (a.equals("300500")){
                a = "fizzbuzz";
            }
//            выводим результат
            System.out.print(a);
        }
        }
    }
