/**
 * 
 */
package com.glenvasa.manager_trainee;

/**
 * @author glenv
 *
 */
public class InheritanceActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		m.calculateSalary();
		m.calculateTransportAllowance();

		Trainee t = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		t.calculateSalary();
		t.calculateTransportAllowance();
	}

}
