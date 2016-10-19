package runner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey_Stefoglo on 10/17/2016.
 */
public class FileRunner {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("5Data.txt"))) {
            String line;
            try (BufferedReader br1 = new BufferedReader(new FileReader("5Data.txt"))) {
                while ((line = br.readLine()) != null) {
                    lines.add(line.substring(0, 3));


                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
