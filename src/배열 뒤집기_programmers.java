

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
	 // int형으로 num_list 길이만큼 선언

        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[num_list.length -i -1];
	 // 배열의 길이 -i-1번째를 역순으로 넣음
        }
	 
        return answer;
    }
}