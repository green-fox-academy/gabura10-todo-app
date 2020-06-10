package TodoApp;
import java.io.*;
import java.util.Scanner;

public class TodoMain {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Alex\\todo-app\\todoProject\\src\\TodoApp\\TodoList.txt");
        Welcome welcome = new Welcome();
        ListTasks list = new ListTasks();
        AddTask add = new AddTask();
        RemoveTask remove = new RemoveTask();
        CompletesTask complete = new CompletesTask();
        if (args.length == 0) {
            welcome.welcomeMessage();
        }
        if (args[0].equals("-l")) {
            try {
                Scanner scan = new Scanner(file);
                while(scan.hasNextLine()){
                    System.out.println(scan.nextLine());
                }
            } catch (IOException e) {
                System.out.println("Unable to find file: TodoList");
            }


            if (list.listOfThings.equals(0)) {
                System.out.println("No todos for today! :)");
            }
        }
        if (args[0].equals("-a")) {
            for (int i = 1; i < args.length; i++) {
                add.setSentence(args[i]);
                add.addTask();
            }
            try {
                FileReader fr = new FileReader(file);
                LineNumberReader lnr = new LineNumberReader(fr);
                int numberOfLines = 0;
                while(lnr.readLine()!=null){
                    numberOfLines++;
                }
                FileWriter fw = new FileWriter(file,true);
                for (int i = 1; i < args.length; i++) {
                    fw.write(numberOfLines+i+" - "+args[i]+System.lineSeparator());
                    list.listOfThings.add(args[i]);

                }
                fr.close();
                fw.close();
            } catch (IOException e) {
                System.out.println("An error occured");
                e.printStackTrace();
            }

        }
        if (args[0].equals("a")) {

        }
        if (args[0].equals("a")) {

            }
        }
    }



