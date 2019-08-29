package week1;
import java.util.Scanner;

public class Welcome {
	public static void main(String [] args) {	
		String great = "welcome";
	System.out.println(great);
 Scanner input = new Scanner(System.in);
 
 System.out.println ("what is your name? I'm a program");
 String name=input.nextLine();
 System.out.println("Nice to meet you,"+name+" !");
		
	}

}
