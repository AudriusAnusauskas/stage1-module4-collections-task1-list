package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aValue = evaluateFunction(a);
        int bValue = evaluateFunction(b);

        if (aValue != bValue) {
            return Integer.compare(aValue, bValue);
        } else {
            return a.compareTo(b);
        }
    }

    private int evaluateFunction(String input) {
        int x = Integer.parseInt(input);
        return 5 * x * x + 3;
    }
    };


        public static void main(String[] args) {
            List<String> inputList = new ArrayList<>();
            inputList.add("-5");
            inputList.add("-12");
            inputList.add("0");
            inputList.add("20");
            inputList.add("9");
            inputList.add("-20");
            inputList.add("37");

            ListSorter sorter = new ListSorter();
            sorter.sort(inputList);

            System.out.println(inputList);
        }


}
