package Hash;

import java.util.HashSet;

public class HashLesson {
    public static void main (String[] args){
        HashSet<String> states = new HashSet<String>();
        states.add("Saratov");
        states.add("Kazan");
        states.add("Piter");
        states.add("Rostov");
        states.add("Perm");
        states.add("Ufa");
        states.add("Samara");
        states.add("Vladimir");
        states.add("Piter");
        states.add("Rostov");
        states.add("Perm");
        states.add("Ufa");

        for(String state: states){
            System.out.println(state);
        }

    }
}
