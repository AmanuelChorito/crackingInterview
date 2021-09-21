package arrayandstring;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Blanagrams {

    // check anagram
    public static void main(String[] args) {

        System.out.println(anagram("tangram","anagram"));
    }

    private static boolean anagram(String ana1, String ana2) {
        char[]a1= ana1.toCharArray();
        char[]a2= ana2.toCharArray();

        Set<Character> c1= new HashSet<Character>();
        Set<Character> c2= new HashSet<Character>();
        for (int i=0;i<a1.length;i++){
            c1.add(a1[i]);
            c2.add(a2[i]);
        }
//       if (c1.size()-c2.size())
//        int count=0;
//        int count;
//        for (int i = 0; i<ana1.length(); i++){
//            if (ana1.charAt(i)!=ana2.charAt(i)){
//                count++;
//            }
//            if (count>1){
//                return false;
//
//            }
//
//        }
//        System.out.println(count);
//        if(count==0)
//            return false;
//        if(count>=1)
//            return true;
        return false;
    }
    //
}
