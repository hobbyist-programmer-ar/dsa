package org.hobbiesofar.twopointer;

class IsPalindrome {
    public static boolean isPalindrome(String s) {
        // WRITE YOUR BRILLIANT CODE HERE
        int left = 0;
        int right = s.length() - 1;
        char[] sChar = s.toCharArray();
        while(left <= right) {
            while (l < r && !Character.isLetterOrDigit(arr[l])) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(arr[r])) {
                r--;
            }
            if (Character.toLowerCase(arr[l]) != Character.toLowerCase(arr[r])) return false;
            l++;
            r--;
        }
        return true;
    }
}
