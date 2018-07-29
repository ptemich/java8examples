/**
 * 
 */
package pl.ptemich.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Przemek
 *
 */
public class EmployeComposite implements ComponentEmploye {

	private List<ComponentEmploye> managerEmployes = new ArrayList<>();
	
	public void add(ComponentEmploye employe) {
		managerEmployes.add(employe);
	}
	
	@Override
	public void payBonus() {
		managerEmployes.stream().forEach(employee -> employee.payBonus());
	}
	
}
