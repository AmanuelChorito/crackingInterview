package arrayandstring;

public class Unique {
    public static void main(String[] args) {
        System.out.println("hello");
        String s="aman";
     System.out.println(isUnique(s));

    }

     public static String isUnique(String str) {

        int count=0;
        System.out.println("Hello s");
       for(int i=0;i< str.length()-1;){
           if(str.charAt(i)==str.charAt(i+1)){
               return "false";
           }

       }
        return "True";
    }
}
