package com.Vaibhav.Strings;

public class SrtingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch='A'; ch<='Z';ch++){
            sb.append(ch);
        }
        System.out.println("string : "+sb);
        System.out.println("length of string : "+sb.length());
    }
}
