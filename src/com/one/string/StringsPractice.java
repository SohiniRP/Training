package com.one.string;

public class StringsPractice {

    public static void main(String[] args) {
        //ways of creating Strings
        //1. String Literal
        String s = "Sohini";
        System.out.println(s);
        //2. New Keyword
        String newS = new String("Sohini");
        System.out.println(newS);
        System.out.println(s==newS);
        System.out.println(s.equals(newS));
        System.out.println(newS.intern()==s);
        //3. StringBuilder
        StringBuilder sb = new StringBuilder("SohiniPaul");
        System.out.println(sb.append(1));
        System.out.println(sb.reverse());
        //4. StringBuffer
        StringBuffer sBuff = new StringBuffer("SP");
        System.out.println(sBuff.append("aul"));
        System.out.println(sBuff.replace(0,1, "Sohini"));

        //String methods
        //1. split()
        String splitString = new String("I am learning Java Strings");
        String[] splittedString = splitString.split(" ");
        for(String a: splittedString){
            System.out.println(a);
        }

        String regexString  = "a//b//c//de";
            //1. split() Without limit Parameter
        String[] spl = regexString.split("//");
        for(String a: spl){
            System.out.println(a);
        }
            //2. split() With limit Parameter

        //2. indent()
        //3. transform()
        //4. repeat()
        //5. strip()
        //6. isBlank()
        //7. lines()
    }
}
