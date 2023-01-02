import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);		// 오름차순 정렬
        
	 // 배열의 0,1번 인덱스 합 < 2번 인덱스 값 => 삼각형 완성
        if( sides[2] < (sides[0] + sides[1]) ){
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}