
/*Given an array of integers, every element appears twice except for one. Find that single one.*/
//using XOR

#include <unordered_map>
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_map<int,int>hashTable;
        
        for(int i=0;i<nums.size();i++){
            if(hashTable.count(nums[i]))
                hashTable.erase(nums[i]);
            else
                hashTable[nums[i]]=1;
        }
        for (int i = 0; i<nums.size(); i++) {
            if (hashTable[nums[i]] == 1) {
                return nums[i];
            }
        }
        
    }
};