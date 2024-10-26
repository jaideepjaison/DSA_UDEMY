package Interview;

public class SecondMinEleARRAY {

    public static void main(String[] args) {
        int[] arr={-3,0,5,-1,-2};

        int min=arr[0];
        int secmin=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                System.out.println("arr[i] if :"+arr[i]);
                secmin=min;
                min=arr[i];
            }else if (arr[i]<secmin) {
                System.out.println("arr[i] else :"+arr[i]);
                secmin=arr[i];
            }
        }

        System.out.println("sec min :"+secmin);
        System.out.println("min :"+min);
    }
}
