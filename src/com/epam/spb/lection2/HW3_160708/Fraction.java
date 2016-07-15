package com.epam.spb.lection2.HW3_160708;

public class Fraction {

    public static void main(String[] args) {

        Fraction fraction = new Fraction();
        fraction.setNumerator(8);
        fraction.setDenominator(2);
        fraction.result();
        fraction.sumFractions(5, 6);
        fraction.mulFractionOnNumber(3);
        fraction.divFractionOnNumber(7);

    }

    private int numerator;
    private int denominator;

    Fraction() {
        this.numerator = 0;
        this.denominator = 0;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    public void result() {
        System.out.println(numerator + "/" + denominator);
    }

    public void sumFractions(int x, int y) {
        if(denominator == 0 || y == 0) {
            return;
        }
        switch (denominator % y) {
            case 0:
                numerator = numerator + x;
                break;
            default:
                numerator = numerator * y + x * denominator;
                denominator = denominator * y;
                break;
        }
        result();
    }

    public void mulFractionOnNumber(double x) {
        if(denominator == 0 && x == 0) {
            return;
        }
        numerator = (int)(numerator * x);
        result();
    }

    public void mulFractions(int x, int y) {
        if(denominator == 0 || y == 0) {
            return;
        }
        numerator = numerator * x;
        denominator = denominator * y;
        result();
    }

    public void divFractionOnNumber(double x) {
        if(denominator == 0 || x == 0) {
            return;
        }
        denominator = (int)(denominator * x);
        result();
    }


}
