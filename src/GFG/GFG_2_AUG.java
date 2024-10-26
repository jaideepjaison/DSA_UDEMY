package GFG;

import java.util.Arrays;

public class GFG_2_AUG {

    public static void main(String[] args) {
        String str1 = "ecfbefdcfca";
        String str2 = "badfcbebbf";
        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        int n = 0;
        if (ch1.length > ch2.length) {
            n = ch1.length;
        } else {
            n = ch2.length;
        }
        int i = 0;
        int j = 0;
        int count1 = 0;
        // n=11
        //abcccdeefff
        //abbbbcdeff
        while (i < n) {
            //System.out.println("str1.charAt(i) :"+str1.charAt(i)+" str2.charAt(j) :"+str2.charAt(j));
            if (ch1[i] == ch2[j]) {
                i++;
                j++;

            } else if (ch1[i] != ch2[j])
                j++;
            count1 = count1 + 1;
        }
        System.out.println("coutn :" + count1);
    }
}




