package TodoApp;

public class ListTasks extends Tasks {
    public void list() {
        for (int i = 0; i <listOfThings.size() ; i++) {
            System.out.println(i+1+" - "+listOfThings.get(i));
        }
    }
}
