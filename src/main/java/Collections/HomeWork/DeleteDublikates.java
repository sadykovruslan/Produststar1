package Collections.HomeWork;

import java.util.ArrayList;
import java.util.HashSet;


public class DeleteDublikates {
//    Реализуй метод, который на вход примет ArrayList строк и удаляет из него все дубликаты,
//    не используя метод contains(). Можно использовать другие коллекции, которые были изучены на уроке.
    public static void main(String[] args) {
        HashSet<String> namesSet = new HashSet<>();
        ArrayList<String> namesArray = new ArrayList<>();
        namesArray.add("Sasha");
        namesArray.add("Dasha");
        namesArray.add("Pasha");
        namesArray.add("Glasha");
        namesArray.add("Dasha");
        namesArray.add("Natasha");
        namesArray.add("Masha");

        namesSet.addAll(namesArray);
        if(namesSet.size() !=namesArray.size()) {
            System.out.println("Обнаружены дуюликаты");
        } else {
            System.out.println("Дубликатов нет");
        }
    }
}
