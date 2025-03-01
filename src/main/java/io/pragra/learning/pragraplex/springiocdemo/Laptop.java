package io.pragra.learning.pragraplex.springiocdemo;

public class Laptop {

    private String brand;
    private Integer price;

    public Laptop(String brand, Integer price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Laptop{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", price='").append(price).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
