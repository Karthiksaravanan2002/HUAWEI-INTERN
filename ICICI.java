import java.util.*;

public class ICICI extends Bank{
	ICICI(){
		super.interest=15;
	}
	void personalLoan(){
		interest=13;
		repayDuration=20;
		System.out.println("interest is= "+interest+"% ");
		System.out.println("Duration is= "+repayDuration);
	}
	void housingLoan(){
		interest=10;
		repayDuration=30;
		System.out.println("interest is= "+interest+"% ");
		System.out.println("Duration is= "+repayDuration);
	}
	public static void main(String[] args) {
		ICICI c1=new ICICI();
		c1.eduLoan();
	}

}
