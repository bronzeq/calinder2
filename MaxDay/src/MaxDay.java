import java.util.Scanner;

public class MaxDay {
	
	private static  final int[] MAX_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
	public  int GetMonthOfMaxDays(int month){return MAX_DAYS[month-1];}
	

	public static void main(String[] args) {
		MaxDay day=new MaxDay();
		System.out.println("월 입력");
		Scanner scanner=new Scanner(System.in);
		int month=scanner.nextInt();
		
		
		System.out.printf("%d요일의 최대 날은 %d이다.",month,day.GetMonthOfMaxDays(month));
		
		scanner.close();
		
	}
	

}
