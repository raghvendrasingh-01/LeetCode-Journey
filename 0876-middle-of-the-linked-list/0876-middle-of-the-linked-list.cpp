/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode *p1 = head, *p2 = head->next;
        while(p2 != nullptr)
        {
            if(p2->next != nullptr)
            {
                p2 = p2->next->next;
                p1 = p1->next;
            }
            else
            {
                p2 = p2->next;
                p1 = p1->next;
            }
        }
        return p1;
    }
};