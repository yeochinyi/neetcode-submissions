class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for((i,n) in nums.withIndex()){
            val diff = target - n

            map[diff]?.let {
                return intArrayOf(it,i)
            }

            map[n] = i
        }
        return intArrayOf()
    }
}
