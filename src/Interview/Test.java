package Interview;

public class Test {
    public static void main(String[] args) {

        String s="one two three";
        String[] word=s.split(" ");
        String sentence="";
        String rev="";
       for(int i=0;i< word.length;i++)
       {
          sentence=word[i];

          for(int j=sentence.length();j>0;j--){
              rev+=sentence.charAt(j-1);
          }
          System.out.print(rev+" ");
          rev="";
       }


    }
}
