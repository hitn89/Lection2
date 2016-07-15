package com.epam.spb.lection2.HW3_160708;

import java.util.ArrayList;

public class Flowers {

    public static void main(String[] args) {

        BouquetOfFlowers bouquetofflowers = new BouquetOfFlowers();
        bouquetofflowers.add(new chamomile(15));
        bouquetofflowers.add(new Rose(90.99));
        bouquetofflowers.add(new chamomile(15));
        bouquetofflowers.add(new Carnation(50));
        bouquetofflowers.add(new Tulip(20));
        System.out.println("Итого с вас: " + bouquetofflowers.getTotalPrice() + " руб.");

    }

    private String name;
    private double price;

    Flowers(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}

class Rose extends Flowers {
    Rose(double price) {
        super("Роза", price);
    }
}

class Carnation extends Flowers {
    Carnation(double price) {
        super("Гвоздика", price);
    }
}

class Tulip extends Flowers {
    Tulip(double price) {
        super("Тюльпан", price);
    }
}

class chamomile extends Flowers {
    chamomile(double price) {
        super("Ромашка", price);
    }
}

class BouquetOfFlowers extends ArrayList<Flowers> {
    private ArrayList<Flowers> flowers = new ArrayList<Flowers>();
    public double getTotalPrice() {
        double sum = 0;
        for(Flowers flower : this) {
            sum = sum + flower.getPrice();
        }
        return sum;
    }
}
