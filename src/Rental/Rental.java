package Rental;

public class Rental {

    private Costumer costumer;
    private Vehicle vehicle;
    private int rentalDays;

    public Rental(Costumer costumer, Vehicle vehicle, int rentalDays) {
        this.costumer = costumer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double calculateRental() {
        return rentalDays * this.vehicle.getDailyCost();
        //System.out.println("Valor total das diárias: " + total);
    }

/*    @Override
    public String toString() {
        var info = "Informações da Locação:\n"
                + "\nCliente: " + this.costumer.showInfo()
                + "\nVeiculo: " + this.vehicle.showInfo()
                + "\nValor Total: " + this.calculateRental();
        return info;
    }*/

    public void showRentalDetails() {
        System.out.println("Detalhes da Locação:");
        System.out.println("Cliente: " + this.costumer.getName());
        System.out.println("Veiculo: " + this.vehicle.getBrand() + " " + this.vehicle.getModel());
        System.out.println("Valor Total: R$" + this.calculateRental());
    }
}
