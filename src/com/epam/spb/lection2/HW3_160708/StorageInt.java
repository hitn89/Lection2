package com.epam.spb.lection2.HW3_160708;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StorageInt implements Iterable<Integer> {

    public static void main(String[] args) {

        StorageInt storage = new StorageInt();

        storage.add(10);
        storage.add(20);
        storage.add(30);
        storage.add(0,1);
        storage.add(1,2);

        System.out.println("Размер: " + storage.size());
        System.out.println("Выбран эллемент: " + storage.get(2));

        storage.addUniqueElement(25);
        storage.addUniqueElement(35);

        System.out.print("Перед удалением: ");
        for(int el: storage){
            System.out.print(el+",");
        }
        System.out.println();

        System.out.print("После удаления: ");
        storage.remove(0);

        for(int el: storage){
            System.out.print(el+",");
        }
    }

    private List<Integer> integerList = new ArrayList<>();


    public int size() {
        return integerList.size();
    }

    public void add(int index, Integer element) {
        integerList.add(index, element);
    }

    public boolean add(Integer integer) {
        integerList.add(integer);
        return true;
    }

    public Integer get(int index) {
        return integerList.get(index);
    }

    public boolean addUniqueElement(Integer element){
        if(!integerList.contains(element)){
            integerList.add(element);
            return true;
        }else{
            return false;
        }
    }

    public Integer remove(int index) {
        return integerList.remove(index);
    }

    @Override
    public Iterator<Integer> iterator() {
        return integerList.iterator();
    }
}
