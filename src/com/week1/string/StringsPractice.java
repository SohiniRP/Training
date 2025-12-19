package com.week1.string;

import java.util.Arrays;

public class StringsPractice {

    public static void main(String[] args) {
        //ways of creating Strings
        //1. String Literal
        String name = "Sohini";
        System.out.println(name);
        //2. New Keyword
        String newName = new String("Sohini");
        System.out.println(newName);
        System.out.println(name==newName);
        System.out.println(name.equals(newName));
        System.out.println(newName.intern()==name);
        //3. StringBuilder
        StringBuilder sb = new StringBuilder("SohiniPaul");
        System.out.println(sb.append(1));
        System.out.println(sb.reverse());
        //4. StringBuffer
        StringBuffer bufferString = new StringBuffer("SP");
        System.out.println(bufferString.append("aul"));
        System.out.println(bufferString.replace(0,1, "Sohini"));

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
        spl = regexString.split("//", 2);
        System.out.println("result when limit is 2 = " + Arrays.toString(spl));
            //3. split() at the + character
        String vowels = "a+e+f";
        String[] result = vowels.split("\\+");
        System.out.println("result = " + Arrays.toString(result));
        //2. indent()
        String indentS = "Hello\nWorld";
//        System.out.println(indentS.indent(4));
        //3. transform()
        String s3 = "java";

//        String res = s3.transform(str -> str.toUpperCase());
//        System.out.println(res);
        //4. repeat()
        String s4 = "Hi ";

        System.out.println(s4.repeat(3));
        //5. strip()
        String s5 = "   Hello   ";

        System.out.println(s5.strip());
        //6. isBlank()
        System.out.println("   ".isBlank());
        //7. lines()
        String s7 = "Java\nPython\nC++";

        s7.lines().forEach(System.out::println);
    }
}
