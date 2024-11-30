package Collections.Stock;

public class Stock {
    private String name;
    private static Stock[] stocks = new Stock[10];

    public Stock(String name) {
       this.name =name;
    }

    public String getName() {
        return this.name;
    }
    public static void initDB(){
        stocks[0] = new Stock("Утюг");
        stocks[1] = new Stock("Пылесос");
        stocks[2] = new Stock("Телевизор");
        stocks[3] = new Stock("Фен");
        stocks[4] = new Stock("Компьютер");

    }
    public static void showAll(){
        System.out.println("Показать всех");
        for(Stock stock: stocks) {
            System.out.println(stock);
        }
    }
    public String toString(){
        return "\nName:" + this.getName();
    }
}
