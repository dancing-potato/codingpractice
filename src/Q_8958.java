import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
		 O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
		 문제를 맞은 경우 그 문제의 점수는 그 문제까지 
		 연속된 O의 개수가 된다. 
		 예를 들어, 10번 문제의 점수는 3이 된다.
		 "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
  		 OX퀴즈의 결과가 주어졌을 때, 
  		 점수를 구하는 프로그램을 작성하시오.
  		 
  		 
  		 첫째 줄에 테스트 케이스의 개수가 주어진다. 
  		 각 테스트 케이스는 한 줄로 이루어져 있고, 
  		 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 
  		 문자열은 O와 X만으로 이루어져 있다.
  		 
		  ex입력)
		  5
		  OOXXOXXOOO
		  OOXXOOXXOO
		  OXOXOXOXOXOXOX
		  OOOOOOOOOO
		  OOOOXOOOOXOOOOX
  		 
  		 
  		  ex출력)
  		  10
		  9
		  7
		  55
		  30
  		 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
		int t = Integer.parseInt(br.readLine());  //테스트 케이스 개수
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            int add = 0;  //더할 점수
            int score = 0;  //점수
            for (int j = 0; j < s.length(); j++) {
            	
                if (s.charAt(j) == 'O') {
                    add++;  //더할 점수 +1
                    score += add;  //총점수에 더함
                    
                    
                } else {
                    add = 0;  //X이면 더할 점수 초기화
                }
            }
            sb.append(score + "\n");
        }
        System.out.print(sb);
		
		
	}

}
