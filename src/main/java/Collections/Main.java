package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        MyArrayList user = new MyArrayList();
        LinkedList<Float> digit = new LinkedList<>();
        List<Person> list = new LinkedList<>();

        ///////////////////ArrayList////////////////////////////////
        numbers.add(45);
        numbers.add(56);
        numbers.add(47);
        numbers.add(10);
        numbers.add(20);

       ///////////////////////Collections/////////////////////////////////
        user.add ("Ruslan");
        user.add ("Polina");
        user.add ("Sergey");
        user.add ("Timur");
        user.add ("Galina");
        numbers.remove(2);

        //////////////////////Linked List/////////////////////////
        digit.add(4.5f);
        digit.add(8.213213f);
        digit.add(0.5f);
        digit.add(48.45455f);
        digit.add(11.54543f);

        ///////////////////Array List 1 ////////////////////////////

        Person person1 = new Person("white");
        Person person2 = new Person("rabbit");


        list.add(person1);
        list.add(person2);

        boolean remove = list.remove(person1);

//        Person person1FromCollection = list.get(0);
//        Person person2FromCollection = list.get(1);
//
//        System.out.println(person1FromCollection);
//        System.out.println(person2FromCollection);






//        for(int i = 0; i < user.getSize(); i++){
//            System.out.println(user.get(i));
//        }
//        System.out.println("--------------------------");
//
//        for (Integer el: numbers){
//            System.out.println(el);
//        }
//        System.out.println("--------------------------");
//        for(Float el: digit){
//            System.out.println(el);
//        }
   }
}