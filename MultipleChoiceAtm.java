package AtmsychThread;
import java.util.*;
public class MultipleChoiceAtm {

	public static void main(String[] args)
	{
	int Balance=100000;
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("Choose 1 for Withdrow");
		System.out.println("Choose 2 for Deposit");
		System.out.println("Choose 3 for Check Balance");
		System.out.println("Choose 4 for Exit");
		System.out.println("Choose the operation do you want to perform");	
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the Amount to be withdrow:");
			int withdrow=sc.nextInt();
			if(Balance>=withdrow)
			{
			
				Balance=Balance-withdrow;
				System.out.println("Plases Collect your Money:");
			}
			else
			{
				System.out.println("insufficient Balance");
			}
			System.out.println("");
			break;
		case 2:
			System.out.println("Enter the Amount to be Deposited");
			int deposited=sc.nextInt();
			Balance=Balance+deposited;
			System.out.println("");
			break;
		case 3:
			System.out.println("Balance"+Balance);
			System.out.println("");
			break;
		case 4:
			System.exit(0);
		}
	}
	}

}
