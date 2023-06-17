package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("DEXP Aquilon C14-ICW202", 8,
                128, "Windows 11", "Silver"));
        notebooks.add(new Notebook("Lenovo IdeaPad 3 15IML05", 8,
                256, "Windows 11", "Blue"));
        notebooks.add(new Notebook("Xiaomi RedmiBook 15", 8,
                256, "Windows 11 Home", "Grey"));
        notebooks.add(new Notebook("HP Spectre x360", 8,
                256, "Windows 10", "Gold"));
        notebooks.add(new Notebook("Asus ROG Zephyrus G14", 16,
                512, "Windows 11", "White"));
        notebooks.add(new Notebook("Acer Predator Helios 300", 16,
                512, "Windows 10", "Black"));
        notebooks.add(new Notebook("Microsoft Surface Laptop 4", 8,
                256, "Windows 10", "Platinum"));
        notebooks.add(new Notebook("Razer Blade 15", 16,
                1000, "Windows 10", "White"));
        notebooks.add(new Notebook("Lenovo Yoga C940", 16,
                512, "Windows 11", "Grey"));
        notebooks.add(new Notebook("Apple MacBook", 8,
                256, "macOS", "Silver"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number corresponding to  " +
                "criteria:");
        System.out.println("1 - RAM");
        System.out.println("2 - HDD");
        System.out.println("3 - OS");
        System.out.println("4 - Color");

        int criteria = scanner.nextInt();
        scanner.nextLine();

        switch (criteria) {
            case 1 -> {
                System.out.print("Enter min volume of RAM: ");
                int minRAM = scanner.nextInt();
                scanner.nextLine();
                notebooks = FilterUtils.filterByRAM(notebooks, minRAM);
            }
            case 2 -> {
                System.out.print("Enter min volume of HDD: ");
                int minHDD = scanner.nextInt();
                scanner.nextLine();
                notebooks = FilterUtils.filterByHDD(notebooks, minHDD);
            }
            case 3 -> {
                System.out.print("Enter OS: ");
                String operatingSystem = scanner.nextLine();
                notebooks = FilterUtils.filterByOperatingSystem(notebooks,
                        operatingSystem);
            }
            case 4 -> {
                System.out.print("Enter color: ");
                String color = scanner.nextLine();
                notebooks = FilterUtils.filterByColor(notebooks, color);
            }
            default -> {
                System.out.println("Something is incorrect");
                return;
            }
        }

        System.out.println("\nResult:");
        if (notebooks.isEmpty()) {
            System.out.println("Nothing found :(");
        } else {
            for (Notebook notebook : notebooks) {
                System.out.println(notebook);
            }
        }
    }
}