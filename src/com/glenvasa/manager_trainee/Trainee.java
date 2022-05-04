/**
 * 
 */
package com.glenvasa.manager_trainee;

/**
 * @author glenv
 *
 */
public class Trainee extends Employee {

	Trainee(long id, String name, String address, long phone) {
		super(id, name, address, phone);

	}

	Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.basicSalary = salary;
	}

	/**
	 * 
	 */

}
