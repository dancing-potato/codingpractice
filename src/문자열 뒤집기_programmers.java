
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = my_string.length() - 1; i >= 0; i--){
            answer += my_string.substring(i,i+1);
        }
        return answer;
    }
}


// 문자열 길이에서 -1씩 줄이면서 substring으로 배열잘라서 더하기