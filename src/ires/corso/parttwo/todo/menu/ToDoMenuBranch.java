package ires.corso.parttwo.todo.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// OPZIONE: contiene altri elementi
public class ToDoMenuBranch extends ToDoMenuItem
{
    private List<ToDoMenuItem> _options = new ArrayList<>();

    // Public constructor
    public ToDoMenuBranch(String ID, String title, List<ToDoMenuItem> options) {
        super(ID, title);
        _options.addAll(options);
    }

    @Override
    protected void select()
    {
        Scanner in = new Scanner(System.in);

        boolean exit = false;
        while(!exit) {
            printChoices();
            System.out.println("Scegli un'opzione:");
            String choice = in.nextLine();

            ToDoMenuItem t = null;
            for(int i = 0; i < _options.size(); i++) {
                if(choice.equals(_options.get(i).getID())) {
                    t = _options.get(i);
                    break;
                }
            }
            if(t != null)
                t.select();
            else
                exit = true;
        }
    }

    private void printChoices() {
        System.out.println();
        System.out.println(getTitle());
        System.out.println("----------------------------------------------------------------");
        _options.forEach(o -> System.out.println(o.toString()));
        System.out.println("----------------------------------------------------------------");
    }
}
