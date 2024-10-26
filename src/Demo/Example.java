package Demo;

import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String fileName="55lengthNamehhhhxhhxhshshhhhhhhsshhhhhhhhhhhkadfgghh.docx";
        boolean patternMatch=false;
        String regexMatch = "[^-!@#$%^&*:;'\"/\\\\?<>=|+=~.]+\\.[a-zA-Z0-9]+";
        Pattern pattern = Pattern.compile(regexMatch);
        patternMatch = pattern.matcher(fileName).matches();

        System.out.println("patternMatch :"+patternMatch);

        String filename="ND TSUhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhj";
        String fileNameOnly="";

        int index = filename.lastIndexOf('.');
        System.out.println("file name length :" + filename.length());
        if(index!=-1) {
            System.out.println("file name length :" + filename.length() + " index :" + index);

            fileNameOnly = filename.substring(0, index);
            System.out.println("fileNameOnly :" + fileNameOnly);
        }
    }
}
