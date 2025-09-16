package Rental;

import java.util.Scanner;

public class Main {

    static int Menu() {
        System.out.println("Menu");
        System.out.println("1 - Gerenciar Clientes");
        System.out.println("2 - Gerenciar Veiculos");
        System.out.println("3 - Gerenciar Locações");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opcao: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {

        do {
            switch (Menu()) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }while (true);

        /*var p1 = new Costumer("123", "Felipe", "0987", "000001");
        p1.showInfo();

        var v1 = new Car("Volkswagen", "Polo", 2025, 300.00, 5, 4);
        v1.showInfo();

        var v2 = new Bike("Honda", "CG150", 2025, 100.00, 150, false);
        v2.showInfo();

        var v3 = new Truck("Scania", "1313", 2025, 800.00, 10, 3);
        v3.showInfo();*/
    }
}
