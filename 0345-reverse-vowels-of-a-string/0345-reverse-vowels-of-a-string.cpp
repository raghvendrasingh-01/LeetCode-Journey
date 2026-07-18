class Solution {
public:
    string reverseVowels(string s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            char c1 = s[i], c2 = s[j];

            bool v1 = (c1 == 'a' || c1 == 'A' || c1 == 'e' || c1 == 'E' ||
                       c1 == 'i' || c1 == 'I' || c1 == 'o' || c1 == 'O' ||
                       c1 == 'u' || c1 == 'U');

            bool v2 = (c2 == 'a' || c2 == 'A' || c2 == 'e' || c2 == 'E' ||
                       c2 == 'i' || c2 == 'I' || c2 == 'o' || c2 == 'O' ||
                       c2 == 'u' || c2 == 'U');

            if (v1 && v2) {
                swap(s[i], s[j]);
                i++;
                j--;
            }
            else if (v1) {
                j--;
            }
            else if (v2) {
                i++;
            }
            else {
                i++;
                j--;
            }
        }

        return s;
    }
};