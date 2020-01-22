import java.util.Scanner;

public class MaxDay {
	
	private static  final int[] MAX_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
	public  int GetMonthOfMaxDays(int month){return MAX_DAYS[month-1];}
	
	public void samplecalendar()
	{
		System.out.println(
				"일 월 화 수 목 금 토\r\n" + 
				"--------------------\r\n" + 
				" 1  2  3  4  5  6  7\r\n" + 
				" 8  9 10 11 12 13 14\r\n" + 
				"15 16 17 18 19 20 21\r\n" + 
				"22 23 24 25 26 27 28");		
	}
 

	public static void main(String[] args) {
		MaxDay day=new MaxDay();
		System.out.println("월 입력");
		Scanner scanner=new Scanner(System.in);
		int month=scanner.nextInt();
		
		
		System.out.printf("%d요일의 최대 날은 %d이다.\n",month,day.GetMonthOfMaxDays(month));
		day.samplecalendar();
		scanner.close();
		
	}
	

}
