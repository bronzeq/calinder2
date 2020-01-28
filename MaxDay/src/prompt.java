import java.util.Scanner;

public class prompt {

	private final static String PROMPT= "cal> ";
	
	public void RunPrompt() {
		MaxDay day=new MaxDay();	
		
		Scanner scanner=new Scanner(System.in);
		day.GetMonthOfMaxDays(scanner);
		System.out.println("반복 횟수:");
		System.out.print(PROMPT);
		
		
		int month = 1;
		
	while( true) {
			System.out.println("월 입력");
			System.out.print(PROMPT);
		 month=scanner.nextInt();	
		if (month==-1) {break;}
		if(month>12) {continue;}
		System.out.printf("%d요일의 최대 날은 %d이다.\n",month,day.GetMonthOfMaxDays(month));
	//	day.samplecalendar();
			
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		scanner.close();
		
	}
	
	public static void main(String[] args) 
	{
		//calinder cal=new.calinder();
		
		prompt p=new prompt();
		p.RunPrompt();

	}

}
