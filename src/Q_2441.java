import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2441 {

	public static void main(String[] args) throws IOException {
		
		/*
		  첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., 
		  N번째 줄에는 별 1개를 찍는 문제
		  하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		  
		  예제입력)
		  5
		  
		  예제출력)
		  *****
  		   ****
		    ***
		     **
		      *
		  
		 */
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= count; i++) {
			for(int k = 1; k < i; k++) {
				sb.append(" ");
			}
			for(int j = count; j >= i; j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
