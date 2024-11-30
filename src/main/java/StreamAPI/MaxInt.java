package StreamAPI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaxInt {

    public static void main(String[] args) {
        try {
            new BufferedReader(new FileReader("data.txt")).lines()
                    .forEach(s -> System.out.println(s));
        } catch (IOException e){
            throw new RuntimeException();
        }
    }

}
