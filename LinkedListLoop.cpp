//Using SET

class Solution {
public:
    bool hasCycle(ListNode *head) {
        std::unordered_set<ListNode *> nodeSet;
    
        ListNode *cur = head;
        while (cur != NULL) {
            if (nodeSet.find(cur) != nodeSet.end()) {
                return true;
            }
            nodeSet.insert(cur);
            cur = cur->next;
        }

        return false;
    }
};