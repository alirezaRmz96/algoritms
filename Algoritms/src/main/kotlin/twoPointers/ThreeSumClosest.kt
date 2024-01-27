package twoPointers

fun main() {

    val threeSumClosest = ThreeSumClosest()
    println(threeSumClosest.threeSumClosest(nums = intArrayOf(-1,2,1,-4), target = 1))
}

class ThreeSumClosest {
    fun threeSumClosest(nums: IntArray, target: Int): Int {

        if (nums.size <= 2)
            return 0

        nums.sort()

        val pointOne = 0
        val pointTwo = 1
        var pointThree = 2

        var count = nums[pointOne] + nums[pointTwo] + nums[pointThree]

        while (true) {

            if (count >= target || pointThree == nums.size - 1)
                break
            else {
                pointThree += 1
                println(pointThree)
                count = nums[pointOne] + nums[pointTwo] + nums[pointThree]
            }

        }

        return count
    }
}