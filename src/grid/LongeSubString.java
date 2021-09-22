package grid;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public class LongeSubString {
    //no repitition


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("au"));
    }
    public  static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        if(s.length()==1) return 1;
        HashSet<String> set= new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str=s.substring(i,j);
                System.out.println(str);
                set.add(str);
            }
        }

        int length=0;
        for(String str: set){
            Set<Character> dup = new HashSet<>();
            boolean check=true;

            for(int i=0;i<str.length();i++){
                check=dup.add(str.charAt(i));
                if(!check)
                    break;
            }
            if(check){
                if(length<str.length()){
                    length=str.length();
                }
            }
        }


        return length;
    }

}
