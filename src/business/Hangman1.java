package business;

import java.io.File;
import java.util.*;

public class Hangman1 {

    private static Scanner input;

	public static void main(String[] args) throws Exception {
        File myFile = new File("word.txt");
        System.out.println("Attempting to read from file in: "+myFile.getCanonicalPath());

        input = new Scanner(myFile);
        String in = "";
        in = input.nextLine();
    }

}