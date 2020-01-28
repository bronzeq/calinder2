import java.util.Scanner;

public class MaxDay {
	
	private static  final int[] MAX_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
	public  int GetMonthOfMaxDays(Scanner scanner){
		return MAX_DAYS[scanner-1];
		}
	}

	 public void samplecalendar(int year, int month)
	{
		 System.out.printf("%4d %3d/n",year month);
		System.out.println(
				"일 월 화 수 목 금 토\r\n" + 
				"--------------------\r\n" + 
				" 1  2  3  4  5  6  7\r\n" + 
				" 8  9 10 11 12 13 14\r\n" + 
				"15 16 17 18 19 20 21\r\n" + 
				"22 23 24 25 26 27 28");		
	}

//public static char[7][5] Calinder (int month ) {}

