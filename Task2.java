package homeWorkWithLeetcode;

class solution2 {
    public int removeElement(int[] nums, int val) {
        int copyInd = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[copyInd] = nums[i];
                copyInd++;
                k++;
            }
        }
        while (copyInd < nums.length) {
            nums[copyInd++] = 0;
        }
        return k;
    }
}
