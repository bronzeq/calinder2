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

	public int  GetMaxDay(int year, int month,int WeekDay) {
		if(isLeepYear(year)){return LEEP_MAX_DAYS[month-1];}
		else
			return MAX_DAYS[month-1];
		
	}
	
	public void PrintCalinder(int year, int month, int WeekDay)
	{
		 System.out.printf("      <<%4d년 %3d월>> \n",year, month);
		System.out.println(	" SU   MO   TU   WE    TH   FR   SA"); 
		System.out.println("------------------------------------" );
		//print blink
		for(int i=0;i<WeekDay;i++) {
			System.out.print("     ");		
		}
		int Maxday= GetMaxDay(year,month,WeekDay);
		int count =7-WeekDay;
		int delim=(count<7)?count:0;
		//F_LINE
		for(int i=1;i<=count;i++) {
			System.out.printf("%3d  ",i);	
		}
		System.out.println();
		//print 2~L_LINE
		for(int i=count+1;i<=Maxday;i++) {
		System.out.printf("%3d  ",i);	
		
		if (i%7==delim) System.out.println();
		
		}System.out.println();
		System.out.println();
		
	}
		


}
