package ires.corso.parttwo.todo.repo;

public class RepoTester
{
    public static void main(String[] args) throws Exception {
        ToDoRepository.init("ToDoRepository.ser");
        ToDoRepository tdr = ToDoRepository.getRepo();
    }
}
