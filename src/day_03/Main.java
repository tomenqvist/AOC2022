package day_03;
import AocUtils.AocReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> input = AocReader.getListOfStrings("d03_input.txt");
        System.out.println(input);

        // Part 1
        ArrayList<Character> commonItems = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            //Delar upp ryggsäcken i två compartments
            ArrayList<String> compartments = new ArrayList<>();
            compartments.add(0, input.get(i).substring(0, input.get(i).length()/2));
            compartments.add(1, input.get(i).substring(input.get(i).length()/2));

            // Skapar och lägger till alla items från första compartmentet i en lista
            ArrayList<Character> first = new ArrayList<>();
            for (int c = 0; c < compartments.get(0).length(); c++) {
                char character = compartments.get(0).charAt(c);
                first.add(c, character);
            }

            //Kollar om andra compartmenten innehåller nått item från det första och lägger isf
            // till den i commonItems
            for (int j = 0; j < first.size(); j++) {
                if(compartments.get(1).contains(""+ first.get(j) +"")){
                    commonItems.add(first.get(j));
                    break;
                }
            }
            for (int j = 0; j < compartments.size(); j++) {
                for (int c = 0; c < compartments.get(j).length(); c++) {
                    char character = compartments.get(j).charAt(c);
                }
            }
        }

        //Skapar en hashmap för att tilldela priovärden
        HashMap<Character, Integer> values = new HashMap<Character, Integer>();
        int prio = 1;
        for (int i = 97; i <= 122 ; i++) {
            values.put((char) i, prio);
            prio++;
        }
        for (int i = 65; i <= 90 ; i++) {
            values.put((char) i, prio);
            prio++;
        }

        //beräknar det totala priovärdet
        int totalPrio = 0;
        for (int i = 0; i < commonItems.size(); i++) {
            totalPrio += values.get(commonItems.get(i));
        }
        System.out.println(totalPrio);
    }
}
