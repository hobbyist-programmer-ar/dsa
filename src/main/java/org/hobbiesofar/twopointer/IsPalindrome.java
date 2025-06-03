package org.hobbiesofar.twopointer;

class IsPalindrome {
    public static boolean isPalindrome(String s) {
        // WRITE YOUR BRILLIANT CODE HERE
        int left = 0;
        int right = s.length() - 1;
        char[] sChar = s.toCharArray();
        while(left <= right) {
            while (left < right && !Character.isLetterOrDigit(sChar[left])) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(sChar[right])) {
                right--;
            }
            if (Character.toLowerCase(sChar[left]) != Character.toLowerCase(sChar[right])) return false;
            left++;
            right--;
        }
        return true;
    }
}
