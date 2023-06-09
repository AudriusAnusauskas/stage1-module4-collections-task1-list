package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i<sourceList.size(); i++){
            if (sourceList.get(i) % 2 != 0) {
                linkedList.addFirst(sourceList.get(i));
            } else {
                linkedList.addLast(sourceList.get(i));
            }
        }
        return linkedList;
    }

    public static void main(String[] args) {
        LinkedListCreator llc = new LinkedListCreator();
        LinkedList<Integer> ll = llc.createLinkedList(List.of(2, 14, 3, 6, 5, 7));
        System.out.println(ll);
    }
}
