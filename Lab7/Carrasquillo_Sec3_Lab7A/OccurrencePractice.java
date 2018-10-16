import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *      Problem Description
 *      (Occurrences of each letter)
 *      Write a program that prompts the user to enter a file name and
 *      displays the occurrences of each letter in the file. Letters are
 *      case-insensitive.
 */
public class OccurrencePractice{
    public static void main(String[] args) {
        System.out.print("Enter file name: ");
        File file = new File(new Scanner(System.in).next());
        if (!file.exists()) {
            System.out.println(file + " doesn't exist");
            System.exit(1);
        }
        String space = "";
        int[] abcCount = new int[26];
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                space = input.nextLine();
                for (char x : space.toCharArray()) {
                    x = Character.toUpperCase(x);
                    if (isLetter(x)) {
                        abcCount[x - 'A']++;
                    }
                }

            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < abcCount.length; i++) {
            System.out.println((char)(i + 'A') + " occurrence = " + abcCount[i]);
        }
    }
    private static boolean isLetter(char ch) {
        return (ch >= 'A' && ch <= 'Z');
    }
}