package Interview;

public class Reverse_String {

    public static void main(String[] args) {
        String s="one two three";
        String sentance="";
        String[] words = s.split(" ");
        String rev="";
        System.out.println("before :");
        System.out.print("After output :");
        for (int i=0;i<words.length;i++)
        {

            sentance=words[i];
            for(int j=sentance.length();j>0;j--)
            {
                rev+=sentance.charAt(j-1);
            }
            System.out.print(rev+" ");
            rev="";
        }
//        String rev="";
//        int len=s.length();
//        for (int i=len;i>0;i--)
//        {
//            rev+=s.charAt(i-1);
//        }
//        System.out.println("reverse String is :"+rev);
    }
}
