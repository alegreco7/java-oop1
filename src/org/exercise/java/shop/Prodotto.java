package org.exercise.java.shop;

import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    // Costruttore
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = generateRandomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Metodo privato per generare un codice casuale
    private int generateRandomCode() {
        Random rand = new Random();
        return rand.nextInt(1000000); // numeri fino a 6 cifre
    }

    // Metodo per ottenere il prezzo base
    public double getPrezzoBase() {
        return prezzo;
    }

    // Metodo per ottenere il prezzo comprensivo di iva
    public double getPrezzoIVA() {
        return prezzo * (1 + iva);
    }

    // Metodo per ottenere il nome esteso
    public String getNomeEsteso() {
        return codiceToString() + "-" + nome;
    }

    // Metodo privato per convertire il codice in una stringa con 6 cifre
    private String codiceToString() {
        return String.format("%06d", codice);
    }

    // Metodi getter e setter per gli attributi
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}