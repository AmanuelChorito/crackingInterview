package arrayandstring;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(23));
    }
    private static boolean isPrime(int input) {
        //this function	divide the number input by all the integers less than the input
        // and if no exact divisorsâ€“other than 1â€“are found, then n is prime.
        int count=0;
        if(input==0)
            return false;

        for(int n=1;n<Math.sqrt(input);n++) {
            if(input%n==0)
                count++;

        }

        if(count>1)
            return false;
        else
            return true;
    }

}
