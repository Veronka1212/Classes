package by.epam.prog_with_class.aggreg_compos.task1;

public class Main {
    public static void main(String[] args) {

        Text text = new Text();
        Word newText = new Word("Наследование — это процесс перенимания классом свойств (методов и полей) другого класса. \n" +
                "С использованием в Java наследования информация становится управляемой в иерархическом порядке. Класс, который наследует \n" +
                "свойства другого класса, называется подклассом (производным классом, наследующим классом), а класс, свойства которого \n" +
                "наследуются, известен как суперкласс (базовый класс, родительский класс))");

        Word w1 = new Word("extends");
        Word w2 = new Word(" ");
        Word w3 = new Word("-");
        Word w4 = new Word("это");
        Word w5 = new Word("кодовое");
        Word w6 = new Word(" ");
        Word w7 = new Word("слово");
        Word w9 = new Word("для");
        Word w10 = new Word("наследования");
        Word w11 = new Word("свойств");
        Word w12 = new Word("класса");
        Word name1 = new Word("Язык");
        Word name2 = new Word("Java");

        Sentence sentence = new Sentence("");
        Sentence textName = new Sentence("");
        Sentence newT = new Sentence("");
        newT.addWord(newText);
        textName.addWord(name1);
        textName.addWord(w2);
        textName.addWord(name2);
        sentence.addWord(w1);
        sentence.addWord(w2);
        sentence.addWord(w3);
        sentence.addWord(w2);
        sentence.addWord(w4);
        sentence.addWord(w2);
        sentence.addWord(w5);
        sentence.addWord(w2);
        sentence.addWord(w7);
        sentence.addWord(w2);
        sentence.addWord(w9);
        sentence.addWord(w2);
        sentence.addWord(w10);
        sentence.addWord(w2);
        sentence.addWord(w11);
        sentence.addWord(w2);
        sentence.addWord(w12);
        sentence.addWord(w2);

        text.addText(textName);
        text.addText(newT);
        text.addText(sentence);
        text.setTextName(textName);
        for (Sentence s : text.getText())
            System.out.println(s.toString());

        System.out.println(text.toStringTextName());
    }
}
