
class Solution {
    fun solution(myStr: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        val result = myStr.split(Regex("a|b|c"))
            .filter{ it.isNotEmpty() }
            .toTypedArray()

        if(result.isEmpty()){
            answer += "EMPTY"
        } else {
            answer = result
        }

        return answer
    }
}





/**
 * level 0) 세 개의 구분자
 * https://school.programmers.co.kr/learn/courses/30/lessons/181862
 */