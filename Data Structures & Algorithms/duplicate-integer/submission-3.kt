class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val memo = mutableSetOf<Int>()
        for(n in nums){
            if(memo.contains(n)) return true
            memo.add(n)
        }
        return false
    }
}
