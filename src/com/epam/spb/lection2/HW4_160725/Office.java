package com.epam.spb.lection2.HW4_160725;

import java.util.ArrayList;

public class Office {

    private ArrayList<subject> OfficeList = new ArrayList<subject>();

    public void addList() {
        subject bluePen = new subject();
        bluePen.setNameOffice("Ручка синяя");
        bluePen.setQuantityOffice(5);
        bluePen.setPriceOffice(12.5);
        OfficeList.add(bluePen);

        subject blackPen = new subject();
        blackPen.setNameOffice("Ручка черная");
        blackPen.setQuantityOffice(2);
        blackPen.setPriceOffice(12.5);
        OfficeList.add(blackPen);

        subject ruler = new subject();
        ruler.setNameOffice("Линейка");
        ruler.setQuantityOffice(1);
        ruler.setPriceOffice(28);
        OfficeList.add(ruler);
    }

    class subject {

        private String nameOffice;
        private int quantityOffice;
        private double priceOffice;

        public void setNameOffice(String name) {
            nameOffice = name;
        }

        public void setQuantityOffice(int quantity) {
            quantityOffice = quantity;
        }

        public void setPriceOffice(double price) {
            priceOffice = price;
        }

        public String getNameOffice() {
            return nameOffice;
        }

        public int getQuantityOffice() {
            return quantityOffice;
        }

        public double getPriceOffice() {
            return priceOffice;
        }
    }

    public void openList() {
        double itogo = 0.0;
        for (int i = 0; i < OfficeList.size(); i++) {
            System.out.println("Наименование: " + OfficeList.get(i).getNameOffice() + " Колличество: " +
                    OfficeList.get(i).getQuantityOffice() + " стоимость: " + OfficeList.get(i).getPriceOffice() + " руб.");
            itogo += (OfficeList.get(i).getQuantityOffice() * OfficeList.get(i).getPriceOffice());
        }
        System.out.println("Итого: " + itogo + " руб.");
    }

    public static void main(String[] args) {
        Office office = new Office();
        office.addList();
        office.openList();
    }

}
