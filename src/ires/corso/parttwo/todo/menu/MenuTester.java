package ires.corso.parttwo.todo.menu;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuTester
{
    public static void main(String[] args)
    {
        ToDoMenuLeaf a11 = new ToDoMenuLeaf("A", "Per priorità", "[[ STAMPO TODO LIST PER PRIORITY ]]");
        ToDoMenuLeaf a12 = new ToDoMenuLeaf("B", "Per Data", "[[ STAMPO TODO LIST PER DATE ]]");
        ToDoMenuLeaf a13 = new ToDoMenuLeaf("C", "Per Stato", "[[ STAMPO TODO LIST PER STATUS ]]");
        ToDoMenuBranch b1 = new ToDoMenuBranch("A", "Visualizza", new ArrayList(Arrays.asList(a11, a12, a13)));

        ToDoMenuLeaf a21 = new ToDoMenuLeaf("A", "Aggiungi", "[[ AGGIUNGO TODO ITEM ]]");
        ToDoMenuLeaf a22 = new ToDoMenuLeaf("B", "Modifica", "[[ MODIFICO TODO ITEM ]]");
        ToDoMenuLeaf a23 = new ToDoMenuLeaf("C", "Rimuovi", "[[ RIMUOVO TODO ITEM ]]");
        ToDoMenuBranch b2 = new ToDoMenuBranch("B", "Aggiungi, Modifica, Rimuovi", new ArrayList(Arrays.asList(a21, a22, a23)));

        ToDoMenuLeaf a31 = new ToDoMenuLeaf("A", "Import", "[[ IMPORT ]]");
        ToDoMenuLeaf a32 = new ToDoMenuLeaf("B", "Export", "[[ EXPORT ]]");
        ToDoMenuBranch b3 = new ToDoMenuBranch("C", "Import/Export", new ArrayList(Arrays.asList(a31, a32)));

        ToDoMenuLeaf a41 = new ToDoMenuLeaf("D", "Uscita", "[[ EXIT ]]");

        ToDoMenuBranch main = new ToDoMenuBranch("MAIN", "MENU PRINCIPALE", new ArrayList(Arrays.asList(b1, b2, b3, a41)));
        main.select();
    }
}
