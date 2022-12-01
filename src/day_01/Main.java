package day_01;

import AocUtils.AocReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = AocReader.getListOfStrings("d01_input.txt");


        // PART 1
        int score = 0;
        int topScore = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) != ""){
                score += Integer.parseInt(list.get(i));
            } else {
                if (score > topScore){
                    topScore = score;
                }
                score = 0;
            }
        }

        System.out.println("Part 1: " + topScore);

        //PART2

        ArrayList<Integer> scores = new ArrayList<>();
        score = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) != ""){
                score += Integer.parseInt(list.get(i));
            } else {
                scores.add(score);
                score = 0;
            }
        }

        //Sorterar listan så högsta värdet hämnar på index 0
        scores.sort(Collections.reverseOrder());

        // Summerar top 3 värdena
        int sum = scores.get(0) + scores.get(1) + scores.get(2);
        System.out.println("Part 2: " + sum);

    }
}
