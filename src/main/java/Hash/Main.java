package Hash;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        people.add ("Ruslan");
        people.add ("Polina");
        people.add ("Sasha");

        ArrayDeque<String> contries = new ArrayDeque<>();
        contries.add("Russia");
        contries.add("Belarus");
        contries.add("Turkey");
        contries.add("Ukrain");
        contries.add("USA");

        LinkedList<String> states = new LinkedList<>();
        states.add("Saratov");
        states.add("Kazan");
        states.add("Piter");
        states.add("Rostov");
        states.add("Perm");
        states.addFirst("Ufa");
        states.addLast("Samara");
        states.add(4,"Vladimir");

        for (String s: states) {
            System.out.println(s);
        }
        System.out.println(states.size());


        while (contries.peek()!=null) {
            System.out.println(contries.pop());
        }

        ArrayDeque <Person> peoplePerson = new ArrayDeque<Person>();
        peoplePerson.addFirst(new Person("Polina"));
        peoplePerson.addFirst(new Person("Roslan"));

        for(Person p: peoplePerson){
            System.out.println(p.getPerson());
        }




    }
}