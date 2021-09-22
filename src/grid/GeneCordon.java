package grid;

public class GeneCordon {
    public static void main(String[] args) {
        System.out.println( findGene("AATGCGTAATTAATCG"));
    }

    private static String findGene(String DNA) {

        // find first occurence of "ATG" call its index start inded
        int startIndex=DNA.indexOf("ATG");
        // find the "TAA" starting from (startIndex+3), call this
        int currIndex=DNA.indexOf("TAA",startIndex+3);
        // as long as currIndex is not equal to -1
        while(currIndex!=-1){
            //check if(currIndex-startIndex) is multiple of 3
            if((currIndex-startIndex)%3==0){
                //if so, the text btn startIndex and current index+3 is answer
                return DNA.substring(startIndex,currIndex+3);
            }
                else{
                        currIndex=DNA.indexOf("TAA",currIndex+1);
            }
        }
return "";

    }

    //linear contains and binary contains

}
