package org.example;

public class Main {

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int prev = 0;
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i++) {
            int curr = romanCharToInt(s.charAt(i));
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
            prev = curr;
        }
        return result;
    }

    public static int romanCharToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
