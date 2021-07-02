package ires.corso.parttwo.todo.repo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializableRepo<T> implements Serializable
{
    private static boolean _init = false;               // flag che indica se il repository è stato inizializzato
    private static String _fileName;                    // file da usare per serializzazione/deserializzazione
    private static SerializableRepo _instance = null;   // unica istanza del repository;

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
    public static <R extends SerializableRepo> R getRepo() throws Exception {
        if(!_init) {
            throw new Exception("ToDo Repository has not been initialized");
        }
        if(_instance == null) {
            if(!Files.exists(Paths.get(_fileName)))
                _instance = null; //new R();
            else
                _instance = loadFromFile();
        }
        return (R)_instance;
    }

    // Deserializza l'istanza del ToDoRepository da file
    private static <R extends SerializableRepo> R loadFromFile() throws IOException, ClassNotFoundException {
        R _object;
        try (FileInputStream file = new FileInputStream(_fileName);
             ObjectInputStream in = new ObjectInputStream(file);)
        {
            _object = (R)in.readObject();
        }
        return _object;
    }

    // Salvataggio su file
    public void writeToFile(String fileName) throws IOException
    {
        try(FileOutputStream file = new FileOutputStream(_fileName);
            ObjectOutputStream out = new ObjectOutputStream(file)) {
            out.writeObject(this);
        }
    }
}
