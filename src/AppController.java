import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AppController {
    static int valueOfUniqueWords = 0;
    static int allWords = 0;

    public String openBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book name: ");
        String bookName = scanner.nextLine();
        scanner.close();
        return bookName;
    }
    public Map<String, Integer> wordsCalk(File file) {
        Map<String, Integer> map = new HashMap<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String wordsInLine;
            while ((wordsInLine = bufferedReader.readLine()) != null) {
                String[] goodWords = removeBadSymbols(wordsInLine);
                for (String word : goodWords) {
                    if (word.length() < 3) continue;
                    if (map.containsKey(word)) map.put(word, map.get(word) + 1);
                    else map.put(word, 1);
                    allWords++;
                }
            }
        } catch (IOException e) {
            System.out.println("This book is not in this collection");
        }
        return map;
    }

    public static String[] removeBadSymbols(String wordiInTextLine) {
        String symbolsToRemove = "!?,.{}()[]:;";
        for (Character c : symbolsToRemove.toCharArray()) {
            wordiInTextLine = wordiInTextLine.replace(c.toString(), "");
        }
        return wordiInTextLine.toLowerCase().split(" ");
    }

    public Map<String, Integer> findCommonWords(Map<String, Integer> map) {
        Map<String, Integer> commonWords = new HashMap<>();
        PriorityQueue<Pair<String, Integer>> pairs = new PriorityQueue<>((Pair<String, Integer> first, Pair<String, Integer> second) -> second.getRight() - first.getRight());
        map.forEach((String key, Integer value) -> pairs.add(new Pair<>(key, value)));
        for (int i = 0; i < 10 && i < pairs.size(); i++) {
            Pair<String, Integer> peek = pairs.poll();

            commonWords.put(peek.getLeft(), peek.getRight());
            System.out.println(peek.getLeft() + " -> " + peek.getRight());
        }
        return commonWords;
    }

    public void countUniqueWords(Map<String, Integer> map) {
        for (int i : map.values())
            valueOfUniqueWords++;
        System.out.println("Total number of words: " + allWords + ", unique words: " + valueOfUniqueWords);
    }

    public void writeStatistic(Map<String, Integer> map) throws RuntimeException {

        String outputFilePath = "src/statistic.txt";
        File file = new File(outputFilePath);
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("Total number of words: " + allWords / 2 + ", unique words: " + valueOfUniqueWords);
            bufferedWriter.newLine();
            for (Map.Entry<String, Integer> entry :
                    map.entrySet()) {
                bufferedWriter.write(entry.getKey() + ":"
                        + entry.getValue());
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("The report was not written to the file!");
        } finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.close();
            } catch (Exception e) {
                System.out.println("The report was not written to the file!");
            }
        }
    }
}




