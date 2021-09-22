package arrayandstring;

import java.util.Arrays;

public class MInSort {
    static String[] strArray={"b","a","c"};

    public static void main(String[] args) {
        System.out.println(sort());
    }

    public static String sort() {
        if (strArray == null || strArray.length <= 1) return  "";
        int len = strArray.length;
        int temp = 0;
        for (int i = 0; i < len; ++i) {
            int nextMinPos = minpos(i, len - 1);
            swap(i, nextMinPos);
        }
return Arrays.toString(strArray);
    }

    public static void swap(int i, int j) {
        String temp = strArray[i];
        strArray[i] = strArray[j];
        strArray[j] = temp;

    }

    //find minimum of arr between the indices bottom and top
    public static int minpos(int bottom, int top) {
        String m = strArray[bottom];
        int index = bottom;
        for (int i = bottom + 1; i <= top; ++i) {
            if ((strArray[i].compareTo(m)) < 0) {
                m = strArray[i];
                index = i;
            }
        }
        //return location of min, not the min itself
        return index;
    }
    }


