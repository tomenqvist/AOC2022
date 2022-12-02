package day_02;
import AocUtils.AocReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        /* Motståndare
            A = Rock 1p
            B = Paper 2p
            C = Scissors 3p

            X = Rock 1p
            Y = Paper 2p
            Z = Scissors 3p


         */

        ArrayList<String> input = AocReader.getListOfStrings("d02_input.txt");

        // Part 1
        int totalScore = 0;
        for (int i = 0; i < input.size(); i++) {
            int roundScore = 0;
            String player = input.get(i).substring(2, 3);
            String opponent = input.get(i).substring(0, 1);
            switch (player) {
                case "X" -> roundScore += 1;
                case "Y" -> roundScore += 2;
                case "Z" -> roundScore += 3;
                default -> {
                }
            }

            if(opponent.equals("A")){
                if(player.equals("Y")){
                    roundScore += 6;
                }
                if(player.equals("X")){
                    roundScore += 3;
                }
            }

            if(opponent.equals("B")){
                if(player.equals("Z")){
                    roundScore += 6;
                }
                if(player.equals("Y")){
                    roundScore += 3;
                }
            }

            if(opponent.equals("C")){
                if(player.equals("X")){
                    roundScore += 6;
                }
                if(player.equals("Z")){
                    roundScore += 3;
                }
            }

            totalScore += roundScore;
        }
        System.out.println("Part 1: " + totalScore);
    }
}
