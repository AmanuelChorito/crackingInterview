package arrayandstring;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public  int[] twoSum(int[] nums, int target) {
        //

        Map<Integer,Integer> sum=new HashMap<Integer,Integer>();
        int[] indices= new int[2];
        int indCount=0;
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(!sum.containsKey(x)){
                sum.put(nums[i],i);
            }
            else{
                indices[0]=sum.get(x);
                indices[1]=i;
            }
        }

        return indices;
    }
}

