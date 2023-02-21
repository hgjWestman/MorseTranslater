package MorseTranslater;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {

        System.out.println("-------------------------");
        System.out.println("Morse/Plain text translator");
        System.out.println("As plain text the following characters are accepted \"A-Z,0-9,., ,,,?\", in Morse, dots are represended with a *, dashes with an - and blanks with / ");
        System.out.println(" ");
        System.out.println("Input morse code/text:");

        TranslateMorse translation = new TranslateMorse();
        Scanner scan = new Scanner(System.in);

        String lineInput = "";
        String output = "";

        while (lineInput.equals("")) {

            // read user input
            lineInput = scan.nextLine();

            // if the user has entered a value, try to translate it
            if (!lineInput.equals("")) {
                output = translation.input(lineInput);
            }
            // if entry was empty, make a go around
            else System.out.println("Your entry was empty, please input morse code or plain text:");

        }

        System.out.println(output);
    }
}