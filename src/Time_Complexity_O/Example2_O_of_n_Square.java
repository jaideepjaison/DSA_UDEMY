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
    }
}
