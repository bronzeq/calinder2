package calinder;

import java.util.Scanner;

public class prompt {
	
	
	/**
	 * 
	 * @param week=weekday
	 * @return 0~6(0=SunDAy 6=SaturDAy)
	 */
	public int ParseDay (String week) {
		if (week.equals( "su"))return 0;
		else if(week.equals( "mo"))return 1;
		else if(week.equals( "tu"))return 2;
		else if(week.equals( "we"))return 3;
		else if(week.equals( "th"))return 4;
		else if(week.equals( "fr"))return 5;
		else if(week.equals( "sa"))return 6;
		else return 0;
		
		
	}
	
	//private final static String PROMPT="cal>";
	
	public void runPROMPT() 
	{
		Scanner scanner=new Scanner(System.in);
		calinder cal=new calinder();
		int month=1;
		int year=2000;
		
		while(true) {
			System.out.println("년 입력(exit==-1)");
			System.out.print("year>");
			year=scanner.nextInt();
			if(year==-1)break;
			
			System.out.println("달 입력");
			System.out.print("month>");
			month=scanner.nextInt();
			/*
			System.out.println("첫째 날의 요일을 입력하시오(SU  MO  TU  WE   TH  FR  SA)");
			System.out.print("WeekDay>");
			String str_WeekDay=scanner.next();			
			WeekDay= ParseDay(str_WeekDay);
		*/
			if(month==-1)  break;
			if(month>12)continue;			
			cal.PrintCalinder(year, month);
			}
		System.out.println("bye");
		
	}
	
	public static void main(String[]args)
	{
		prompt p=new prompt();
		p.runPROMPT();
	}
}