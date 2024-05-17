package org.exercise.java.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        int numeroConto = random.nextInt(1000) + 1;
        Conto conto = new Conto(numeroConto, nome);

        while (true) {
            System.out.println("\nScegli un'opzione:");
            System.out.println("1. Versare una somma");
            System.out.println("2. Prelevare una somma");
            System.out.println("3. Uscire");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();

            if (scelta == 1) {
                System.out.print("Inserisci la somma da versare: ");
                double somma = scanner.nextDouble();
                conto.versa(somma);
                System.out.println("Operazione completata. Saldo attuale: " + conto.getSaldoFormattato());
            } else if (scelta == 2) {
                System.out.print("Inserisci la somma da prelevare: ");
                double somma = scanner.nextDouble();
                conto.preleva(somma);
                System.out.println("Operazione completata. Saldo attuale: " + conto.getSaldoFormattato());
            } else if (scelta == 3) {
                System.out.println("Uscita dal programma.");
                break;
            } else {
                System.out.println("Scelta non valida. Riprova.");
            }
        }

        scanner.close();
    }
}
