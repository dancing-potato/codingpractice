import java.util.Scanner;

public class Q_10872 {

	public static void main(String[] args) {
		
		/*
		 * 재귀함수이용문제 //
		 * 0보다 크거나 같은 정수 N이 주어진다. 
		 * 이때, N!을 출력하는 프로그램을 작성하시오.
		 * 
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if(n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }
		
		
		
}


