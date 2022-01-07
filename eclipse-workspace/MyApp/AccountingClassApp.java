//class Accounting1{
//	
//	public  double valueOfSupply;
//	public  double vatRate;
//	public  double expenseRate;
//
//	public  void print() {
//		System.out.println("Value of supply :"+valueOfSupply);
//		System.out.println("VAT :"+ getVAT() );
//		System.out.println("Total :"+ getTotal() );
//		System.out.println("Expense :"+ getExpense() );
//		System.out.println("Income :"+ getIncome() );
//		System.out.println("Dividend :"+ getDividend1());
//		System.out.println("Dividend :"+ getDividend2());
//		System.out.println("Dividend :"+ getDividend3());
//	}
//
//
//
//	public  double getVAT() {
//		double vat = getVAT(valueOfSupply, vatRate);
//		return vat;
//	}
//
//	
//
//	public  double getDividend1() {
//		double dividend1 = getIncome()*0.5;
//		return dividend1;
//	}
//	
//	public  double getDividend3() {
//		double dividend3 = getIncome()*0.2;
//		return dividend3;
//	}
//
//	public  double getDividend2() {
//		double dividend2 = getIncome()*0.3;
//		return dividend2;
//	}
//	
//	public  double getIncome() {
//		double income = valueOfSupply - getExpense();
//		return income;
//	}
//
//	public  double getExpense() {
//		double expense = valueOfSupply*expenseRate;
//		return expense;
//	}
//
//	public  double getTotal() {
//		double total = valueOfSupply + getVAT();
//		return total;
//	}
//
//	public  double getVAT(double valueOfSupply, double vatRate) {
//		return valueOfSupply*vatRate;
//	}
//
//}
//
//
//class Accounting2{
//	
//	public  double valueOfSupply;
//	public  double vatRate;
//	public  double expenseRate;
//
//	public  void print() {
//		System.out.println("Value of supply :"+valueOfSupply);
//		System.out.println("VAT :"+ getVAT() );
//		System.out.println("Total :"+ getTotal() );
//		System.out.println("Expense :"+ getExpense() );
//		System.out.println("Income :"+ getIncome() );
//		System.out.println("Dividend :"+ getDividend1());
//		System.out.println("Dividend :"+ getDividend2());
//		System.out.println("Dividend :"+ getDividend3());
//	}
//
//
//
//	public  double getVAT() {
//		double vat = getVAT(valueOfSupply, vatRate);
//		return vat;
//	}
//
//	
//
//	public  double getDividend1() {
//		double dividend1 = getIncome()*0.5;
//		return dividend1;
//	}
//	
//	public  double getDividend3() {
//		double dividend3 = getIncome()*0.2;
//		return dividend3;
//	}
//
//	public  double getDividend2() {
//		double dividend2 = getIncome()*0.3;
//		return dividend2;
//	}
//	
//	public  double getIncome() {
//		double income = valueOfSupply - getExpense();
//		return income;
//	}
//
//	public  double getExpense() {
//		double expense = valueOfSupply*expenseRate;
//		return expense;
//	}
//
//	public  double getTotal() {
//		double total = valueOfSupply + getVAT();
//		return total;
//	}
//
//	public  double getVAT(double valueOfSupply, double vatRate) {
//		return valueOfSupply*vatRate;
//	}
//
//}


class Accounting{
	
	public  double valueOfSupply;
	public  double vatRate;
	public  double expenseRate;

	public  void print() {
		System.out.println("Value of supply :"+valueOfSupply);
		System.out.println("VAT :"+ getVAT() );
		System.out.println("Total :"+ getTotal() );
		System.out.println("Expense :"+ getExpense() );
		System.out.println("Income :"+ getIncome() );
		System.out.println("Dividend :"+ getDividend1());
		System.out.println("Dividend :"+ getDividend2());
		System.out.println("Dividend :"+ getDividend3());
	}



	public  double getVAT() {
		double vat = getVAT(valueOfSupply, vatRate);
		return vat;
	}

	

	public  double getDividend1() {
		double dividend1 = getIncome()*0.5;
		return dividend1;
	}
	
	public  double getDividend3() {
		double dividend3 = getIncome()*0.2;
		return dividend3;
	}

	public  double getDividend2() {
		double dividend2 = getIncome()*0.3;
		return dividend2;
	}
	
	public  double getIncome() {
		double income = valueOfSupply - getExpense();
		return income;
	}

	public  double getExpense() {
		double expense = valueOfSupply*expenseRate;
		return expense;
	}

	public  double getTotal() {
		double total = valueOfSupply + getVAT();
		return total;
	}

	public  double getVAT(double valueOfSupply, double vatRate) {
		return valueOfSupply*vatRate;
	}

}
public class AccountingClassApp {

	public  static void main(String[] args) {
//
//		Accounting1.valueOfSupply = 20000.0;
//		Accounting1.vatRate = 0.05;
//		Accounting1.expenseRate = 0.2;
//		Accounting1.print();
//	
//		
//		Accounting2.valueOfSupply = 10000.0;
//		Accounting2.vatRate = 0.1;
//		Accounting2.expenseRate = 0.3;
//		Accounting2.print();
//		
//		Accounting1.print();
		
		
		
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.05;
	    a1.expenseRate = 0.2;
        a1.print();
        
        Accounting a2 = new Accounting();
		a2.valueOfSupply = 10000.0;
		a2.vatRate = 0.05;
	    a2.expenseRate = 0.2;
        a2.print();
	}
}
