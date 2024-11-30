package Sarialization.Runner;

import java.io.Serializable;

public class Shoes implements Serializable {
    private String brand;
    private int size;

    public Shoes(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
