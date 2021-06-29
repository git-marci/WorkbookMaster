package ires.corso.parttwo.todo;

import java.io.Serializable;

public class ToDo implements Serializable
{
    // Contatore static, di classe
    private static long idSeed;

    // Properties dell'istanza
    protected final long _ID;

    protected long getNewId() {
        return ++idSeed;
    }

    public ToDo() {
        this._ID = getNewId();
        //...
    }

    public long getID() {
        return this._ID;
    }


    // classe principale

    // ...costruttore con ID incrementale...


    public ToDo cloneForUpdate() {
        // fabbrica una copia esatta del To-Do (compreso l'ID)
        return null;
    }
}
