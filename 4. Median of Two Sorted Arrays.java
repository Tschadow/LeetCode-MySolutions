class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums[] = new int[nums1.length + nums2.length];
        if(nums.length == 0)    return 0;
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        if(nums.length % 2 != 0)    return (float) nums[nums.length / 2];
        return (float) (nums[nums.length / 2] + nums[(nums.length / 2) - 1]) / 2;
    }
}
