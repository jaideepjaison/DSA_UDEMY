package Interview;

public class SecondLarEleIn_Array {
    public static void main(String[] args) {
        int[] arr={14,12,3,4,25};
        int greater=arr[0];
        int sec=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>greater){
                sec=greater;
                greater=arr[i];
            } else if (arr[i]>sec) {
                sec=arr[i];
            }
//            if(arr[i]>greater)
//            {   sec=greater;
//                greater=arr[i];
//            }
//               for(int j=i+1;j<arr.length;j++)
//               {
//                   if(arr[i]>arr[j]){
//                       if(greater<arr[i]) {
//                           greater = arr[i];
//                       }
//
//                   }
//               }

        }
        System.out.println("arr "+sec);
    }
}
