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

    static void ShowCostumerList(ArrayList<Costumer> list){
        if(list.isEmpty()){
            System.out.println("Lista vazia");
        }
        else {
            for(int i = 0; i < list.size(); i++){
                System.out.println(list.get(i).getName());
                System.out.println(list.get(i).getCpf());
                System.out.println(list.get(i).getCreditCardNumber());
                System.out.println(list.get(i).getLicenseNumber());
            }
        }
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
                            //Cadastrar Veiculo
                            break;
                        case 2:
                            //Listar Todos
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
                            //Cadastrar Locação
                            break;
                        case 2:
                            //Listar Todos
                            break;
                        case 3:
                            //Remover Locação
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
