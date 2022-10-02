import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q_18108 {

	public static void main(String[] args) throws IOException {

		
		/*
		 * Q)
		 * 불교 국가인 태국은 불멸기원, 즉 석가모니가 열반한 해를 기준으로
		 * 연도를 세는 불기를 사용한다. 
		 * 반면, 우리나라는 서기 연도를 사용하고 있따. 
		 * 불기연도가 주어질 때 이를 서기연도로 바꿔주는 프로그램을
		 * 작성하시오.
		 * 
		 * 입력)
		 * 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다.
		 * (1000 <= y <= 3000)
		 * ex) 2541
		 * 
		 * 출력) 
		 * 1998
		 * 
		 */
		
		// Scanner 사용방법(입력을 읽어들이는 과정에서 정규식 검사가 오래걸림)
		Scanner sc = new Scanner(System.in);
		// 불기연도 y
		int y;
		y = sc.nextInt();
		System.out.println(y - 543);

		//------------------------------------------------------
		
		
		// BufferedReader 사용방법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine(); 			// 한 줄을 읽고 문자열로 반환함
		int year = Integer.parseInt(s);		// 반환 된 문자열을 정수로 바꿔줌
		
		System.out.println(year - 543);
		
	}

}
