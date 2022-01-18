class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for ((index, value) in nums.withIndex()) {
            var tempIndex = index + 1
            while (tempIndex < nums.size) {
                if (value + nums[tempIndex] == target) {
                    return intArrayOf(index, tempIndex)
                }
                tempIndex++
            }
        }
        return IntArray(0)
    }
}

fun main() {
    val s = Solution1()
    val nums: IntArray = intArrayOf(2, 11, 7, 15)
    val target = 9
    print(s.twoSum(nums, target).contentToString())
}
