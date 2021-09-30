package arrayandstring;

import java.lang.reflect.Array;
import java.util.Arrays;

public  class Palindrom {
    public static void main(String[] args) {

            String s="anona";
           // System.out.println(checkPalin(s));
        System.out.println(digitd(13,104347,782484));
        //System.out.println("hello");
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
private static int digitd(int N, int A, int B){
        long max= (long) (Math.pow(10,N)-1);
        long min=(long) (Math.pow(10,N-1)-1);
    int count = 0;
    for (long i = min; i < max; i++) {
        if (i % A== 0 || i % B == 0)
            count++;
    }
    return count;

}

}
