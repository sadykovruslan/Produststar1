package Trading;

import java.io.BufferedInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NetUtils {
    public List<Stock> getStocks(){
        String url = "https://raw.githubusercontent.com/productstar-team/javaTwo/master/resources/monthly_IBM.csv";
        try (BufferedInputStream is =
                     new BufferedInputStream(new URL(url).openStream())){
            Scanner scanner = new Scanner(is).useDelimiter("\\A");
            String result = scanner.hasNext() ? scanner.next() : "";
            return convertCsvToStocks (result);

        } catch (Exception e){
            System.out.println("Unable to get data from API");
        }
        return Collections.emptyList();


    }

    private List<Stock> convertCsvToStocks(String inputData) {
        List<Stock> stocks = new ArrayList<>();
        String[] lines = inputData.split("\n");
        for(int i = 1; i < lines.length; i++){
            stocks.add(convertLinesToStock(lines[i]));
        }
        return stocks;
    }

    private Stock convertLinesToStock(String line) {
        String[] tokens = line.split(",");
        return new Stock(
                tokens[0],
                Float.parseFloat(tokens[1]),
                Float.parseFloat(tokens[2]),
                Float.parseFloat(tokens[3]),
                Float.parseFloat(tokens[4]),
                Long.parseLong(tokens[5]));
    }
}
