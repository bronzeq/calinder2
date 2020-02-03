package calinder;

//import java.util.Scanner;

public class calinder {
	
	private static  final int[] MAX_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
	private static  final int[] LEEP_MAX_DAYS= {31,29,31,30,31,30,31,31,30,31,30,31};
	public boolean isLeepYear(int year) {
		if(year%4==0&&(year%100 !=0||year%400==0))
			return true;
		else return false;
	}

	public int  GetMaxDay(int year, int month) {
		if(isLeepYear(year)){return LEEP_MAX_DAYS[month-1];}
		else
			return MAX_DAYS[month-1];
		
	}
	
	public void PrintCalinder(int year, int month)
	{
		 System.out.printf("      <<%4d년 %3d월>> \n",year, month);
		System.out.println(	"SU  MO  TU  WE   TH  FR  SA"); 
		System.out.println("----------------------------------" );
		int Maxday= GetMaxDay(year,month);
		for(int i=1;i<=Maxday;i++) {
		System.out.printf("%2d  ",i);	
		if (i%7==0) System.out.println();
		
		}System.out.println();
		
	}
		


}
