package Homwork;
//
///An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly steps steps, for every step, it was noted if it was an uphill, U, or a downhill, D step. Hikes always start and end at sea level, and each step up or down represents a 1 unit change in altitude. We define the following terms:
//        n: A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
//        n: A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
//        Given the sequence of up and down steps during a hike, find and print the number of valleys walked through./

//example: steps = 8 path = [DDUUUUDD]
//        The hiker first enters a valley 2 units deep. Then they climb out and up unto a mountain 2 units high.
//        Finally the hiker returns to sea level and ends the hike.

import java.util.Scanner;

public class HikeTracker {

    public static int countValleys(String steps) {
        int seaLevel = 0;
        int currentLevel = 0;
        int valleys = 0;

        for (char step : steps.toCharArray()) {
            if (step == 'U') {
                currentLevel++;
            } else if (step == 'D') {
                currentLevel--;
            }
            System.out.println(currentLevel);
            // Check if we just came up to sea level from below
            if (currentLevel == seaLevel && step == 'U') {
                valleys++;
            }
        }

        return valleys;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sequence of steps (U for uphill, D for downhill):");
        String steps = scanner.nextLine();

        int numberOfValleys = countValleys(steps);

        System.out.println("Number of valleys walked through: " + numberOfValleys);

        scanner.close();
    }
}

