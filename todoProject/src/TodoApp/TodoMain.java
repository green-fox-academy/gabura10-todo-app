package TodoApp;

public class TodoMain {
    public static void main(String[] args) {
        Welcome welcome = new Welcome();
        ListTasks list = new ListTasks();
        AddTask add = new AddTask();
        RemoveTask remove = new RemoveTask();
        CompletesTask complete = new CompletesTask();
        if (args.length == 0) {
            welcome.welcomeMessage();
        }
        if (args[0].equals("-l")) {
            if (list.listOfThings.size() == 0) {
                System.out.println("No todos for today! :)");
            } else {
                list.list();
            }
        }
        if (args[0].equals("a")) {
            add.setSentence(args[0]);
            add.addTask();
        }
        if (args[0].equals("a")) {

        }
        if (args[0].equals("a")) {

            }
        }
    }



