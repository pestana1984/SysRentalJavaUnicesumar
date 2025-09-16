package Rental;

public class Truck extends Vehicle{

    private int numberOfWheels;
    private int numberOfAxles;

    public Truck(String brand, String model, int year, double dailyCost, int numberOfWheels, int numberOfAxles) {
        super(brand, model, year, dailyCost);
        this.numberOfWheels = numberOfWheels;
        this.numberOfAxles = numberOfAxles;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public void showInfo() {
        System.out.println("\nInformações do Caminhão");
        super.showInfo();
        System.out.println("Quantidade de Rodas: " + getNumberOfWheels());
        System.out.println("Quantidade de Eixos: " + getNumberOfAxles());
    }
}
