package ires.corso.parttwo.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting
{
    public static void main(String[] args)
    {
        Comparator<ToDo> compareByPriority = new Comparator<ToDo>() {
            @Override
            public int compare(ToDo t1, ToDo t2) {
                return t1.getPriority().compareTo(t2.getPriority());
            }
        };

        Comparator<ToDo> compareByStatus = (ToDo t1, ToDo t2) -> t1.getState().compareTo(t2.getState());

        ArrayList<ToDo> al = new ArrayList<>();
        al.add(new ToDo("Title 1", "Desc 1", LocalDate.of(2021, 12, 1), ToDo.Priorities.BASSA, ToDo.States.IN_ESECUZIONE));
        al.add(new ToDo("Title 2", "Desc 2", LocalDate.of(2021, 9, 1), ToDo.Priorities.MEDIA, ToDo.States.ANNULLATA));
        al.add(new ToDo("Title 3", "Desc 3", LocalDate.of(2021, 11, 1), ToDo.Priorities.ALTA, ToDo.States.COMPLETATA));
        al.add(new ToDo("Title 4", "Desc 4", LocalDate.of(2021, 8, 1), ToDo.Priorities.BASSA, ToDo.States.IN_ESECUZIONE));
        al.add(new ToDo("Title 5", "Desc 5", LocalDate.of(2021, 10, 1), ToDo.Priorities.ALTA, ToDo.States.COMPLETATA));

        Collections.sort(al, compareByPriority);
        al.forEach(t -> System.out.println(t.prettyPrint()));

        System.out.println("-----------------------------------------------------------------");

        Collections.sort(al, compareByStatus);
        al.forEach(t -> System.out.println(t.prettyPrint()));

        System.out.println("-----------------------------------------------------------------");

        Collections.sort(al,
                ((Comparator<ToDo>)(ToDo t1, ToDo t2) -> t1.getDateOfExpiration().compareTo(t2.getDateOfExpiration())).reversed());
        al.forEach(t -> System.out.println(t.prettyPrint()));

        System.out.println("-----------------------------------------------------------------");

        Collections.sort(al, (ToDo t1, ToDo t2) -> t1.getDateOfExpiration().compareTo(t2.getDateOfExpiration()));
        Collections.reverse(al);
        al.forEach(t -> System.out.println(t.prettyPrint()));
    }
}
