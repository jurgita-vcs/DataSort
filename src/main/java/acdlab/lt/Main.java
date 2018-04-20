package acdlab.lt;


import acdlab.lt.model.Data;
import acdlab.lt.utils.IOStreamUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IOStreamUtils file = new IOStreamUtils();

        System.out.println("Data before sort: ");
        //--Read from file
        List<List<String>> data = file.readFromFile("input.txt");

        //--Sorting Data
        data.sort(new Data());
        System.out.println("\nData after sort: ");

        //--Print sorted data in console
        data.forEach(System.out::println);

        //--Write to file
        file.writeToFile("output.txt");
    }
}



