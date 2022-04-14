class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];                                        //Answer is an an int array of size 2
        Map<Integer, Integer> numsMap = new HashMap<>();                  //We will be using hashmaps to solve the problem with a time complexity O(n)
        for (int i=0; i<nums.length; i++) {                               
            if(numsMap.containsKey(target-nums[i])) {                     //Check if the hashmap contains the number we need to solve the problem
                int[] tempAnswer = {numsMap.get(target-nums[i]), i};      //put the answer in a temporary array
                answer =  tempAnswer;                                     //put the answer inside answer int.
                return answer;                                            //return the answer
            }
            numsMap.put(nums[i], i);                                      //The answer was not found; put the number we just checked for inside the hashmap for the next iteration
        }
        return answer;
    }
}
