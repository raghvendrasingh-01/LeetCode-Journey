int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int *a = calloc(1, sizeof(int [2 * (size_t)1E9 + 10])), *m = a + (size_t)1E9 + 5;
    int *r = malloc(sizeof(int [2])), *n = nums - 1, t = target, sz = numsSize;
    while (sz-- && !m[t - *++n] && (m[*n] = n - nums + 1));
    return (*returnSize = (n - nums < numsSize) * 2) && (*r = m[t - *n] - 1, r[1] = n - nums, 1), free(a), r;
}