import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q_1181 {
	
	static int N;
	static String[] arr;
	
	public static void main(String[] args) throws IOException {
		/*
		 * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
		 *
		 * 	1. 길이가 짧은 것부터
		 * 	2. 길이가 같으면 사전 순으로
		 * 
		 * 첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 
		 * 둘째 줄부터 N개의 줄에 걸쳐 
		 * 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
		 * 주어지는 문자열의 길이는 50을 넘지 않는다.
		 * 
		 * 
		 * 조건에 따라 정렬하여 단어들을 출력한다. 
		 * 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다
		 *  
		 *  예제입력 ) 
		    13
			but
			i
			wont
			hesitate
			no
			more
			no
			more
			it
			cannot
			wait
			im
			yours
		   
		 * 예제출력 ) 
		    i
			im
			it
			no
			but
			more
			wait
			wont
			yours
			cannot
			hesitate 
		 *  
		 */
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
					// 문자열 길이가 같다면 사전순으로 정렬
				} else {
					return o1.length() - o2.length();
					// 해당 반환 값이 양수면 o1이 큰값이 됨
				}
			}
		});
			
		System.out.println(arr[0]);
		for(int i = 1; i < N; i++) {
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
		
		}
		
	}

}
