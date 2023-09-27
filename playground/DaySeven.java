import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DaySeven {
    public static void main(String[] args) {
        String fileName = "dataInput/input7.txt";
        File file = new File(fileName);
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("shiny gold") && !line.startsWith("shiny gold")) {
                    String arr[] = line.split(" ", 3);
                    String regex = arr[0] + " " + arr[1];
                    System.out.println(regex);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(count);
    }
}
