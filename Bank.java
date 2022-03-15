import java.util.*;
public class Bank {
	int interest=10,repayDuration=20;
	
	void personalLoan() {
		interest=12;
		repayDuration=20;
		System.out.println("interest is= "+interest+"% ");
		System.out.println("Duration is= "+repayDuration);
	}
	void housingLoan() {
		interest=15;
		repayDuration=30;
		System.out.println("interest is= "+interest+"% ");
		System.out.println("Duration is= "+repayDuration);
	}
	void eduLoan() {
		interest=7;
		repayDuration=36;
		System.out.println("interest is= "+interest+"% ");
		System.out.println("Duration is= "+repayDuration);
	}
	void goldLoan(int grams) {
		interest =3;
		if(grams<100)
			repayDuration=24;
		else {
			repayDuration=48;
			interest=4;
		}
		System.out.println("interest is= "+interest+"% ");
		System.out.println("Duration is= "+repayDuration);
		
	}
	
}
