public class kTimesStr {
    public String solution(String my_string, int k) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < k ; i++){
            str.append(my_string);
        }
        answer = str.toString();
        return answer;
    }
}

/**
 * level 0) 문자열 곱하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */
