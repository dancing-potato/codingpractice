class Solution {
    public int solution(int angle) {
        
        return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
    }
}


// 최대한 간결하게 해보고싶어서 삼항으로 풀었음
