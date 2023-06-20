package collections_framework.glossary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Glossary glossary = new Glossary(new HashMap<>());
        glossary.addWordScan(scanner);
        glossary.addWordScan(scanner);
        glossary.addWord("привет", new String[]{"hello", "hi"});
        glossary.addWord("пока", new String[]{"bye", "goodbye"});
        glossary.addWord("еда", new String[]{"food", "meal", "eat"});
        glossary.addWord("товар", new String[]{"product", "item", "good"});
        glossary.addWord("рука", new String[]{"hand", "arm"});
        glossary.addWord("нога", new String[]{"foot", "leg", "stem"});
        glossary.addWord("человек", new String[]{"man", "human", "person"});
        glossary.addWord("дом", new String[]{"home", "house", "residence"});
        glossary.showAll();
        glossary.replaceWord(scanner);
        glossary.removeWord(scanner);
        glossary.showAll();
        glossary.popularityCount(scanner);


    }
}
