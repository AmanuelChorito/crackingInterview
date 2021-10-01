package arrayandstring;

public class Armstrong
{
    public static void main(String[] args) throws Exception {
        Armstrong armstrong= new Armstrong();
        System.out.println( armstrong.isArmstrong(1634));
    }

    public  boolean isArmstrong(int a) throws Exception {
        //find number of digit;

        if(a<0) throw new Exception();
        int pow=0;
        int tempn=a; ;
        while (tempn>0){
            tempn=tempn/10;
            pow++;
        }
        //find the digit, cube then add until finished
        int temp=a;
        long sum=0;
        while (a>0){

            sum+= Math.pow(a%10, pow);
            a=a/10;
        }
        System.out.println("sum"+sum);
        return sum==temp;
    }

}
