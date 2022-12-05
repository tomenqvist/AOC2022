package day_04;

import AocUtils.AocReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> input = AocReader.getListOfStrings("d04_input.txt");

        // Part 1
        //Dela upp intvallen
        int totalContained = 0;
        for (int i = 0; i < input.size(); i++) {
            String[] interval = input.get(i).split(",", 2);
            System.out.println(interval[0]+ ":" + interval[1]);
            int largest;
            int smallest;
            int i0_v1 = Integer.parseInt(interval[0].substring(2));
            int i0_v0 = Integer.parseInt(interval[0].substring(0,1));
            int i1_v1 = Integer.parseInt(interval[1].substring(2));
            int i1_v0 = Integer.parseInt(interval[1].substring(0,1));

            ArrayList<Integer> intevallSize = new ArrayList<>();
            intevallSize.add(i0_v1 - i0_v0);
            intevallSize.add(i1_v1 -i1_v0);

            //om första intervallet är större än andra tilldela largest dess värde, annars det andra
            if(intevallSize.get(0) > intevallSize.get(1)) {
                largest = 0;
                smallest = 1;
            } else {
                largest = 1;
                smallest = 0;
            }
            if(Integer.parseInt(interval[smallest].substring(0,1)) >= Integer.parseInt(interval[largest].substring(0, 1))
            && Integer.parseInt(interval[smallest].substring(2)) >= Integer.parseInt(interval[largest].substring(2))){
                totalContained++;
                System.out.println("contains");
            }
        }
        System.out.println("Part 1: " + totalContained);
    }
}
