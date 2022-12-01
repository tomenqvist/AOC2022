package day_01;

import AocUtils.AocReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = AocReader.getListOfStrings("d1_input.txt");
        ArrayList<Integer> scores = new ArrayList<>();
        int[] topScores = {0,0,0};
        int score = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) != ""){
                score += Integer.parseInt(list.get(i));
            } else {
                scores.add(score);
                score = 0;
            }
        }

        scores.sort(Collections.reverseOrder());
        int sum = scores.get(0) + scores.get(1) + scores.get(2);
        System.out.println(sum);

    }
}
