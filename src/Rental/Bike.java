package Rental;

public class Bike extends Vehicle{

    private int engineCapacity;
    private boolean isFaired;

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isFaired() {
        return isFaired;
    }

    public void setFaired(boolean faired) {
        isFaired = faired;
    }

    public Bike(String brand, String model, int year, double dailyCost, int engineCapacity, boolean isFaired) {
        super(brand, model, year, dailyCost);
        this.engineCapacity = engineCapacity;
        this.isFaired = isFaired;
    }

    @Override
    public void showInfo() {
        System.out.println("\nInformações da Motocicleta");
        super.showInfo();
        System.out.println("Cilindradas: " + getEngineCapacity());
        System.out.print("Carenada: ");
        if(isFaired){
            System.out.println("Sim");
        }
        else{
            System.out.println("Não");
        }
    }
}
