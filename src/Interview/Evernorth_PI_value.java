package Interview;

public class Evernorth_PI_value {

    public static void main(String[] args) {
        int n=5;
        double sum=0;
        double finalVal=0.0;

        for(int i=1;i<=n;i++)
        {
            sum=sum+ Math.pow(i,2);
        }
        finalVal=Math.sqrt(sum*6);

        System.out.println("finalVal :"+finalVal);
    }
}
