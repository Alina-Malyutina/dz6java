package org.example;

public class Notebook {
    private final String model;
    private final int RAM;
    private final int HDD;
    private final String OS;
    private final String color;

    public Notebook(String model, int RAM, int HDD, String OS,
                    String color) {
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;
        this.OS = OS;
        this.color = color;
    }

    public int getRAM() {
        return RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return "Model: " + model +
                ", RAM: " + RAM + "GB" +
                ", HDD: " + HDD + "GB" +
                ", OS: " + OS +
                ", Color: " + color;
    }
}

