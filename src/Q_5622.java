import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_5622 {

	public static void main(String[] args) throws IOException {
		/*
		 * 다이얼 전화기 문제.
		 * 그림이 첨부되어있어 문제는 여기적지않았음
		 * 검색해서 다시 볼것..
		 * 
		 */
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String s = br.readLine();
        
		int count=0;
		int k = s.length();
        
		for(int i = 0 ; i < k ; i++) {
        
			switch(s.charAt(i)) {
			case 'A' : case 'B': case 'C' : 
				count += 3; 
				break;
                
			case 'D' : case 'E': case 'F' : 
				count += 4; 
				break;
                
			case 'G' : case 'H': case 'I' : 
				count += 5; 
				break;
                
			case 'J' : case 'K': case 'L' : 
				count += 6; 
				break;
                
			case 'M' : case 'N': case 'O' : 
				count += 7; 
				break;
                
			case 'P' : case 'Q': case 'R' : case 'S' :
				count += 8; 
				break;
                
			case 'T' : case 'U': case 'V' : 
				count += 9; 
				break;
                
			case 'W' : case 'X': case 'Y' : case 'Z' : 
				count += 10; 
				break;
			}
		}		
		System.out.print(count);
		
	}

}
