package FilesWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadBite {
    public void readAndWriteBite() throws IOException {
        FileInputStream from = new FileInputStream("D:\\Java\\Java 2\\Productstar\\Files\\FilesWork\\Text.txt");
        FileOutputStream to = new FileOutputStream("D:\\Java\\Java 2\\Productstar\\Files\\FilesWork\\Result.txt");

        byte buffer[] = new byte[10];
        while (from.available() > 0) {
            int count = from.read(buffer);
            to.write(buffer, 0, count);
        }
        from.close();
        to.close();
        }

    }

