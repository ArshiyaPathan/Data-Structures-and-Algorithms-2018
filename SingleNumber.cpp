    
/*Given an array of integers, every element appears twice except for one. Find that single one.*/

//using XOR


class Solution {
public:
    int singleNumber(vector<int>& nums) {
        if(nums.empty())
            return 0;
        int bit= nums[0];
        for(int i=1; i<nums.size(); i++){
            bit= bit^nums[i];
        }
        return bit;
    }
};