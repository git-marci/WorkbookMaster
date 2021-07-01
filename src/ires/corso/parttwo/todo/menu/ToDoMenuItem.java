package ires.corso.parttwo.todo.menu;

public abstract class ToDoMenuItem
{
    // Classe astratta che rappresenta la generica voce del menu
    private final String _ID;
    private final String _title;

    // Costruttore da richiamare nei costruttori delle classi figlie
    protected ToDoMenuItem(String menuID, String title) {
        _ID = menuID;
        _title = title;
    }

    // Comportamento del menu item, da specializzare per ciascun tipo
    protected abstract void select();

    public String getID() {
        return _ID;
    }

    public String getTitle() {
        return _title;
    }

    @Override
    public String toString() {
        return getID() + ". " + getTitle();
    }
}
