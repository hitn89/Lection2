package com.epam.spb.lection2.HW3_160708;

public class Man {

    public static void main(String[] args) {

        Student student = new Student();
        student.setYearofeducation(2);
        student.incYearofeducation();
        System.out.println("Сейчас идет: " + student.getYearofeducation() + " курс");

    }

    private String name;
    private int age;
    private String sex;
    private double weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Student extends Man {
    private int yearofeducation;
    public void setYearofeducation(int yearofeducation) {
        this.yearofeducation = yearofeducation;
    }

    public void incYearofeducation() {
        yearofeducation++;
    }

    public int getYearofeducation() {
        return yearofeducation;
    }
}