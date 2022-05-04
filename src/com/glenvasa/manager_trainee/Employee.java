/**
 * 
 */
package com.glenvasa.manager_trainee;

/**
 * @author glenv
 *
 */
public class Employee {

	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	protected double basicSalary;
	private double specialAllowance = 250.80;
	private double hra = 1000.50;

	public Employee(long id, String name, String address, long phone) {
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;

	}

	public void calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.printf("The salary is: $%.2f\n", salary);
	}

	public void calculateTransportAllowance() {
		double transportAllowance = .1 * basicSalary;
		System.out.printf("The transportAllowance is: $%.2f\n", transportAllowance);
	}

}
