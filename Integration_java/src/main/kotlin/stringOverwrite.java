public class stringOverwrite {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        str.append(my_string.substring(0, s));
        str.append(overwrite_string);
        str.append(my_string.substring(s+overwrite_string.length(), my_string.length()));
        answer = str.toString();
        return answer;
    }
}

/**
 * level 0) 문자열 겹쳐쓰기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181943
 */


/**
 * 배운것 : substring, 문자열의길이는 .length()
 */