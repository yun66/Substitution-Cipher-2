package com.company;

/**
 * Created by Daniel Newell on 9/2/2014.
 */
public class Constants {

    // Constant Variables
    public static final String DECRYPT = "decrypt";
    public static final String ENCRYPT = "encrypt";
    public static final String YES = "yes";
    public static final boolean PRINT_TO_FILE = true;
    public static final String PlainTextBackward = "ZYXWVUTSRQPONMLKJIHGFEDCBAzyxwvutsrqponmlkjihgfedcba";
    public static final String PlainTextForward = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public static final String OUTPUT_FILENAME = "Output.txt";
    public static final String ENCRYPTION_FILENAME = "EncryptionKey.txt";

    // Messages Displayed to the user
    public static final String START_MESSAGE = "Please enter decrypt or encrypt: ";
    public static final String CHOICE_MESSAGE = "You chose to %s a message";
    public static final String ENTER_STRING_MESSAGE = "Please enter the string you would like to %s: ";
    public static final String FINAL_MESSAGE = "Your %sed string: %s";
    public static final String OUTPUT_MESSAGE = "Your message has been written out to the file %s";
    public static final String KEYWORD_MESSAGE = "Please enter the keyword you wish to create the cipher with: ";
    public static final String CONTINUE_MESSAGE = "Would you like to continue (Yes or No): ";
    public static final String SUMMARY_MESSAGE =
            "This program allows you to create a Caesar Cipher using any keyword that you choose. \n";
}
