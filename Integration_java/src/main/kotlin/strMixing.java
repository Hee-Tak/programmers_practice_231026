public class strMixing {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < str1.length(); i++){
            str.append(str1.charAt(i));
            str.append(str2.charAt(i));
        }
        answer = str.toString();
        return answer;
    }
}

/**
 * level 0) 문자열 섞기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181942
 */
