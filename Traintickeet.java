package TickitbookigforTrain;
import java.util.*;
class requst_ticket
{
	int total_set=10;
	synchronized public void bus_record(int seats)
	{
		if(total_set>=seats)
		{
			System.out.println("Congratulation!!..your boocking is confirm.");
			total_set=total_set-seats;
			System.out.println("seats left"+total_set);
		}
		else
		{
			System.out.println("Sorry!!..your Tickets not confirm");
		
			System.out.println("seats left:"+total_set);
		}
	}
}

public class Traintickeet extends Thread
{
	static requst_ticket ob1;
	int seats;
	public void run()
	{
		ob1.bus_record(seats);

	}


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ob1=new requst_ticket();
		Traintickeet p1=new Traintickeet();
		Traintickeet p2=new Traintickeet();
		Traintickeet p3=new Traintickeet();
		
		System.out.println("Enter the number of tickets:");
		p1.seats=sc.nextInt();
		
		System.out.println("Enter the number of tickets:");
		p2.seats=sc.nextInt();
		
		System.out.println("Enter the number of tickets:");
		p3.seats=sc.nextInt();
		
		
		p1.start();
		p2.start();
		p3.start();
	
		
	}

}