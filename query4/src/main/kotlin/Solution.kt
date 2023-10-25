class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()

        answer = arr

        for(query in queries){
            val s = query[0]
            val e = query[1]
            val k = query[2]
            for(i in s..e){
                if(i % k == 0){
                    answer[i]++
                }
            }
        }


        return answer
    }
}

/**
 * level 0) 수열 구간 쿼리 4
 * https://school.programmers.co.kr/learn/courses/30/lessons/181922?language=kotlin
 */