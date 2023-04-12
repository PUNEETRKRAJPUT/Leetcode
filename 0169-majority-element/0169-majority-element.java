class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int majorityindex= 0;
        for(int i=1 ; i<nums.length;i++){
            count+=nums[i]==nums [majorityindex] ? 1:-1;
            if(count==0){
                 majorityindex=++i;
                count++;
            }
        }
        return nums[majorityindex];
        
    }
}