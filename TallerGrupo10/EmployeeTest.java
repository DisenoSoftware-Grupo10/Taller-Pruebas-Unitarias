
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import org.junit.jupiter.api.Test;


class EmployeeTest {
	private float rmu=(float)386.0;

	@Test
	void test() {
		fail("Not yet implemented");
	}






	



	@Test
	public void testCSCurrency() {
		Employee tmpEmployee = new Employee(500.0, "papas", 4, Worker);
		float salary = tmpEmployee.cs();
		assertEquals(0.0, salary);
		
	}







	@Test
	public void testCSNoEmployee() {
		Employee tmpEmployee = new Employee(1.1, "$USD", 15, Person);
		float salary = tmpEmployee.cs();
		assertEquals(0.0, salary);
	}








	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Tests Daniel
	//
	@Test
	public void calcularBonusWorker(){
		Employee e1= new Employee(150.5f,"USD", 12.2f,EmployeeType.Worker);
		float result= e1.CalculateYearBonus();
		assertEquals(rmu, result);

	}
	@Test
	public void calcularBonusSupervisor(){
		Employee e2= new Employee(150.0f, "USD", 12.2f, EmployeeType.Supervisor);
		float resultBonus=(float)e2.CalculateYearBonus();
		float resultSalary=(float)e2.cs();
		assertEquals(resultSalary+rmu*0.5f, resultBonus);
		
	}

	@Test
	public void calcularBonusManager(){
		Employee e3= new Employee(150.0f, "USD", 12.2f, EmployeeType.Manager);
		float resultBonus= (float)e3.CalculateYearBonus();
		float resultSalary=(float)e3.cs();
		assertEquals(resultSalary+rmu*1.0f,resultBonus);

	}
}





































