


class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
	 // 결과값을 소수로 나타내야 하므로 double로

        for(int i = 0; i < numbers.length; i++){
            answer += numbers[i];          
        }
        
        return answer / numbers.length;
    }
}