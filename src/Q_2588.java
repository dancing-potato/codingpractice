import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2588 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
		 * 
		 * 			472   -(1)
		 * x		385   -(2)
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * 		   2360   -(3)
		 * 		  3776    -(4)
		 * 		 1416	  -(5)
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 *       181720   -(6)
		 * 
		 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
		 * (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		 * 
		 * 
		 * 
		 */
		
		
		// 1번째 방법
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
		
		char[] b = B.toCharArray();
		
		System.out.println(A * (b[2] - '0'));
		System.out.println(A * (b[1] - '0'));
		System.out.println(A * (b[0] - '0'));
		System.out.println(A * Integer.parseInt(B));
		
		
		
		
		// --------------------------------------------------------------------------
		
		
		
		// 2번째 방법 
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(br2.readLine());
		int D = Integer.parseInt(br2.readLine());
		
		br2.close();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(C * (D%10));
		sb.append('\n');

		sb.append(C * ((D%100)/10));
		sb.append('\n');
		
		sb.append(C * (D/100));
		sb.append('\n');
		
		sb.append(C * D);
		
		System.out.println(sb);
		
	}

}
