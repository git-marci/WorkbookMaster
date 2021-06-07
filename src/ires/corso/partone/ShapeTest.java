package ires.corso.partone;

import ires.corso.partone.geometric.Trapezio;

import java.util.Scanner;

public class ShapeTest {

    /**
     * Scrivere un programma Java che esegua le seguenti operazioni:
     * 1. chiede all'utente per che tipo di forma geometrica desidera calcolare l'area
     * 2. le figure da trattare sono 3: Quadrato, Triangolo, Trapezio
     * 3. per la figura prescelta, chiede i parametri necessari al calcolo dell'area
     * 4. calcola l'area utilizzando l'apposita formula geometrica
     * 5. stampa il risultato
     *
     * Utilizzare per le parti di codice spcifiche di una figura tre classi,
     * implementando i relativi metodi come "static": Quadrato.java, Trapezio.java, Triangolo.java
     *
     * Per l'input utilizzare la classe Scanner; per discriminare tra le classi da chiamare usate un'istruzione switch
     */
    public static void main(String[] args) {
        System.out.println("non faccio niente");

        double aTrap = Trapezio.computeArea(0, 0, 0);

        Scanner in = new Scanner(System.in);
    }
}
