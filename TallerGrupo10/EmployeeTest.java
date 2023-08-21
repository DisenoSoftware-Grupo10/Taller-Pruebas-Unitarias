
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import org.junit.jupiter.api.Test;


class EmployeeTest {

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
}









































