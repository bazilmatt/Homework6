import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Homework 6 Task 1
 * Logic and main structure of program
 *
 * Program must read the file and put all words in collection without repeats
 *
 * @author Matveev
 *
 */

public class Main {

    Set<String> wordSet = new HashSet<String>();
    String filename;

    public static void readFile(String filename) {
        try (FileInputStream fileInputStream = new FileInputStream(filename)) {
            System.out.println("Размер файла: " + fileInputStream.available());

            int i = -1;
            while ((i = fileInputStream.read()) != -1) {
                System.out.println((char) i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public Main() throws FileNotFoundException {
    }
}
