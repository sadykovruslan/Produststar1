package SpringFramework.Runners;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFire {
    List<Runner> allRunners = new ArrayList<>();

    public void readDataFromFile() throws IOException {
        String path = "D:\\Java\\Produststar1\\src\\main\\resources\\results.csv";
        BufferedReader bf = new BufferedReader(new FileReader(path));
        String line = bf.readLine();

        while (line != null) {
            convertLinesToStock(line);
            line = bf.readLine();
        }
        convertLinesToStock(line);
        bf.close();
            System.out.println(allRunners.get(1));
        }
    }

    public int timeToSec(String resultRunner) {
        String[] minSecStr = resultRunner.split(":");
        return Integer.parseInt(minSecStr[0]) * 60 + Integer.parseInt(minSecStr[1]);

    }

    public void convertLinesToStock(String dataRunner) {
        String[] runs = dataRunner.split(",");
        Runner runner = new Runner(
                runs[0],
                Gender.MALE,
                Distance.TEN_KM,
                timeToSec(runs[3])
        );
    }

public void main() {
}

