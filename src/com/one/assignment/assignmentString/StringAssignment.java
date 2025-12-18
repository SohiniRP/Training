package com.one.assignment.assignmentString;

public class StringAssignment {
    public static void main(String[] args) {
        String s = "s@$s%g^a";  //Expected output: a@$g%s^s
        System.out.println(swapLetters(s));
    }

    public static String swapLetters(String s){
        int left = 0;
        int right = s.length() -1;
        char[] strArr = s.toCharArray();
        while(left<=right){
            if(!Character.isLetter(strArr[left])) left++;
            else if(!Character.isLetter(strArr[right])) right--;

            else{
                char temp = strArr[left];
                strArr[left] = strArr[right];
                strArr[right] = temp;
                left++; right--;
            }
        }

        return new String(strArr);
    }

}
