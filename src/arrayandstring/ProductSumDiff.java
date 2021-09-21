package arrayandstring;

public class ProductSumDiff {
    public static void main(String[] args) {
        System.out.println(calcDiff(123456));
        System.out.println(isBeautifulString("bbbaacdafe"));
    }

    private static int calcDiff(int n) {
        int product=1;
        int sum=0;
        while (n>0){
            product*=n%10;
            sum+=n%10;
            n=n/10;
        }
        return product-sum;
    }
    public static boolean isBeautifulString(String str) {
        int[] arr = new int[128];
        for(int i=0; i<str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        for (int i = 'a'; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]) return false;
        }
        return true;
    }

}
