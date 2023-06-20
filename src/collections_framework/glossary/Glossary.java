package collections_framework.glossary;

import java.util.*;

public class Glossary extends HashMap {
    private String myWord;
    private ArrayList<String> translations;
    private HashMap<String, ArrayList<String>> glossary;

    public Glossary(HashMap<String, ArrayList<String>> glossary) {

        this.glossary = glossary;
    }

    public HashMap addWordScan(Scanner scanner) {
        System.out.println("Enter word");
        String wordNew = scanner.next();
        System.out.println("Enter quantities variants of translates: ");
        int count = scanner.nextInt();
        System.out.println("Enter translates this word:  ");
        ArrayList<String> trans = new ArrayList<>();
        while (count != 0) {
            trans.add(String.valueOf(scanner.next()));
            count--;
        }
        this.put(wordNew, trans);
        return this;
    }

    public HashMap addWord(String w, String[] l) {
        ArrayList<String> trans = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            trans.add(l[i]);
        }
        return (HashMap) this.put(w, trans);
    }

    public void printWord(Scanner scanner) {
        System.out.println("Enter word for translate: ");
        String word = scanner.next();
        ArrayList<String> trans = (ArrayList<String>) this.get(word);
        System.out.print("Translate of " + "\"" + word + "\"" + ":");
        for (String s : trans) {
            System.out.print(" " + s + ",");
        }


    }


    public void replaceWord(Scanner scanner) {
        System.out.println("Enter word for translate: ");
        String word = scanner.next();
        ArrayList<String> trans = (ArrayList<String>) this.get(word);
        System.out.print("Translate of " + "\"" + word + "\"" + ":");
        for (String s : trans) {
            System.out.print(" " + s + ",");
        }
        System.out.println();
        System.out.println("Enter quantities variants of translates: ");
        int count = scanner.nextInt();
        System.out.println("Enter new translates of this word:  ");
        ArrayList<String> newTrans = new ArrayList<>();
        while (count != 0) {
            newTrans.add(String.valueOf(scanner.next()));
            count--;
        }
        this.replace(word, newTrans);

    }

    public void showAll() {
        this.forEach((key, value) -> {
            System.out.print(key + "->");
            ArrayList<String> trans = (ArrayList<String>) this.get(key);
            for (String s : trans) {
                System.out.print(" " + s + ",");
            }
            System.out.println();

        });
    }

    public void removeWord(Scanner scanner) {
        System.out.println("Enter the word you want to delete: ");
        String delWord = scanner.next();
        this.remove(delWord);
    }

    public void popularityCount(Scanner scanner) {
        boolean isNotTranslating = false;
        Map<String, Integer> queries = new HashMap<>();
        int count = 1;
        String stop = "стоп";
        System.out.println("The dictionary continues until you enter: \"стоп\"");
        while (!isNotTranslating) {
            System.out.println("Enter word for translate: ");
            String word = scanner.next();
            if (word.equals(stop)) {
                List<String> defaultTrans = new ArrayList<>();
                defaultTrans.add("\nDICTIONARY WORK IS OVER!!!");
                ArrayList<String> trans = (ArrayList<String>) this.getOrDefault(word, defaultTrans);
                System.out.print("\"" + word + "\"");
                for (String s : trans) {
                    System.out.print(" " + s + ",");
                }
                System.out.println();
                isNotTranslating = true;
            } else {

                List<String> defaultTrans = new ArrayList<>();
                defaultTrans.add("\nTHERE IS NO SUCH WORD!!!");
                ArrayList<String> trans = (ArrayList<String>) this.getOrDefault(word, defaultTrans);
                if (!trans.equals(defaultTrans)) {
                    if (queries.containsKey(word)) {
                        count++;
                        queries.put(word, count);

                    } else {
                        count = 1;
                        queries.put(word, count);

                    }

                }
                System.out.print("Translate of " + "\"" + word + "\"" + ":");
                for (String s : trans) {
                    System.out.print(" " + s + ",");
                }
                System.out.println();
            }
        }

        List words = new ArrayList<>(queries.keySet());
        Collections.sort(words, (w1, w2) -> queries.get(w2) - queries.get(w1));
        System.out.println(words.subList(0, Math.min(words.size(), 10)));
    }

}
