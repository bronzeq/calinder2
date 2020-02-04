package calinder;

public class calinder {
	
	private static  final int[] MAX_DAYS= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	private static  final int[] LEEP_MAX_DAYS= {0,31,29,31,30,31,30,31,31,30,31,30,31};
	public boolean isLeepYear(int year) {
		if(year%4==0&&(year%100 !=0||year%400==0))
			return true;
		else return false;
	}

	public int  GetMaxDay(int year, int month) {
		if(isLeepYear(year)){return LEEP_MAX_DAYS[month];}
		else 	return MAX_DAYS[month];		
	}
	
	
	public void PrintCalinder(int year, int month)
	{
		 System.out.printf("      <<%d년 %d월>> \n",year, month);
		System.out.println(	" SU   MO   TU   WE    TH   FR   SA"); 
		System.out.println("--------------------------------------------" );
		
		//get WeekDay automatically
		int WeekDay=GetWeekDay(year,month,1);
		
		//print blink		
		for(int i=0;i<WeekDay;i++) {
			System.out.print("     ");		
		}
		int Maxday= GetMaxDay(year,month);
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

	private int GetWeekDay(int year, int month, int day) {
		int syear=1970;
		
		int standard_WeekDay=4;//1970_Jenuwarry_1st=Therthday
		
		int count=0;
		
		for(int i=syear;i<year;i++) {
		int delta=(isLeepYear(i))? 366:365;
		count+=delta;
		}
		
		for(int i=1;i<month;i++) {
			int  delta= GetMaxDay(year, i);
			count +=delta;
		}
		count +=day-1;
		
		int weekday=(count+standard_WeekDay)%7;
		return weekday;
	}
	/*
	public static void main(String[]args) throws ParseException  {
		calinder cal=new calinder();
		System.out.println(cal.GetWeekDay(1970, 1, 1)==4);
		System.out.println(cal.GetWeekDay(1971, 1, 1)==5);
		System.out.println(cal.GetWeekDay(1972, 1, 1)==6);
		System.out.println(cal.GetWeekDay(1973, 1, 1)==1);
		System.out.println(cal.GetWeekDay(1974, 1, 2)==3);		
	}
*/
}