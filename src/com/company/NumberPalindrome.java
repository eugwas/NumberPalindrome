package com.company;

public class NumberPalindrome {
    private int number;

    public NumberPalindrome(int number) {
        this.number = number;
    }

    public boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;

        while (stored > 0) {
            int lastDigit = stored % 10;
            reverse = (reverse * 10) + lastDigit;
            stored /= 10;
            System.out.println(lastDigit + " " + reverse);
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }

    }
}
