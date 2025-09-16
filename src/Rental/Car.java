package Rental;

public class Car extends Vehicle {

    private int numberOfPassengers;
    private int numberOfDoors;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String brand, String model, int year, double dailyCost, int numberOfPassengers, int numberOfDoors) {
        super(brand, model, year, dailyCost);
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void showInfo() {
        System.out.println("\nInformações do Carro");
        super.showInfo();
        System.out.println("Numero de Portas: " + getNumberOfDoors());
        System.out.println("Numero máximo de Passageiros: " + getNumberOfPassengers());
    }
}
