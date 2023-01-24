import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DayTwo {
    final public static String filePath = "../inputs/day2.txt";

    public static void rockPaperScissorsA() {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(filePath)));
            int sum = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.charAt(0) == 'A' && line.charAt(2) == 'X') {
                    sum += 4;
                } else if (line.charAt(0) == 'B' && line.charAt(2) == 'Y') {
                    sum += 5;
                } else if(line.charAt(0) == 'C' && line.charAt(2) == 'Z') {
                    sum += 6;
                } else if (line.charAt(0) == 'A' && line.charAt(2) == 'Y') {
                    sum += 8;
                } else if (line.charAt(0) == 'B' && line.charAt(2) == 'Z') {
                    sum += 9;
                } else if (line.charAt(0) == 'C' && line.charAt(2) == 'X') {
                    sum += 7;
                } else if (line.charAt(0) == 'A' && line.charAt(2) == 'Z') {
                    sum += 3;
                } else if (line.charAt(0) == 'B' && line.charAt(2) == 'X') {
                    sum += 1;
                } else if (line.charAt(0) == 'C' && line.charAt(2) == 'Y') {
                    sum += 2;
                }
            }
            sc.close();
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void rockPaperScissorsB() {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(filePath)));
            int sum = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.charAt(0) == 'A' && line.charAt(2) == 'X') {
                    sum += 3;
                } else  if (line.charAt(0) == 'B' && line.charAt(2) == 'X') {
                    sum += 1;
                } else  if (line.charAt(0) == 'C' && line.charAt(2) == 'X') {
                    sum += 2;
                } else  if (line.charAt(0) == 'A' && line.charAt(2) == 'Y') {
                    sum += 4;
                } else  if (line.charAt(0) == 'B' && line.charAt(2) == 'Y') {
                    sum += 5;
                } else  if (line.charAt(0) == 'C' && line.charAt(2) == 'Y') {
                    sum += 6;
                } else  if (line.charAt(0) == 'A' && line.charAt(2) == 'Z') {
                    sum += 8;
                } else  if (line.charAt(0) == 'B' && line.charAt(2) == 'Z') {
                    sum += 9;
                } else  if (line.charAt(0) == 'C' && line.charAt(2) == 'Z') {
                    sum += 7;
                }
            }
            sc.close();
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
