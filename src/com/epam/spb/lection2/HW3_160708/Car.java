package com.epam.spb.lection2.HW3_160708;

public class Car {


    public static void main(String[] args) {

        Lorry lorry = new Lorry();
        lorry.setBrand("VOLVO");
        System.out.println("Lorry mark: " + lorry.getBrand());
    }

    private String brand;
    private double weight;
    private int power;

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Lorry extends Car {
    private int capacity;

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }
}