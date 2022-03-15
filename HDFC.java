import java.util.*;
import java.lang.*;
public class HDFC extends ICICI {
	void personalLoan() {
		interest=13;
		repayDuration=20;
		System.out.println("interest is= "+interest+"% ");
		System.out.println("Duration is= "+repayDuration);
	}
	void housingLoan() {
		interest=10;
		repayDuration=30;
		System.out.println("interest is= "+interest+"% ");
		System.out.println("Duration is= "+repayDuration);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the Bank 1.ICICI 2.HDFC");
		System.out.println("Enter your choice 1 or 2");
		int n=sc.nextInt();
		ICICI h1;
		if(n==1) {
			h1=new ICICI();
		}
		else {
			h1=new HDFC();
		}
		System.out.println("Type of Loan 1.personal 2.housing 3.eduloan 4.golgLoan");
		System.out.println("Enter your choice 1 or 2 or 3 or 4");
		int loan=sc.nextInt();
		int gram=0;
		if(loan==4) {
			System.out.println("Enter no.of Grams");
			gram=sc.nextInt();
		}
		
		switch(loan) {
		case 1:
			h1.personalLoan();
			break;
		case 2:
			h1.housingLoan();
			break;
		case 3:
			h1.eduLoan();
			break;
		case 4:
			h1.goldLoan(gram);
			break;
		default:
			System.out.println("Invalid Choice");
		
	}
	}
		

}
