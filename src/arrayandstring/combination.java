package arrayandstring;

import java.util.ArrayList;
import java.util.List;

public class combination {
    public static void main(String[] args) {
        System.out.println( comb(4,3));
    }
    public static int countTeams(List<Integer> skills, int minPlayers, int minLevel, int maxLevel) {
        int count = 0;
        List<Integer> validSkills = new ArrayList<>();
        for(Integer skill : skills) {
            if(skill <= maxLevel && skill >= minLevel) {
                validSkills.add(skill);
            }
        }
        for (int i = minPlayers; i < skills.size(); i++) {
            count += comb(validSkills.size(), i);
        }
        return count;
    }

    private static int comb(int n, int min) {
        int a=factorialcalc(n);
        int b=factorialcalc(min);
        int c=factorialcalc(n-min);
        return a/(b*c);
    }

    private static int factorialcalc(int i) {
        if(i >= 1) {
            return i * factorialcalc(i - 1);
        } else return 1;
    }





}
