package com.kodilla.stream.mirror;

public class Mirror {

    public static String mirrorString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Adam", "Ewa", "Kajak"};
        for (String s : words) {
            String mirrored = mirrorString(s);
            System.out.println(mirrored);
        }
    }

}
