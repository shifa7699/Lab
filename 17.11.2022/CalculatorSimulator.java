package exception;
class TaxCalculator  
{
	String empName;
	double empSal;
	boolean isIndian;
	double taxAmount=0.0;
	public double CalculateTax(String empName,double empSal,boolean isIndian) 
	{
		this.empName=empName;
		this.empSal=empSal;
		this.isIndian=isIndian;
		return taxAmount;
	}
}
class CountryNotValidException extends Exception {  //custom exception 1
	public CountryNotValidException(String s) throws CountryNotValidException
	{
		throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
	}
}
	class EmployeeNameInvalidException extends Exception { //custom exception 2
		public EmployeeNameInvalidException(String s)  throws EmployeeNameInvalidException
		{
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
	}
}
		class TaxNotEligibleException extends Exception { //custom exception 3
			public TaxNotEligibleException(String s) {
			}
			public void check(double empSal) throws TaxNotEligibleException
			{
				double taxAmount=0.0;
				boolean isIndian = false;
				if(empSal>100000 &&  isIndian== true) {
					taxAmount =empSal *8/100 ;
				}
				else if((empSal> 50000 && empSal<100000) && isIndian== true) {
					taxAmount =empSal *6/100 ;
				}
				else if ((empSal> 30000 && empSal<50000) &&  isIndian== true) {
					taxAmount =empSal *5/100 ;
				}
				else if((empSal> 10000 && empSal<30000) &&  isIndian== true) {
					taxAmount =empSal *4/100 ;
				} else {
					throw new TaxNotEligibleException("The employee does not need to pay tax");
				}}
		}
	
public class CalculatorSimulator {
	public static void main(String[] args) throws Exception
	{
		double taxAmount = 0.0;
		TaxCalculator tc=new TaxCalculator();
		CalculatorSimulator cs=new  CalculatorSimulator();
		tc.CalculateTax("Ron",34000.0d,false);
		System.out.println("Tax Amount is: "+taxAmount);
		tc.CalculateTax("Tim", 1000, true);
		System.out.println("Tax Amount is: "+taxAmount);
		tc.CalculateTax("Jack", 55000, true);
		tc.CalculateTax(" ", 30000, true);		
	}
}
	

