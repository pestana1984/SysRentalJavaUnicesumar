package Rental;

abstract class Vehicle {
   private String brand;
   private String model;
   private int year;
   private double dailyCost;

    public Vehicle(String brand, String model, int year, double dailyCost) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.dailyCost = dailyCost;
    }

    public void showInfo(){
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Ano: " + this.year);
        System.out.println("Valor da Diária: " + this.dailyCost);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(double dailyCost) {
        this.dailyCost = dailyCost;
    }
}
