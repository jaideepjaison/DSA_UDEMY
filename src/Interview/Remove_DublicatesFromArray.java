package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_DublicatesFromArray {



            public static void main(String args[]){
                int arr[]={1,2,3,4,1,2,3};
                int target = 4;
                List<Integer> indexes=new ArrayList<>();

                for(int i=0;i<arr.length;i++){

                    for(int j=i+1;j<arr.length;j++){
                        if(arr[i]+arr[j]==target){
                            indexes.add(i);
                            indexes.add(j);
                        }
                    }

                }
                System.out.println("indexes"+indexes);

            }

}
