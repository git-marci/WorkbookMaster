package ires.corso.parttwo.todo;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// GRUPPO 3:
public class ToDoImportExport
{
    private static String convertToString(ToDo t) {
        return "piropiro....";
    }

    public static void exportToFile() throws IOException
    {
        // Chiuede all'utente un nome file di export...
        String fileName = "FILE INSERITO DA UTENTE";
        try (PrintWriter outputStream = new PrintWriter(new FileWriter(fileName)))
        {
            List<ToDo> toDoList = ToDoRepository.getToDoRepository().getToDoList();
            Iterator<ToDo> tdi = toDoList.iterator();

            while (tdi.hasNext()) {
                String sToDo = convertToString(tdi.next());
                outputStream.println(sToDo);
            }
        }
    }

    public static void importToFile() throws IOException {
        // Chiede all'utente un nome file di import...
        String fileName = "FILE INSERITO DA UTENTE";
        ArrayList<String> fileLines = new ArrayList<>();

        try (BufferedReader inputStream = new BufferedReader(new FileReader(fileName))) {
            String l;
            while ((l = inputStream.readLine()) != null) {
                fileLines.add(l);
            }
        }

        // Loop di conversione da stringhe (linne file) a oggetti TO-DO
        // 1: conversione da linea del file a array di stringhe
        // 2: loop in cui:
        //    - si validano i campi (es. titolo non nullo, descriizone non nulla...)
        //    - si invoca il costruttore di ToDo passando i dati
        //     - Repository.add()
        // 3. Se qualcosa va male ==> output su schermop ("Ho saltato una riga per nome nullo...")
        // 4. alla fine: ho importato XYZ nuovi TOOD
    }
}
