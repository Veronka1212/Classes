package by.epam.prog_with_class.aggreg_compos.task1;

import java.util.ArrayList;

public class Text {

    private ArrayList<Sentence> text = new ArrayList<>();

    public String toStringTextName() {
        return "Заголовок: " +textName;
    }

    private Sentence textName;

    public ArrayList<Sentence> getText() {
        return text;
    }

    public Sentence getTextName() {
        return textName;
    }

    public void setTextName(Sentence textName) {
        this.textName = textName;
    }

    public ArrayList<Sentence> addText (Sentence newSentences) {
        this.text.add(newSentences);
        return this.text;
    }



    public Text(){
    }
}
