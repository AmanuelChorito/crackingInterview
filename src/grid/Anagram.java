package grid;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Anagram {
    //implement is anagram
    public static void main(String[] args) {
        System.out.println(anagramvWithHashMap("abc","cba"));
    }

    private static boolean isAnagram(String str1,String str2) {
        char[]arr1= str1.toCharArray();
        Arrays.sort(arr1);
        char[]arr2=str2.toCharArray();
        Arrays.sort(arr2);
        String a= new String(arr1);
        String b= new String(arr2);
        if (a.equals(b))
            return true;
        return false;
    }
    private static boolean anagramvWithHashMap(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        Map<Character,Integer> strHash1= new HashMap<>();
        Map<Character,Integer>strHash2= new HashMap<>();
        convertCharstringtoHashMap(str1, strHash1);
        convertCharstringtoHashMap(str2, strHash2);

        if(strHash1.equals(strHash2))
            return true;
        return false;

    }
    public static Map<Character,Integer>convertCharstringtoHashMap(String str,Map<Character,Integer> strHash){
        for(int i=0;i<str.length();i++){
            if( strHash.containsKey(str.charAt(i))){
                Integer v= strHash.get(str.charAt(i));
                strHash.replace(str.charAt(i),v+1);

            }
            strHash.put(str.charAt(i),1);
        }
        return strHash;
    }

}
