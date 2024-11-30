package Trading;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NetUtils netUtils = new NetUtils();
        List<Stock> stocks = netUtils.getStocks();
        stocks.sort(new Comparator<Stock>() {
            @Override
            public int compare(Stock o1, Stock o2) {
                Float val1 = new Float(o1.getClose());
                Float val2 = new Float(o2.getClose());
                return val1.compareTo(val2);
            }
        });

        System.out.println("The cheapest one was on " +
                stocks.get(0).getDate() + " with value " +
                stocks.get(0).getClose());

        System.out.println("The most expensive one was on " +
                stocks.get(stocks.size()-1).getDate() + " with value " +
                stocks.get(stocks.size()-1).getClose());

    }
}