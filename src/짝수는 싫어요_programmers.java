
// 내 풀이 
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                answer[i/2] = i;
            }
        }
        
        return answer;
    }
}



// 다른 분 풀이(다양한 방법)
// 1. 
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}


// 2. 
import java.util.ArrayList;
class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> list=new ArrayList<Integer>(); //홀수를 담을 list
        
        for(int i=1; i<=n; i+=2) {                        //1부터 매개변수n까지 2씩 더하면서 
            list.add(i);                                  //list에 추가
        }
        
        return list;
    }
}