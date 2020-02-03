package calinder;

import java.util.Scanner;

public class prompt {
	private final static String PROMPT="cal>";
	
	public void runPROMPT() 
	{
		Scanner scanner=new Scanner(System.in);
		calinder cal=new calinder();
		int month=1;
		int year=2000;
		while(true) {
			System.out.println("년 입력");
			System.out.print("year>");
			year=scanner.nextInt();
			System.out.println("달 입력");
			System.out.print("month>");
			month=scanner.nextInt();
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
