package Time_Complexity_O;
//O(N2)
public class Example2_O_of_n_Square {
    public static void main(String[] args) {
        int n=10;
        // N*N times its running
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++){
                System.out.println(i+" "+j);
            }
        }

        //Now for diifrent input a and n
        int a=10,b=20;
        for(int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++){
                System.out.println(i+" "+j);
            }
        }
        // now its O(a*b)
    }
}
