package Rental;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Costumer CreateCostumer(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do cliente: ");
        var name = sc.nextLine();
        System.out.println("Informe o CPF do cliente: ");
        var cpf = sc.nextLine();
        System.out.println("Informe o numero do cartão de credito do cliente: ");
        var credit =  sc.nextLine();
        System.out.println("Informe o numero da habilitação: ");
        var document = sc.nextLine();

        return new Costumer(cpf, name, credit, document);
    }

    static Vehicle CreateVehicle(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a marca do Veiculo: ");
        var brand = sc.nextLine();
        System.out.println("Informe o modelo do Veiculo: ");
        var model = sc.nextLine();
        System.out.println("Informe o ano do Veiculo: ");
        var year =  sc.nextInt();
        sc.nextLine();
        System.out.println("Informe o valor da diária do Veiculo: ");
        var dailyCost = sc.nextDouble();
        sc.nextLine();

        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.println("3 - Caminhão");
        System.out.print("Informe o Tipo de Veiculo Desejado: ");
        int type = sc.nextInt();
        sc.nextLine();

        if(type == 1){

            System.out.println("Informe a quantidade de passsageiros: ");
            var passengers = sc.nextInt();
            sc.nextLine();
            System.out.println("Informe a quantidade de portas do carro: ");
            var doors = sc.nextInt();
            sc.nextLine();

            return new Car(brand, model, year, dailyCost, passengers, doors);
        }
        else if(type == 2){
            boolean faired;

            System.out.println("Informe as cilindradas da moto: ");
            var engine = sc.nextInt();
            sc.nextLine();
            System.out.println("A moto é carenada? ");

            if(sc.nextLine().equals("Sim")){
                faired = true;
            }
            else{
                faired = false;
            }

            return new Bike(brand, model, year, dailyCost, engine, faired);
        }
        else{

            System.out.println("Informe a quantidade de rodas do Caminhão: ");
            var wheels = sc.nextInt();
            sc.nextLine();
            System.out.println("Informe a quantidade de eixos: ");
            var axles = sc.nextInt();
            sc.nextLine();

            return new Truck(brand, model, year, dailyCost, wheels, axles);
        }

    }

    static Rental CreateRental(ArrayList<Costumer> costumerList, ArrayList<Vehicle> vehicleList){

        if(costumerList.isEmpty() || vehicleList.isEmpty()){
            System.out.println("Não existem cadastros de veiculos ou clientes no sistema.");
            return null;
        }

        Costumer costumer;
        Vehicle vehicle;
        Scanner sc = new Scanner(System.in);

        do {
            costumer = searchCostumer(costumerList);
            if (costumer == null) {
                System.out.println("Cliente não encontrado!");
            }
        }while(costumer == null);


        do {
            vehicle = searchVehicle(vehicleList);
            if (vehicle == null) {
                System.out.println("Veiculo não encontrado!");
            }
        }while(vehicle == null);

        System.out.println("Informe a quantiadade de dias que o veiculo será alugado: ");
        int rentalDays = sc.nextInt();

        return new Rental(costumer, vehicle, rentalDays);

    }

    static void ShowCostumerList(ArrayList<Costumer> list){
        if(list.isEmpty()){
            System.out.println("Lista vazia");
        }
        else {
            for(int i = 0; i < list.size(); i++){
                System.out.println("Nome: " + list.get(i).getName());
                System.out.println("CPF: " + list.get(i).getCpf());
                System.out.println("Cartão Cadastrdo: " + list.get(i).getCreditCardNumber());
                System.out.println("CNH: " + list.get(i).getLicenseNumber());
            }
        }
    }

    static void ShowVehicleList(ArrayList<Vehicle> list){
        if(list.isEmpty()){
            System.out.println("Lista vazia");
        }
        else {
            for(int i = 0; i < list.size(); i++){
                System.out.println("Marca: " + list.get(i).getBrand());
                System.out.println("Modelo: " + list.get(i).getModel());
                System.out.println("Ano: " + list.get(i).getYear());
                System.out.println("Valor da Diária: R$" + list.get(i).getDailyCost());

                if(list.get(i) instanceof Car car){
                    System.out.println("Portas: " + car.getNumberOfDoors());
                    System.out.println("Numero máximo de passageiros: " + car.getNumberOfPassengers());
                }
                if(list.get(i) instanceof Bike bike){
                    System.out.println("Cilindradas: " + bike.getEngineCapacity() + " cc");
                    System.out.println("É Carenada: " + bike.isFaired());
                }
                if(list.get(i) instanceof Truck truck){
                    System.out.println("Numero de eixos: " + truck.getNumberOfAxles());
                    System.out.println("Numero de rodas: " + truck.getNumberOfWheels());
                }
            }
        }
    }

    static void ShowRentalsList(ArrayList<Rental> list){
        if(list.isEmpty()){
            System.out.println("Lista vazia");
        }
        else {
            for(int i = 0; i <= list.size()-1; i++){
                list.get(i).showRentalDetails();
            }
        }
    }

    static Costumer searchCostumer(ArrayList<Costumer> costumers){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o CPF do cliente: ");
        String cpf = sc.nextLine();

        for (int i = 0; i <= costumers.size()-1; i++){
            if(costumers.get(i).getCpf().equals(cpf)){
                return costumers.get(i);
            }
        }
        return null;
    }

    static Vehicle searchVehicle(ArrayList<Vehicle> vehicles){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o modelo do Veiculo: ");
        String model = sc.nextLine();

        for (int i = 0; i <= vehicles.size()-1; i++){
            if(vehicles.get(i).getModel().equals(model)){
                return vehicles.get(i);
            }
        }
        return null;
    }

    static Rental searchRental(ArrayList<Rental> rentals, ArrayList<Costumer> costumers){

        String cpf = searchCostumer(costumers).getCpf();

        for (int i = 0; i <= rentals.size()-1; i++){
            if(rentals.get(i).getCostumer().getCpf().equals(cpf)){
                return rentals.get(i);
            }
        }

        return null;
    }

    public static void main(String[] args) {

        var costumers = new ArrayList<Costumer>();
        var vehicles = new ArrayList<Vehicle>();
        var rentals = new ArrayList<Rental>();

        var optionsMain = new ArrayList<String>();
        optionsMain.add("1 - Gerenciar Clientes");
        optionsMain.add("2 - Gerenciar Veículos");
        optionsMain.add("3 - Gerenciar Locações");
        optionsMain.add("4 - Sair");

        var mainMenu = new Menu(optionsMain, "Menu Principal");

        var costumerMenuList = new ArrayList<String>();

        costumerMenuList.add("1 - Cadastrar Cliente");
        costumerMenuList.add("2 - Listar Todos os Cliente");
        costumerMenuList.add("3 - Remover Cliente");
        costumerMenuList.add("0 - Voltar ao Anterior");

        var costumerMenu = new Menu(costumerMenuList, "Menu Clientes");

        var vehicleOptions = new ArrayList<String>();
        vehicleOptions.add("1 - Cadastrar Veiculo");
        vehicleOptions.add("2 - Listar Todos os Veiculos");
        vehicleOptions.add("3 - Remover Veiculo");
        vehicleOptions.add("0 - Voltar ao Anterior");

        var vehicleMenu = new Menu(vehicleOptions, "Menu Veiculos");

        var rentalOptions = new ArrayList<String>();
        rentalOptions.add("1 - Cadastrar Locação");
        rentalOptions.add("2 - Listar Todas as Locações");
        rentalOptions.add("3 - Remover Locação");
        rentalOptions.add("0 - Voltar ao Anterior");

        var rentalMenu = new Menu(rentalOptions, "Menu Locações");

        do {
            switch (mainMenu.showMenu()) {
                case 1:
                    switch (costumerMenu.showMenu()) {
                        case 1:
                            //Cadastrar Cliente
                            costumers.add(CreateCostumer());
                            break;
                        case 2:
                            //Listar Todos
                            ShowCostumerList(costumers);
                            break;
                        case 3:
                            //Remover Cliente
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opção Inexiste.");
                    }
                    break;
                case 2:
                    switch (vehicleMenu.showMenu()) {
                        case 1:
                            vehicles.add(CreateVehicle());
                            break;
                        case 2:
                            ShowVehicleList(vehicles);
                            break;
                        case 3:
                            //Remover Veiculo
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opção Inexiste.");
                    }
                    break;
                case 3:
                    switch (rentalMenu.showMenu()) {
                        case 1:
                            rentals.add(CreateRental(costumers, vehicles));
                            break;
                        case 2:
                            ShowRentalsList(rentals);
                            break;
                        case 3:
                            rentals.remove(searchRental(rentals, costumers));
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opção Inexiste.");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (true);
    }
}
