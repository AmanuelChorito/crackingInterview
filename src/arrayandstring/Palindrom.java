package arrayandstring;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Palindrom {
    public static void main(String[] args) {
        String s="anona";
        System.out.println(checkPalin(s));
    }
    private static boolean checkPalin(String s) {
        boolean status=false;
        int j=s.length()-1;
        for (int i=0;i<s.length()&& i<j;i++,j--){
            status=false;
            if(s.charAt(i)==s.charAt(j)){
                status=true;
            }
            else {
                return status;
            }
        }
        return status;
    }
}
