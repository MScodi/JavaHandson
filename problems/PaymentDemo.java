package problems;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
public class PaymentDemo {

	public static void main(String[] args) {
		int value=0;
		List<Payment> payment=new ArrayList<Payment>();
		payment.add(new Payment(1234,"NEFT",12000,"Confirmed"));
		payment.add(new Payment(1223,"Cash",14530,"Confirmed"));
		payment.add(new Payment(1433,"DD",12423,"Failed"));
		payment.add(new Payment(1214,"NEFT",11321,"Failed"));
		payment.add(new Payment(1542,"Cheaque",11444,"Confirmed"));
	
	System.out.println(payment);
	System.out.println("To display these details in a sorted order press \n 1 by Id \n 2 by Payment type \n 3 by Amount \n 4 Status");
	try (Scanner sc = new Scanner(System.in)) {
		value=sc.nextInt();
	}
	catch(Exception e)
	{
		System.out.println("Only numbers");
	System.exit(0);
	}
switch (value) {
case 1:
	Collections.sort(payment, new Comparator<Payment>() {

		@Override
		public int compare(Payment o1, Payment o2) {
			if(o1.getPaymentID() > o2.getPaymentID())
			return 1;
			else
				return -1;
			
		}
	});
	System.out.println(payment);
	break;
case 2:
	Collections.sort(payment, new Comparator<Payment>() {

		@Override
		public int compare(Payment o1, Payment o2) {
			if(o1.getPaymentType().compareTo(o2.getPaymentType())>0 )
			return 1;
			else
				return -1;
			
		}
	});
	System.out.println(payment);
	break;
case 3:
	Collections.sort(payment, new Comparator<Payment>() {

		@Override
		public int compare(Payment o1, Payment o2) {
			if(o1.getAmount() > o2.getAmount())
			return 1;
			else
				return -1;
			
		}
	});
	System.out.println(payment);
	break;
case 4:
	Collections.sort(payment, new Comparator<Payment>() {

		@Override
		public int compare(Payment o1, Payment o2) {
			if(o1.getStatus().compareTo(o2.getStatus())>0 )
			return 1;
			else
				return -1;
			
		}
	});
	System.out.println(payment);
	break;
default:
	System.out.println("Invalid");
	break;
}
	
}
}