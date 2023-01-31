

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] transArr = my_string.replaceAll("[a-zA-Z]", "").split("");
        
        for (int i = 0; i < transArr.length; i++){
            answer += Integer.parseInt(transArr[i]);
        }
                
        return answer;
    }
}