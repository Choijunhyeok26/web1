
public class AccountingIFApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double expenseRate = 0.3;
		double VAT = 0.1;
		double vat = valueOfSupply*VAT;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;


		System.out.println("Value of supply :"+valueOfSupply);
		System.out.println("VAT :"+ vat );
		System.out.println("Total :"+ total );
		System.out.println("Expense :"+ expense );
		System.out.println("Income :"+ income );
		System.out.println("Dividend :"+ dividend1);
		System.out.println("Dividend :"+ dividend2);
		System.out.println("Dividend :"+ dividend3);




	}

}
