package TodoApp;

public class TodoMain {
    public static void main(String[] args) {
        Welcome welcome = new Welcome();

        if (args.length == 0) {
            welcome.welcomeMessage();
        }


    }
}


