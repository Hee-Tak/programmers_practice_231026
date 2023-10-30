
class HideDigitSum {
    fun solution(my_string: String): Int {
        val numbers = my_string.split(Regex("[^0-9]"))
            .filter { it.isNotEmpty() }
            .map { it.toInt() }
        return if (numbers.isNotEmpty()) numbers.sum() else 0
    }
}

/**
 * level 0) 숨어있는 숫자의 덧셈 (2)
 */