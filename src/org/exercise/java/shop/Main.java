package org.exercise.java.shop;

public class Main {
    public static void main(String[] args) {
        // Test della classe Prodotto
        Prodotto prodotto = new Prodotto("iPhone", "Il miglior smartphone", 1015.57, 0.22);

        System.out.println("Codice: " + prodotto.getNomeEsteso());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo Base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo IVA: " + prodotto.getPrezzoIVA());

    }
}
