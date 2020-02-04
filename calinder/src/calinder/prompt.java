package calinder;

import java.util.Scanner;

public class prompt {
	
	public void PrintMenu()
	{
	System.out.println("+----------------------+");	
	System.out.println("| 1. 일정 등록 ");	          
	System.out.println("| 2. 일정 검색    ");	       
	System.out.println("| 3. 달력 보기");	
	System.out.println("| h. 도움말");	
	System.out.println("| q. 종료");	
	System.out.println("+----------------------+");
	System.out.println("명령 (1, 2, 3, h, q)");
	}
	
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
	
	@SuppressWarnings("resource")
	
//	+----------------------+
//	| 1. 일정 등록           
//	| 2. 일정 검색           
//	| 3. 달력 보기
//	| h. 도움말 
 //|q. 종료
//	+----------------------+
//	명령 (1, 2, 3, h, q)
	public void runPROMPT() 
	{		
		PrintMenu();
		
		Scanner scanner=new Scanner(System.in);
		calinder cal=new calinder();
		
		while(true) {
			
			String cmd=scanner.next();
			if(cmd.equals("1"))cmdRegster();
			else if(cmd.equals("2")) cmdSearch();
			else if(cmd.equals("3")) cmdCal(scanner, cal);
			else if(cmd.equals("h"))PrintMenu();
			else if(cmd.equals("q")) break;
			
			
		
			}
		System.out.println("bye");
		
	}
	
	private void cmdCal(Scanner s,calinder c) {
		int month=1;
		int year=2000;
		
		System.out.println("년 입력");
		System.out.print("year>");
		year=s.nextInt();
	
		System.out.println("달 입력");
		System.out.print("month>");
		month=s.nextInt();
		if(month>12||month<1) return;			
		c.PrintCalinder(year, month);
		
	}

	private void cmdSearch() {
		// TODO Auto-generated method stub
		
	}

	private void cmdRegster() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[]args)
	{
		prompt p=new prompt();
		p.runPROMPT();
	}
}