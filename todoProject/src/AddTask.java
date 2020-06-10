package TodoApp;

public class AddTask extends Tasks {
    protected String sentence;
    public void addTask(){
        listOfThings.add(sentence);
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
