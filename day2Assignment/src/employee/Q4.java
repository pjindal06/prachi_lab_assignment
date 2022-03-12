package employee;

public class Q4 {
	public static void main(String[] args) {
		empl employee=new CommissionEmployee(121, "amit", 2.1, 2000000);
		System.out.println(employee.getPayment());
	}
}
