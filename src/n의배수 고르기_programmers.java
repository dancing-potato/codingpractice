
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        ArrayList<Integer> numList = new ArrayList<>();
	 // ArrayList안에 제네릭 <>에 클래스타입 -> int 말고 Integer!
        // 가변적이므로 최대길이 신경X

        for(int num : numlist){
            if(num % n == 0){
                numList.add(num);
		  // ArrayList에 요소추가 -> add(Object)
            }
        }
                
        return numList.stream().mapToInt(i->i).toArray();
    }
}


// 나중에 한번더 안보고 풀어볼것. 막히는부분 없는지.