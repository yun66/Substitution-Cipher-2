package com.company;

import java.util.Scanner;

/**
 * Created by Daniel Newell on 9/1/2014.
 */
public class Main {

    /**
     * This is the main method of the program.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ValidInput = false;
        String choice = "";

        System.out.println(Constants.SUMMARY_MESSAGE);
        System.out.print(Constants.KEYWORD_MESSAGE);
        String keyWord = scanner.nextLine();
        TranslateEngine translateEngine = new TranslateEngine(keyWord);

        do {
            System.out.print(Constants.START_MESSAGE);
            String nextLine = scanner.nextLine();
            if (nextLine.toLowerCase().equals(Constants.DECRYPT)) {
                choice = TranslateEngine.EncryptionType.decrypt.toString();
                ValidInput = true;
            } else if (nextLine.toLowerCase().equals(Constants.ENCRYPT)) {
                choice = TranslateEngine.EncryptionType.encrypt.toString();
                ValidInput = true;
            }
        } while (!ValidInput);

        if (!choice.isEmpty()) {
            System.out.printf(Constants.CHOICE_MESSAGE, choice);
            System.out.println();
            System.out.printf(Constants.ENTER_STRING_MESSAGE, choice);
            String message = scanner.nextLine();
            TranslateEngine.EncryptionType encryptionType = choice.equals(Constants.DECRYPT) ? TranslateEngine.EncryptionType.decrypt : TranslateEngine.EncryptionType.encrypt;
            translateEngine.OutputMessage(String.format(Constants.FINAL_MESSAGE, choice, translateEngine.EncryptDecryptString(message,encryptionType)),Constants.OUTPUT_FILENAME);
        }
    }


}
