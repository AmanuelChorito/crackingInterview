package arrayandstring;

import java.util.Arrays;

public class permutation {
    public static void main(String[] args) {
        String s="aman";
        String s1="mana";

        System.out.println(((permu(s, s1)?"true":"False")));
    }

    private static boolean permu(String s, String s1) {
        if(s.length()!=s1.length())
            return false;

        char[]ar1= s.toCharArray();
        Arrays.sort(ar1);

        char[]ar2= s.toCharArray();
        Arrays.sort(ar2);

        String a= new String(ar1);
        String b= new String(ar2);

        if (a.equals(b))
            return true;
        else return false;
    }
}
