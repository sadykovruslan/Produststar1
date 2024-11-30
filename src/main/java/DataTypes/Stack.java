package DataTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    static Queue <String> peopleX = new LinkedList<>();
    public static void AddQueue(){
       peopleX.add("First");
       peopleX.add("Second");
       peopleX.add("Third");


        for(String personX: peopleX){
            System.out.println(personX);
        }
    }
}
