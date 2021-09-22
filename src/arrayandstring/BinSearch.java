package arrayandstring;

public class BinSearch {
    public static void main(String[] args) {
        System.out.println( search("ACT",'A'));
    }
    public static boolean search(String s, char c) {


        if (s == null )
            return false;

        if (s.length() == 1)
            return s.charAt(0) == c;

        int mid = (s.length()) / 2;

        if (c == s.charAt(mid))
            return true;

        if (c < s.charAt(mid))
            // left side
            return search(s.substring(0, mid), c);

        //right side
        return search(s.substring(mid + 1), c);



    }



}


