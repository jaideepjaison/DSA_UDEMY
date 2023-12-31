package Time_Complexity_O;
// O(N)
public class Example_O_of_n {

    public static void main(String[] args) {
        int n=10;
        // this is O(N) Example
        for(int i=0;i<n;i++)
        {
            System.out.println(i);
        }

        // this is O(2N), but here 2 is constant so its also O(N)

        for(int i=0;i<n;i++)
        {
            System.out.println("I :"+i);
        }
        for(int j=0;j<n;j++)
        {
            System.out.println("J :"+j);
        }
        // END

        // Diffeerent type of input
        int a=10,b=20;

        for(int i=0;i<a;i++)
        {
            System.out.println("I :"+i);
        }
        for(int j=0;j<b;j++)
        {
            System.out.println("J :"+j);
        }

        // Now the result of both for loop is diffrent,so O(a) + O(b) = O(a+b).
        }
}
