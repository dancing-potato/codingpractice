

class Solution {
    public int solution(int n) {
        int pizza = 6;
	 // 같은 수로 나눠질 때까지 +6조각
        while(pizza % n != 0){
            pizza += 6;
        }
        
	 // 박스 수 리턴
        return pizza / 6;
    }
}