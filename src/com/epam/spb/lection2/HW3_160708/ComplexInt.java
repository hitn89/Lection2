package com.epam.spb.lection2.HW3_160708;

    public class ComplexInt {

        public static void main(String[] args) {

            ComplexInt complexint = new ComplexInt(1, 2);
            complexint.complexViewInt();
            complexint.addComplexInt(3, 4);
            complexint.complexViewInt();
            complexint.subComplexInt(5, 6);
            complexint.complexViewInt();
            complexint.multComplexInt(7, 8);
            complexint.complexViewInt();
            ComplexInt complexdouble = new ComplexInt(-9.0, 10.0);
            complexdouble.complexViewDouble();

        }

        private int a;
        private int b;
        private double d1;
        private double d2;

        public ComplexInt(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public ComplexInt(double d1, double d2) {
            this.d1 = d1;
            this.d2 = d2;
        }

        public void complexViewInt() {
            System.out.println(a + (b < 0 ? "" : "+") + b + "i");
        }

        public void complexViewDouble() {
            System.out.println(d1 + (d2 < 0 ? "" : "+") + d2 + "i");
        }

        public void addComplexInt(int inta, int intb) {
            a = a + inta;
            b = b + intb;
        }

        public void addComplexDouble(double double1, double double2) {
            d1 = d1 + double1;
            d2 = d2 + double2;
        }

        public void subComplexInt(int inta, int intb) {
            a = a - inta;
            b = b - intb;
        }

        public void subComplexDouble(double double1, double double2) {
            d1 = d1 - double1;
            d2 = d2 - double2;
        }

        public void multComplexInt(int inta, int intb) {
            int tempa = a;
            a = a * inta - b * intb;
            b = b * inta + tempa * intb;
        }

        public void multComplexDouble(double double1, double double2) {
            int tempa = a;
            d1 = d1 * double1 - d2 * double2;
            d2 = d2 * double1 + tempa * double2;
        }
}
