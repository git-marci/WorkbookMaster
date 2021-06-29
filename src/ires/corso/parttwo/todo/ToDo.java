package ires.corso.parttwo.todo;

import java.io.Serializable;

public class ToDo implements Serializable
{
    // Properties dell'istanza
    protected final long _ID;

    public ToDo(long ID) {
        this._ID = ID;
        //...
    }

    public long getID() {
        return this._ID;
    }

    // classe principale

    public ToDo cloneForUpdate() {
        // fabbrica una copia esatta del To-Do (compreso l'ID)
        return null;
    }
}
