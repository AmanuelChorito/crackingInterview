package grid;

import java.util.Arrays;

public class Anagram {
    //implement is anagram
    public static void main(String[] args) {
        System.out.println(isAnagram("silent","listen"));
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
    private static boolean anagramv2(String str1,String str2){

        return false;

    }

}
