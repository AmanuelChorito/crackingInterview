package arrayandstring;

import java.util.*;
import java.util.concurrent.BlockingQueue;

public class URLify {

    public static void main(String[] args) {
        String s="Mr John smith     ";
        System.out.println(urlify(s));
    }

    private static String urlify(String s) {
        char[]arr=s.toCharArray();
        StringBuilder url= new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (arr[i]==' '&& arr[i+1]==' ')
                return url.toString();
            if(arr[i]!=' '){
                url.append(arr[i]);
            }
            else
                url.append("%20");
        }
        return url.toString();
    }
}
