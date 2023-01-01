import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);	// 오름차순으로 정렬
        return numbers[numbers.length - 2] * numbers[numbers.length - 1];
	 // 정렬한 배열의 마지막 전 숫자& 마지막 숫자 곱
    }
}


// 힌트를 조금 활용했는데 생각보다 답은 간단해서 허탈했던 문제. 
