import java.util.Date;
public class Loan {

	
	

		private double annualInterestRate;
		private int numberOfYear;
		private double loanAmount;
		private Date loanDate;
		
		
		
		public Loan() {
			
		}
		public Loan(double annualInterestRate,double loanAmount,int numberOfYear, Date loanDate ) {
			this.annualInterestRate=annualInterestRate;
			this.loanAmount=loanAmount;
			this.numberOfYear=numberOfYear;
			this.loanDate=loanDate;
			
		}
		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate=annualInterestRate;
		}
		public void setNumberOfYear(int numberOfYear) {
			this.numberOfYear=numberOfYear;
		}
		public void setLoanAmount(double loanAmount) {
			this.loanAmount=loanAmount;
			
		}
		public void setLoanDate(Date loanDate) {
			this.loanDate=loanDate;
		}
		
		
		
		public double getAnnualInterestRate()
		{
			return annualInterestRate;
			
		}
		public int getNumberOfYear()
		{
			return numberOfYear;
		}
		public double getLoanAmount() {
			return loanAmount;
		}
		public double getMonthlyPayment()
		{
			return (annualInterestRate/numberOfYear)*loanAmount;
		}
		public double getTotalPayment()
		{
			return annualInterestRate*loanAmount;
		}
}
