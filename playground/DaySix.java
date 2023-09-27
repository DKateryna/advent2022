import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class DaySix {
    public static void main(String[] args) {
        int count = 0;
        String fileName = "dataInput/input6.txt";
        File file = new File(fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            Set<Character> unique = new HashSet<>();

            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()) {
                    for(char c : line.toCharArray()) {
                        unique.add(c);
                    }
//                    line.chars().mapToObj(chr -> (char) chr).collect(Collectors.toSet());
                } else {
                    count += unique.size();
                    unique.clear();
                }
            }

            count += unique.size();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(count);
    }
}
