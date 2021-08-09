package by.epam.prog_with_class.aggreg_compos.task1;

public class Sentence {

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    private String sentence;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return sentence;
    }

    public Sentence(){
    }

    public void addWord(Word word) {
        this.sentence=this.sentence+word;
    }
}