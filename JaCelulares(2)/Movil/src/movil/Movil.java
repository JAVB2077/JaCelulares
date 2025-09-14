package movil;

import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Joseph
 */
public class Movil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cellphone Celphone1 = new Cellphone();
        Cellphone Celphone2 = new Cellphone("Desconocido", "Desconocido", 0, 0.00F, false);
        Scanner scanner = new Scanner(System.in);

        boolean a = true;
        boolean validInput = false;
        System.out.println("Estado inicial de los Celphones\n" + "Celphone1\n"
                + Celphone1.toString() + "\nCelphone2\n" + Celphone2.toString());
        //==Celphone1==
        System.out.println("\n==Celphone1");
        System.out.println("Nombre de Celphone1: ");
        Celphone1.setName(scanner.nextLine());
        System.out.println("Número de Celphone1: ");
        Celphone1.setNumber(scanner.nextLine());
        System.out.println("Batería de Celphone1: ");
        String input = scanner.nextLine();
        while (!validInput) {
            try {
                byte batery = Byte.parseByte(input);
                if (batery > 100 || batery < 0) {
                    System.out.println("Entrada inválida.");
                    input = scanner.nextLine();
                } else {
                    validInput = true;
                    Celphone1.setBatery(batery);
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debe ingresar un número.");
                input = scanner.nextLine();
            }
        }
        validInput = false;
        Celphone1.setBatery(Byte.parseByte(input));

        System.out.println("Saldo de Celphone1: ");
        input = scanner.nextLine();

        while (!validInput) {
            try {
                if (Float.parseFloat(input) < 0) {
                    System.out.println("Entrada inválida. Número negativo");
                    input = scanner.nextLine();
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Se espera un número");
                input = scanner.nextLine();
            }
        }
        validInput = false;
        Celphone1.setAcountBalance(Float.parseFloat(input));

        System.out.println("Celphone1 On/Off (Y/N): ");
        input = scanner.nextLine();

        while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
            System.out.println("Entrada inválida. Por favor ingrese Y o N: ");
            input = scanner.nextLine();
        }

        if (input == "N") {
            a = false;
        }
        Celphone1.setOn(a);

        //==Celphone2==
        System.out.println("\n==Celphone2");
        System.out.println("Nombre de Celphone2: ");
        Celphone2.setName(scanner.nextLine());
        System.out.println("Número de Celphone2: ");
        Celphone2.setNumber(scanner.nextLine());
        System.out.println("Batería de Celphone2: ");
        input = scanner.nextLine();
        while (!validInput) {
            try {
                byte batery = Byte.parseByte(input);
                if (batery > 100 || batery < 0) {
                    System.out.println("Entrada inválida.");
                    input = scanner.nextLine();
                } else {
                    validInput = true;
                    Celphone1.setBatery(batery);
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debe ingresar un número.");
                input = scanner.nextLine();
            }
        }
        validInput = false;
        Celphone2.setBatery(Byte.parseByte(input));

        System.out.println("Saldo de Celphone2: ");
        input = scanner.nextLine();
        while (!validInput) {
            try {
                if (Float.parseFloat(input) < 0) {
                    System.out.println("Entrada inválida. Número negativo");
                    input = scanner.nextLine();
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Se espera un número");
                input = scanner.nextLine();
            }
        }
        validInput = false;
        Celphone2.setAcountBalance(Float.parseFloat(input));

        System.out.println("Celphone2 On/Off (Y/N): ");

        while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
            System.out.println("Entrada inválida. Por favor ingrese Y o N: ");
            input = scanner.nextLine();
        }

        if (input == "N") {
            a = false;
        }
        Celphone2.setOn(a);
        
        System.out.println("Estado inicial de los Celphones\n" + "Celphone1\n"
                + Celphone1.toString() + "\nCelphone2\n" + Celphone2.toString());
        
    }

}
