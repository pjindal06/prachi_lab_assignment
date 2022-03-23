package d;

public class CommisionEmployee extends emp{
	private double commisionPercentage;
	private double totalSales;

	public CommisionEmployee(int id, String name, double commisionPercentage, double totalSales) {
		super(id, name);
		this.commisionPercentage = commisionPercentage;
		this.totalSales = totalSales;
	}

	@Override
	public double getPayment() {
		return totalSales * commisionPercentage / 100;
	} 

}
