package GFG;

import java.util.Arrays;
import java.util.List;

public class GFG_8_AUG {

    public static void main(String[] args) {
        int k=4;
        int arr1[]={2, 3, 6, 7, 9};
        int arr2[]={1, 4, 8, 10};

        int tot=arr1.length+arr2.length;
        int merge[]=new int[tot];
        for (int i=0;i<arr1.length;i++){
            merge[i]=arr1[i];
        }

        for (int j=0;j<arr2.length;j++){
            merge[arr2.length+j]=arr2[j];
        }
        Arrays.sort(merge);
        System.out.println("value :"+merge[5]);
    }
}
