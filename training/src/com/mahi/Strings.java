package com.mahi;

public class Strings {
    public static void main(String[] args) {
        String str1 = new String("String");
        String str2 = new String("String");

        if(str1 == str2){ 
            System.out.println("Str1 and str2 points to same reference.");
        }else{
            System.out.println("Str1 and str2 points to different reference.");
        }

        String str3 = "String";
        String str4 = "String";

        if(str3 == str4){
            System.out.println("Str3 and str4 points to same reference.");
        }else{
            System.out.println("Str3 and str4 points to different reference.");
        }
    }
}
		  





