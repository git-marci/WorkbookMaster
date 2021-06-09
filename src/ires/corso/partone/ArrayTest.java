package ires.corso.partone;

import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args)
    {
        System.out.println("Inserisci un array (numeri separati da |, esempio: 1|2|3|...)");
        System.out.print("==>");
        Scanner in = new Scanner(System.in);
        String nl = in.nextLine();
        //String[] strArr = nl.split("\\|");
        String[] strArr = nl.split(" ");

        int[] intArr = new int[strArr.length];

        for(int j = 0; j < strArr.length; j++) {
            System.out.printf("Elemento %d-esimo dell'array ==> %s\n", j + 1, strArr[j]);
            intArr[j] = Integer.parseInt(strArr[j]);
        }

        System.out.print("Dimmi l'elemento da cercare: ");
        int j = in.nextInt();
        int p = elemPositionInArray(intArr, j);
        System.out.printf("L'elemento si trova in posizione %d\n", p);
    }

    // Scrivere un metodo java che accetta in ingresso un
    // array di int e un numero, restituendo posizione di
    // quel numero nell'array o -1 se il numero non è
    // presente nell'array
    //
    // Esempio:
    // - se intArray == {1, 2, 3, 4} ==> elemPositionInArray(intArray, 3) == 2
    // - se intArray == {1, 2, 3, 4} ==> elemPositionInArray(intArray, 7) == -1
    //
    public static int elemPositionInArray(int[] intArray, int elem) {
        int j = 0;
        int thereIs = -1;

        /* for...
         * cerco l'elemento, se c'è passo la posizione aggiornando thereIs
         */

        return thereIs;
    }

    // Scrivere un metodo java che accetta in ingresso un
    // array di int e ne costruisce una copia che non
    // contiene gli eventuali elementi duplicato
    //
    // Esempio:
    // - se intArray == {1, 2, 2, 3, 4} ==> removeDuplicates(intArray) == {1, 2, 3, 4}
    // - se intArray == {11, 55, 22, 55, 44} ==> removeDuplicates(intArray) == {11, 55, 22, 44}
    // - se intArray == {1, 2, 3, 4} ==> removeDuplicates(intArray) ==  {1, 2, 3, 4}
    //
    // Non c'è un metodo per rimuovere un elemento da un array.
    // Bisogna costruire un ALTRO array, che non contenga i numeri che
    // sono duplicati nell'array originale.
    //
    public static int[] removeDuplicates(int[] arrayWithDuplicates) {
        return null;
    }
}
