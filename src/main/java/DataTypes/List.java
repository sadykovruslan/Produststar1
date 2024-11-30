package DataTypes;

import java.util.ArrayList;

public class List {
    static ArrayList<String> people = new ArrayList<String>();
    public static void AddList(){
        people.add("First");
        people.add("Second");
        people.add("Third");


        for(String person: people){
            System.out.println(person);
        }
    }

}
