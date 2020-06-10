package TodoApp;

import java.util.ArrayList;

public abstract class Tasks {
    protected ArrayList<String> listOfThings = new ArrayList<>();

    public ArrayList<String> getListOfThings() {
        return listOfThings;
    }
    public void setListOfThings(ArrayList<String> listOfThings) {
        this.listOfThings = listOfThings;
    }
}
