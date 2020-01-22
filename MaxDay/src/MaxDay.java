import java.util.Scanner;

public class MaxDay {

	public static void main(String[] args) {
		int munth,day;
		String m;
		
		System.out.println("월 입력");
		Scanner scanner=new Scanner(System.in);
		m=scanner.next();
		munth=Integer.parseInt(m);
		if(munth<8 )
		{
			if(munth%2==1) day=31;
			else if(munth==2) day=28;
			else day=30;
		}
		else {
			if(munth%2==1) day=30;
			else day=31;			
		}
		System.out.printf("%d요일의 최대 날은 %d이다.",munth,day );
		
		scanner.close();
		
	}
	

}
