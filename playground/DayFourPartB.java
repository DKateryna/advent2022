import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class DayFourPartB {
    public static void main(String[] args) {
        int count = 0;
        int total = 0;
        String fileName = "dataInput/input4.txt";
        File file = new File(fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            final Map<String, String> passport = new HashMap<>();
            while ((line = reader.readLine()) != null) {
                if(!line.isEmpty()){
                    Arrays.stream(line.split(" ")).map(s -> s.split(":")).forEach(p -> passport.put(p[0], p[1]));
                } else {
                    passport.remove("cid");
                    boolean valid = validatePassport(passport);
                    if(valid){
                        count++;
                    }
                    passport.clear();
                }

            }
            boolean valid = validatePassport(passport);
            if(valid){
                total++;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(count);
        System.out.println();
        System.out.println(total);
    }

    /*
    byr (Birth Year) - four digits; at least 1920 and at most 2002.
    iyr (Issue Year) - four digits; at least 2010 and at most 2020.
    eyr (Expiration Year) - four digits; at least 2020 and at most 2030.
    hgt (Height) - a number followed by either cm or in:
    If cm, the number must be at least 150 and at most 193.
    If in, the number must be at least 59 and at most 76.
    hcl (Hair Color) - a # followed by exactly six characters 0-9 or a-f.
    ecl (Eye Color) - exactly one of: amb blu brn gry grn hzl oth.
    pid (Passport ID) - a nine-digit number, including leading zeroes.
    cid (Country ID) - ignored, missing or not.
     */

    public static boolean validatePassport(Map<String, String> passport){
        if(passport.size() >= 7) {
            int byr = Integer.parseInt(passport.get("byr"));
            if(byr < 1920 || byr > 2002) {
                return false;
            }
            int iyr = Integer.parseInt(passport.get("iyr"));
            if (iyr < 2010 || iyr > 2020) {
                return false;
            }
            int eyr = Integer.parseInt(passport.get("eyr"));
            if(eyr < 2020 || eyr > 2030) {
                return false;
            }
            String height = passport.get("hgt");
            if(!DayFour.validateHeight(height)) {
               return false;
            }
            String hairColor = passport.get("hcl");
            if(!DayFour.validateHairColor(hairColor)) {
                return false;
            }
            String eyeColor = passport.get("ecl");
            if(!DayFour.validateEyeColor(eyeColor)) {
                return false;
            }
            String pid = passport.get("pid");
            if(!DayFour.validatePassportId(pid)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
