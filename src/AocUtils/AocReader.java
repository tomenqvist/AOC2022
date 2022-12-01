package AocUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AocReader {

    public static ArrayList<String> getListOfStrings(String fileName) throws FileNotFoundException {
        File myFile = new File(fileName);
        Scanner input = new Scanner(myFile);
        ArrayList<String> list = new ArrayList<>();

        //lägger in input i en arraylist
        while(input.hasNextLine()){
            list.add(input.nextLine());
        }

        return list;
    }

    public static ArrayList<Integer> getListOfInts(String fileName) throws FileNotFoundException {
        File myFile = new File(fileName);
        Scanner input = new Scanner(myFile);
        ArrayList<Integer> list = new ArrayList<>();

        //lägger in input i en arraylist
        while(input.hasNextLine()){
            int i = Integer.parseInt(input.nextLine());
            list.add(i);
        }

        return list;
    }
}
