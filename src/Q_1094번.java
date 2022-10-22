import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;

public class Q_1094번 {

	public static void main(String[] args) throws ParseException, IOException {
		/*
		 
		 지민이는 길이가 64cm인 막대를 가지고 있다. 
		 어느 날, 그는 길이가 Xcm인 막대가 가지고 싶어졌다. 
		 지민이는 원래 가지고 있던 막대를 더 작은 막대로 자른다음에, 
		 풀로 붙여서 길이가 Xcm인 막대를 만들려고 한다.

		 막대를 자르는 가장 쉬운 방법은 절반으로 자르는 것이다. 
		 지민이는 아래와 같은 과정을 거쳐서 막대를 자르려고 한다.

			 1. 지민이가 가지고 있는 막대의 길이를 모두 더한다. 
			 처음에는 64cm 막대 하나만 가지고 있다. 
			 이때, 합이 X보다 크다면, 아래와 같은 과정을 반복한다.
			 
				 1. 가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
				 2. 만약, 위에서 자른 막대의 절반 중 하나를 버리고 
				 남아있는 막대의 길이의 합이 X보다 크거나 같다면, 
				 위에서 자른 막대의 절반 중 하나를 버린다.
				 
			 2. 이제, 남아있는 모든 막대를 풀로 붙여서 Xcm를 만든다.
		 
		 X가 주어졌을 때, 위의 과정을 거친다면, 
		 몇 개의 막대를 풀로 붙여서 Xcm를 만들 수 있는지 
		 구하는 프로그램을 작성하시오. 
		 
		 예제입력 ) 23   32	  64   48
		 예제출력 ) 4    1    1    2
		 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		int binary = 64;
		
		while(true) {	// 64, 32, 16, 8, 4, 2, 1 (2진수)
				if(binary <= num) {				// 현재 단위보다 크다면
						num -= binary;			// 입력값에서 현재 단위 빼고
						count += 1;				// 카운트 +1
				}
				
				if(binary==1) {
					break;						// 1에서 종료
				} else {
					binary /= 2;				// 다음 단위로 넘어가기
				}
		}
		
		
		bw.write(count+"");
		
		bw.close();
		br.close();
		
		
	}

}
