import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Sum of letters in Alice in Wonderland: " + allLetters());
        System.out.println("Sum of words in Alice in Wonderland: " + allWords());
        countAllWords();
    }

    private static void countAllWords() throws IOException {
        Map AliceMap = new HashMap();

        try (BufferedReader br = new BufferedReader(new FileReader("Alice.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                String[] words = line.split("[^a-zA-Z]+");
                for (int i = 0; i < words.length; i++)
                    words[i] = words[i].toLowerCase();

                for (int i = 0; i < words.length; i++) {
                    if (AliceMap.get(words[i]) == null) {
                        AliceMap.put(words[i], 1);
                    } else {
                        int newValue = Integer.valueOf(String.valueOf(AliceMap.get(words[i])));
                        newValue++;
                        AliceMap.put(words[i], newValue);
                    }
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

        }
        Map<String, String> sorted = new TreeMap<String, String>(AliceMap);
        for (Object key : sorted.keySet()) {
            System.out.println("Word: " + key + "\tCounts: " + AliceMap.get(key));
        }

    }


    private static int allLetters() {

        int counter = 0;

        try {
            Scanner word = new Scanner(new File("Alice.txt"));

            while (word.hasNext()) {
                String singleWord = word.next();

                StringBuilder sb = new StringBuilder(singleWord);

                for (int i = 0; i < sb.length(); i++) {
                    if (sb.charAt(i) == ',' || sb.charAt(i) == '.' || sb.charAt(i) == ':' || sb.charAt(i) == '(' || sb.charAt(i) == ')' || sb.charAt(i) == '\'' || sb.charAt(i) == '?' ||
                            sb.charAt(i) == '*') {
                        sb.deleteCharAt(i);
                        singleWord = sb.toString();
                        i = i - 1;
                    }
                }

                int tokens = singleWord.length();
                counter += tokens;
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return counter;
    }

    private static int allWords() {

        int counter = 0;

        try {
            Scanner read = new Scanner(new File("Alice.txt"));


            while (read.hasNext()) {
                counter++;
                read.next();
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return counter;
    }

}