package c;

import java.io.Serializable;
public class employee implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private address address;
	transient private double salary;

	public employee(int id, String name, address address, int salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}


