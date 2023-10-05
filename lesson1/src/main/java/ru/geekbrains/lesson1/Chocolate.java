package ru.geekbrains.lesson1;

public class Chocolate extends Product{
    private double calories;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double volume) {
        this.calories = calories;
    }

    public Chocolate(String brand, String name, double price, double calories){
        super(brand, name, price);
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("ШОКОЛАД %s - %s - %.2f - калории: %.2f", brand, name, price, calories);
    }
}
