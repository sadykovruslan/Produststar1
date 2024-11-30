package Decorator;

public abstract class Car {
    String name  = "Unnamed car";

    // возвращает имя плюс добавлемые обвесы (GPS, Condition)
    public String getInfo() {
        return name;
    }

    //    возвращает значение новой цены
    public abstract int getPrice();
}
