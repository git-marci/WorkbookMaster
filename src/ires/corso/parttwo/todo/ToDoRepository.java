package ires.corso.parttwo.todo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// GRUPPO 4:

/* GESTORE DELL'ARCHIVIO DEI TO-DO == DATABASE */
public class ToDoRepository implements Serializable
{
    // UNICA istanza del repository, dichiarata come
    // membro static della classe ToDoRepository
    private static ToDoRepository _repository = null;

    // Deserializza l'istanza del ToDoRepository da file
    public static ToDoRepository loadFromFile(String fileName) {
        // Individua il file e lo deserializza con readObject
        // _repository = ...
        return _repository;
    }

    // Restituisce sempre la stessa istanza (quella serializzata/deserializzata da file)
    public static ToDoRepository getToDoRepository() {
        return _repository;
    }

    // METODI E MEMBRI DI ISTANZA
    // ToDoRepository contiene una HashMap di tutti i TO-DO a sistema:
    // - implementa il metodo di salvataggio su file
    // - implementa il metodo di caricamento da file
    // - metodi per individuare, aggiungere, eliminare un TO-DO
    // - restituisce una copia di tutti i TO-DO come ArrayList, da
    //   usare per le visualizzazioni di ToDoList
    Map<Long, ToDo> _data = new HashMap<>();    // Mappa ID -> TO-DO
    private long _idSeed;                       // Contatore per la generazione degli id

    // Costruttore privato: non è possibile generare ToDoRepository con "new" dall'esterno
    private ToDoRepository() {}

    // Utilizzato per generare un nuovo ID
    public long getNewId() {
        _idSeed++;
        return _idSeed;
    }

    // Elimina un TO-DO
    public void delete(Long ID) {

    };

    // Aggiunge un TO-DO
    public void add(ToDo t) {
        // si deve entrare nell'oggetto t e leggere il suo ID
        // per poi salvarlo nella mappa correttamente (con put(ID, t))
    }

    // Aggiorna un TO-DO
    public void update(ToDo t) {
        // si prende l'ID dall'oggetto t
        // si recupera dalla mappa il TO-DO corrispondente con get(t), per controllo
        // si sostituisce con put(ID, t)
    }

    // Restituisce una lista di tutti i TO-DO
    public List<ToDo> getToDoList() {
        // restituisce lista di tutti i TO-DO esistenti
        return null;
    }

    // Salva tutta l'istanza del repository (compresi gli oggetti
    // TO-DO presenti in mappa) in un file tramite il metodo
    // writeObject di ObjectOutputStream.
    // Anche il membro idSeed è salvato su file (è variabile di istanza).
    public void writeToFile(String fileName) {
        // serializzazione su file con writeObject: cfr. hints/InputOutput
    }
}
