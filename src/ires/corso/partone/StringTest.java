package ires.corso.partone;

public class StringTest {

    // Scrivere un programma in Java che:
    // 1. accetta in input 3 stringhe (da riga di comando)
    // 2. verifica che le stringhe siano 3
    // 3. calcola la lunghezza di ciascuna stringa
    // 4. trova il carattere iniziale e finale di ciascuna stringa
    // 5. per tutte e 3 le stringhe stampa un report:
    //
    // "La stringa " .... " ha lunghezza " .... " comincia per " ... " e finisce per " ...

    public static void main(String[] args) {
        System.out.println("non faccio niente");
        if(args.length != 3)
            System.out.println("manca una stringa");
        else {
            System.out.println("La lunghezza della terza stringa = " + args[2].length());
            System.out.println("la terza stringa termina con " + args[2].charAt(args[2].length()-1));

        }
    }
}
