
import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        
	 // copyOf(arr, length)
	 // copyOfRange(arr, from, to)
	 // 여기서 to값은 포함되지 않음! 
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        return answer;
    }
}