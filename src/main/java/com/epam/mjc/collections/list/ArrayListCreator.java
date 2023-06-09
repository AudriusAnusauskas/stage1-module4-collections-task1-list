package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 2; i < sourceList.size(); i=i+3){
            arrayList.add(sourceList.get(i));
            arrayList.add(sourceList.get(i));
        }

        return arrayList;
    };

    public static void main(String[] args) {
        ArrayListCreator alc = new ArrayListCreator();
        ArrayList<String> al = alc.createArrayList(List.of("The", "ArrayList", "class", "has", "many", "useful", "methods"));
        System.out.println(al);
    }
}
