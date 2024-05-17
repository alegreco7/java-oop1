package org.exercise.java.bank;

public class Conto {
    private final int numeroConto;
    private String nomeProprietario;
    private double saldo;

    // Costruttore
    public Conto(int numeroConto, String nomeProprietario) {
        this.numeroConto = numeroConto;
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0.0;
    }

    // Getter per numero di conto (solo lettura)
    public int getNumeroConto() {
        return numeroConto;
    }

    // Getter e Setter per nome del proprietario
    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    // Getter per saldo (solo lettura)
    public double getSaldo() {
        return saldo;
    }

    // Metodo per versare una somma
    public void versa(double somma) {
        if (somma > 0) {
            saldo += somma;
        } else {
            System.out.println("La somma da versare deve essere positiva.");
        }
    }

    // Metodo per prelevare una somma
    public void preleva(double somma) {
        if (somma > 0) {
            if (saldo >= somma) {
                saldo -= somma;
            } else {
                System.out.println("Saldo insufficiente per prelevare questa somma.");
            }
        } else {
            System.out.println("La somma da prelevare deve essere positiva.");
        }
    }

    // Metodo per ottenere le informazioni del conto
    public String getInformazioniConto() {
        return "Numero Conto: " + numeroConto + "\nNome Proprietario: " + nomeProprietario + "\nSaldo: " + saldo + "€";
    }

    // Metodo per ottenere il saldo formattato
    public String getSaldoFormattato() {
        return String.format("%.2f€", saldo);
    }
}
