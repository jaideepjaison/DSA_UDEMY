package Interview;

import java.util.ArrayList;
import java.util.List;

public class Sum_of_SubArray {

    public static void main(String [] args){

        int [] nums={-2,1,-3,4,-1,2,1,-5,4};
        int n=nums.length;
        int subSum=0;
        int maxSum=0;
        for(int i=0;i<n;i++){
                subSum=subSum+nums[i];

            if(subSum>maxSum){
                maxSum=subSum;
            }
        }
        System.out.println("subSum :"+subSum);
        System.out.println("maxSum :"+maxSum);
    }
}
