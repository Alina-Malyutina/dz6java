package org.example;

import java.util.HashSet;
import java.util.Set;

public class FilterUtils {
        // Фильтрует ноутбуки по минимальному объему оперативной памяти
        public static Set<Notebook> filterByRAM(Set<Notebook> notebooks,
                                                int minRAM) {
            Set<Notebook> filteredNotebooks = new HashSet<>();
            for (Notebook notebook : notebooks) {
                if (notebook.getRAM() >= minRAM) {
                    filteredNotebooks.add(notebook);
                }
            }
            return filteredNotebooks;
        }

        //Фильтрует ноутбуки по минимальному объему жесткого диска.

        public static Set<Notebook> filterByHDD(Set<Notebook> notebooks,
                                                int minHDD) {
            Set<Notebook> filteredNotebooks = new HashSet<>();
            for (Notebook notebook : notebooks) {
                if (notebook.getHDD() >= minHDD) {
                    filteredNotebooks.add(notebook);
                }
            }
            return filteredNotebooks;
        }
        //Фильтрует ноутбуки по операционной системе.
        public static Set<Notebook>
        filterByOperatingSystem(Set<Notebook> notebooks, String operatingSystem) {
            Set<Notebook> filteredNotebooks = new HashSet<>();
            for (Notebook notebook : notebooks) {
                if
                (notebook.getOS().equalsIgnoreCase(operatingSystem)) {
                    filteredNotebooks.add(notebook);
                }
            }
            return filteredNotebooks;
        }

        //Фильтрует ноутбуки по цвету.
        public static Set<Notebook> filterByColor(Set<Notebook> notebooks,
                                                  String color) {
            Set<Notebook> filteredNotebooks = new HashSet<>();
            for (Notebook notebook : notebooks) {
                if (notebook.getColor().equalsIgnoreCase(color)) {
                    filteredNotebooks.add(notebook);
                }
            }
            return filteredNotebooks;
        }
}
