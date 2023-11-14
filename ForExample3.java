package day0913;

public class ForExample3 {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+(1+2+3+4)...(1+2+3+...+10)의 결과를 나타내시오.
		
//		for(int i=1; i<=1; i++) {
//			System.out.print(i + "+");
//			for(int j=1; j<=10; j+=i) {
//				if(j <= 9) {
//				System.out.print("("+ i + "+" + (j+1) + ")");
//				System.out.print("+");
//				}else {
//					
//				}
//			
//				
//			}
//			
//		}

		int sum = 0, total = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.println(sum);
			total += sum;
		}
		System.out.println("총합계 : " + total);
		
		int sum1 = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				sum1 += j;
			}
			System.out.println(sum1);
		
		}
		
	}

}
