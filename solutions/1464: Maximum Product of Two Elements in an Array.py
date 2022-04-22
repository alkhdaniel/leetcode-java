class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);                                        #sort the array
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);   #since the array is sorted ascending, we need to get the product of the last 2 indices
    }
}
