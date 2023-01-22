import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DayOne {
//    --- Day 1: Calorie Counting ---

    final public static String filePath = "../inputs/day1.txt";

    public static void  calorieCountingA() {
        int sum = 0;
        int totalCalories = 0;
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(filePath)));
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.length() != 0) {
                    sum += Integer.parseInt(line);
                } else {
                    if (totalCalories < sum) {
                        totalCalories = sum;
                    }
                    sum = 0;
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("totalCalories = " + totalCalories);
    }

    public static void calorieCountingB() {
        int sumTopOne  = 0;
        int sumTopTwo = 0;
        int sumTopThree = 0;
        int totalCalories = 0;
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(filePath)));
            int sum = 0;
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.length() != 0) {
                    sum += Integer.parseInt(line);
                } else {
                    if (sum > sumTopOne) {
                        sumTopThree = sumTopTwo;
                        sumTopTwo = sumTopOne;
                        sumTopOne = sum;
                    } else if (sum > sumTopTwo) {
                        sumTopThree = sumTopTwo;
                        sumTopTwo = sum;
                    } else if (sum > sumTopThree) {
                        sumTopThree = sum;
                    }
                    sum = 0;
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        totalCalories = sumTopOne + sumTopTwo + sumTopThree;
        System.out.println("totalCaloriesTopThree = " + totalCalories);
    }
}
