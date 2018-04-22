package acdlab.lt.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class IOStreamUtils {

    List<List<String>> data = new ArrayList<>();

    public List<List<String>> readFromFile(String filename) {
        try {
            try (
                    BufferedReader in = new BufferedReader(new FileReader(filename))
            ) {
                String line;
                while (true) {
                    line = in.readLine();
                    if (line == null)
                        break;
                    List<String> lines = Arrays.asList(line.split(" "));
                    data.add(lines);
                    System.out.println(lines);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void writeToFile(String filename) {
        try {
            try (
                    BufferedWriter out = new BufferedWriter(new FileWriter(filename))
            ) {
                for (List<String> lines : data) {
                    for (int i = 0; i < lines.size(); i++) {
                        out.write(lines.get(i));
                        if (i < lines.size() - 1) {
                            out.write("\t");
                        }
                    }
                    out.write("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
