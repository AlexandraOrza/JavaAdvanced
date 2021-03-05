package javaadvanced.oop.input.output.homework;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("C:/TEST/loremipsum.txt");
        String fileContent = "";
        String fileLine;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        while ((fileLine = bufferedReader.readLine()) != null) {
            fileContent += fileLine;
            fileContent += "";
        }

        System.out.println(fileContent);
        System.out.println("Words number:" + countWords(fileContent));
        countSpecialSigns(fileContent);

        System.out.println("Nr of occurences: " + nrOfOccurences(fileContent, "ipsum"));

    }

    public static int countWords(String text) {
        String[] wordsArray = text.split(" ");
        return wordsArray.length;
    }

    public static void countSpecialSigns(String text) {
        int spaceCount = 0;
        int commaCount = 0;
        int dotCount = 0;

        for (int i = 0; i < text.length() ; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            } else if (text.charAt(i) == ',') {
                commaCount++;
            } else if (text.charAt(i) == '.') {
                dotCount++;
            }
        }
        System.out.println("Nr of commas: " + commaCount);
        System.out.println("Nr of dots: " + dotCount);
        System.out.println("Nr of spaces: " + spaceCount);
    }


    public static int nrOfOccurences(String text, String word) {
        String[] wordsArray = text.split(" ");
        int count = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            String newWord = wordsArray[i];

            if (((newWord.charAt(newWord.length() - 1) < 65) || (newWord.charAt(newWord.length() - 1) > 90))
                    && ((newWord.charAt(newWord.length() - 1) < 97) || (newWord.charAt(newWord.length() - 1) > 122))){
                newWord = newWord.substring(0, newWord.length() - 1);
            }
            if (newWord.equals(word)) {
                count++;
            }
        }
        return count;
    }
}



