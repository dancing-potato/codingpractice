class Solution {
    public int solution(int n) {
        int answer = 0;
	 // 매개변수로 들어온 n을 7로 나누고 올림
        answer = (int) Math.ceil((double)n/7);
        return answer;
    }
}