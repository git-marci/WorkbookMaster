package ires.corso.parttwo.todo.repo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToDoRepository implements Serializable
{
    private static boolean _init = false;               // flag che indica se il ToDoRepository è stato inizializzato
    private static String _fileName;                    // file da usare per serializzazione/deserializzazione
    private static ToDoRepository _repository = null;   // unica istanza del repository;

    // Inizializzazione: imposta file di serializzazione
    public static boolean init(String fileName) {
        try {
            Path p = Paths.get(fileName);
            _fileName = p.toString();
            _init = true;
        }
        catch(InvalidPathException ipe) {
            System.out.println(ipe.getMessage());
        }
        return _init;
    }

    // Singleton pattern: carica da file e restituisce sempre la stessa istanza
    public static ToDoRepository getRepo() throws Exception {
        if(!_init) {
            throw new Exception("ToDo Repository has not been initialized");
        }
        if(_repository == null) {
            if(!Files.exists(Paths.get(_fileName)))
                _repository = new ToDoRepository();
            else
                loadFromFile();
        }
        return _repository;
    }

    // Deserializza l'istanza del ToDoRepository da file
    private static void loadFromFile() throws IOException, ClassNotFoundException {
        try (FileInputStream file = new FileInputStream(_fileName);
             ObjectInputStream in = new ObjectInputStream(file);)
        {
            _repository = (ToDoRepository)in.readObject();
        }
    }

    // METODI E MEMBRI DI ISTANZA
    Map<Long, ToDo> _data = new HashMap<>();    // Mappa ID -> TO-DO
    private long _idSeed;                       // Contatore per la generazione degli id

    // Costruttore privato
    private ToDoRepository() {}

    // Utilizzato per generare un nuovo ID
    public long getNewId() {
        _idSeed++;
        return _idSeed;
    }

    // Eliminazione di un TO-DO
    public void delete(Long ID) {
        // Cerco id passato in input nella collection dei TO-DO
        // rimuovo il TO-DO
    };

    // Aggiunta di un TO-DO
    public void add(ToDo t) {
        // 1. possibilità
        // -----------------------------------------------
        // t contiene tutti i campi del TO-DO, TRANNE l'ID
        // si assegna a t un ID = getNewId();
        // si salva ID nella collection dei TO-DO

        // 2. possibilità
        // -----------------------------------------------
        // t contiene tutti i campi del TO-DO ANCHE l'ID
        // si salva ID nella collection dei TO-DO
    }

    // Modifica di un un TO-DO
    public void update(ToDo t) {
        // 1. possibilità
        // -----------------------------------------------
        // t è una copia clonata di un TO-DO
        // t contiene tutte le modifiche fatte, campo per campo
        // t sovrascrive la sua versione precedente nella collection (chiamata a add)

        // 2. possibilità
        // -----------------------------------------------
        // t è una copia clonata di un TO-DO
        // t contiene tutte le modifiche fatte, campo per campo
        // si prende Id di t e si verifica se esiste un TO-DO corrispondente
        // con remove/put si sostituisce la t alla sua versione precedente
    }

    // Restituisce una lista di tutti i TO-DO
    public List<ToDo> getToDoList() {
        // restituisce lista di tutti i TO-DO esistenti
        return null;
    }

    // Salvataggio su file
    public void writeToFile(String fileName) throws IOException
    {
        try(FileOutputStream file = new FileOutputStream(_fileName);
            ObjectOutputStream out = new ObjectOutputStream(file)) {
            out.writeObject(_repository);
        }
    }
}
