package ires.corso.parttwo.todo;

import java.util.Scanner;

// GRUPPO 3/4:
public class ToDoApplication
{
    private static ToDoList tdl = new ToDoList();

    public static void main(String[] args) {
        ToDoRepository ttt = ToDoRepository.getToDoRepository();
        doMenu();
    }

    // 1. Deserializza il repository da file (carica i dati dell'ultimo salvataggio)
    //    creando una classe Repository
    // 2. Gestione del MENU principale con un loop e due switch
    // 3. In corrispondenza di una scelta dell'utente (ramo dello switch) chiama
    //    le classi necessarie per svolgere l'azione
    // 4. Quando l'utente sceglie dal menu di USCIRE, chiede conferma e serializza in uscita

    // Refactoring con le classi: OBIETTIVI
    // ------------------------------------
    // 1. Leggibilità ==> switch nested sono difficili da leggere (basterebbe una funzione di stampa?)
    // 2. Manutenibilità ==> meno righe di codice, + facile da manutenere
    // 3. Estensibilità ==> possiamo aggiungere voci
    // 4. Riuso del codice


    public static void doMenu() {
        while(true) {
            System.out.println();
            System.out.println("--------------------------TO DO LIST--------------------------");
            System.out.println("Scegli cosa vuoi fare!");
            System.out.println("1. VISUALIZZA\n");
            System.out.println("2. AGGIUNGI, RIMUOVI, MODIFICA\n");
            System.out.println("3. IMPORT/EXPORT\n");
            System.out.println("4. USCITA\n");
            System.out.println();

            Scanner in = new Scanner(System.in);
            String userInsert= in.nextLine();

            switch(userInsert){
                case "1":
                    System.out.println("1. Per priorità");
                    System.out.println("2. Per Data");
                    System.out.println("3. Per cjapilu");
                    // Aggiunto SEMPRE
                    System.out.println("4. TORNA AL MENU PRINCIPALE");

                    userInsert = in.nextLine();

                    switch (userInsert){
                        case "1":
                            //funzione corrispondente;
                            tdl.viewByPriority();
                            break;

                        case "2":
                            //tdl.viewByDate();
                            break;

                        case "3":
                            //tdl.viewByStatus();
                            break;

                        // E se l'utente inserisce qualcosa di altro?
                    }
                    break;
                case "2":
                    System.out.println("1.");
                    System.out.println("2.");
                    System.out.println("3.");
                    userInsert = in.nextLine();

                    switch(userInsert){
                        case "1":
                            //funzione corrispondente
                            // CHIAMIAMO TODOMANAGER.createNewTodo()
                            break;
                        case "2":
                            //funzione corrispondente
                            break;
                        case "3":
                            //funzione corrispondente
                            break;

                    }
                    break;
                case "3":
                    System.out.println();
                    System.out.println();
                    userInsert = in.nextLine();
                    switch (userInsert){
                        case "1":
                            //funzione corrispondente;
                            break;
                        case "2":
                            //funzione corrispondente;
                            break;
                    }
                    break;

                case "4":
                    System.out.println("Arrivederci!");
                    System.exit(0);
                    break;
            }

        }
    }
}
