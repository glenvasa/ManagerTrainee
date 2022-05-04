/**
 * 
 */
package com.glenvasa.manager_trainee;

/**
 * @author glenv
 *
 */
public class Manager extends Employee {

	Manager(long id, String name, String address, long phone) {
		super(id, name, address, phone);
	}

	Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.basicSalary = salary;
	}

	@Override
	public void calculateTransportAllowance() {
		double transportAllowance = .15 * basicSalary;
		System.out.printf("The transportAllowance is: $%.2f\n", transportAllowance);
	}

}
