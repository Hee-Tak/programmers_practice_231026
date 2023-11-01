class Solution {
    fun solution(arr: IntArray): IntArray {
        val stk = mutableListOf<Int>()
        var i = 0
        while (i < arr.size) {
            if (stk.isEmpty() || (!stk.isEmpty() && stk.last() == arr[i])) {
                stk.add(arr[i])
                i++
            } else if (!stk.isEmpty() && (stk.last() != arr[i])) {
                stk.removeAt(stk.size - 1)
                i++
            }
        }
        return if (stk.isEmpty()) intArrayOf(-1) else stk.toIntArray()
    }
}

/**
 * level 0) 배열 만들기 6 (아직)
 * https://school.programmers.co.kr/learn/courses/30/lessons/181859
 */