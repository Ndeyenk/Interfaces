package lab03;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class ShortLister {

    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            Filter filter = new ShortWordFilter();

            try (Scanner scan = new Scanner(file)) {
                while (scan.hasNext()) {
                    String word = scan.next();
                    if (filter.accept(word)) {
                        System.out.println(word);
                    }
                }
            } catch (Exception e) {
                System.out.println("Error reading file.");
            }
        }
    }
}
