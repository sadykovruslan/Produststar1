package Collections.HomeWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListAdd {
    public static void main(String[] args) {
        Random rnd = new Random();
        List <Integer> digitsArray = new ArrayList<>();
        List <Integer> digitsLinked = new LinkedList<>();

//        заполнем cписки случайными эллементами от 1 до 1000
        for(int i = 0; i < 1_000_000_000; i++) {
            digitsLinked.add(i, rnd.nextInt(1000));
            digitsArray.add(i, rnd.nextInt(1000));
        }

//       выбираем эллемент по случайному индексу из списков
        for (int i=0; i<1000;) {
            System.out.println(digitsLinked.get(rnd.nextInt(1000)));
            System.out.println(digitsArray.get(rnd.nextInt(1000)));
            i++;
        }
    }
}
