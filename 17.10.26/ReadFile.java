import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFile {
    static String[] words = new String[25000]; // храним только в нижнем регистре

    static int[] counts = new int[25000];

    public static void main(String[] args) throws IOException { // говорим, что может выскочить ошибка с вводом или выводом
        Scanner scanner = new Scanner(new File("Labirint.java")); // считать файл

        
        int count = -1;
        int wordCount = 0;
        int maxLength = 0; 
        int symbols = 0;

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine().trim(); // trim убирает пробельные символы в начале и конце
            symbols += line.length(); // считаем количество символов

            if (maxLength < line.length()) {
                maxLength = line.length(); // находим макс. длину строки
            }

            wordCount += line.split(" ").length; // считаем все слова

            for (int i = 0; i < line.split(" ").length; i++) {
                String word = clearWord(line.split(" ")[i].toLowerCase()); // слово в нижнем регистре
                boolean flag = true;
                for (int j = 0; j < words.length; j++) { // идем по всем элементам массива всех слов
                    if (words[j] != null && words[j].toLowerCase().equals(word)) { // элемент не пустой и слово уже есть где-то среди элементов
                        counts[j]++;
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    counts[++count]++;
                    words[count] = word;
                }
            }
        }

        for (int j = 0; j < counts.length; j++) {
            if (counts[j]!=0) {
                System.out.println(counts[j] + " " + words[j]); // прибавляем 1 так как первое вхождение не учитывалось
            }
        }        
        System.out.println("\nКоличество символов в файле: " + symbols);
        System.out.println("Максимальная длина строки в файле: " + maxLength);
        System.out.println("Количество слов в файле: " + wordCount);
        System.out.println("Слово int встречается " + findWord("int") + " раз(а)");

    }

    static int findWord(String word) {
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null && words[i].toLowerCase().equals(word)) {
                return counts[i];
            }
        }
        return -1;
    }

    static String clearWord(String word) { // очищаем слово от .,:!?
        char[] charArray = word.toCharArray();
        char[] clearedCharArray = new char[charArray.length];
        int count = 0;

        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
            case '.': case ',': case ':': case '!': case '?':
                break;
            default:
                clearedCharArray[count++] = charArray[i];
            }
        }

        return String.valueOf(clearedCharArray);
    }
}

