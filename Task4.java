package homeWorkWithLeetcode;

class solution4 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            Character c1 = s.charAt(left);
            Character c2 = s.charAt(right);
            if (!Character.isLetterOrDigit(c1)) {
                left++;
            }
            else if (!Character.isLetterOrDigit(c2)) {
                right--;
            }
            else {
                if (c1 != c2) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

}
