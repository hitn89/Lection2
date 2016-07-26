package com.epam.spb.lection2.HW4_160725;

public class Pen {

    private String mark, model;
    private double price;


    public Pen(String mark, String model, double price) {
        this.mark = mark;
        this.model = model;
        this.price = price;
    }

    @Override
    public int hashCode(){
        int hash = 1;
        for (char chr : this.mark.toCharArray()) {
            hash += chr;
        }
        for (char chr : this.model.toCharArray()) {
            hash += chr;
        }
        hash *= this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().isInstance(this)) {
            return obj.toString().equals(this.toString());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.mark + " " + this.model + ", цена: " + price + " руб.";
    }

    public static void main(String[] args) {

            Pen pen0 = new Pen("Pilot", "12345", 300.5);
            Pen pen1 = new Pen("Pilot", "54321", 200.99);
            Pen pen2 = new Pen("Pilot", "12345", 300.5);
            Pen pen3 = new Pen("Pilot", "super", 1_000_000);
            System.out.println(pen0.toString());
            System.out.println(pen1.toString());
            System.out.println(pen2.toString());
            System.out.println(pen3.toString());
            System.out.println(pen0.equals(pen1));
            System.out.println(pen0.equals(pen2));
            System.out.println(pen0.hashCode());
            System.out.println(pen1.hashCode());
            System.out.println(pen2.hashCode());
            System.out.println(pen3.hashCode());

    }

}
