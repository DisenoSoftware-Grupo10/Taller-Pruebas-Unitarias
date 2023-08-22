import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;


class EmployeeTest {
	
private float rmu= (float) 386.0f;
	
	
	//MÉTODO CALCULAR SALARIO
	
	@Test
	public void testCSCurrency() {
		Employee tmpEmployee = new Employee(150f, "USD", 12.2f, EmployeeType.Worker);
		float salary = tmpEmployee.cs();
		assertEquals(150f, salary);
		
	}
	
	@Test
	public void testCSDiferentCurrency() {
		Employee tmpEmployee = new Employee(150f, "Bs", 12.2f, EmployeeType.Worker);
		float salary = tmpEmployee.cs();
		assertEquals(150f * 0.95f, salary);
		
	}
	
	@Test
	public void calcularSalaryWorker(){
		Employee e= new Employee(150f,"USD", 12.2f,EmployeeType.Worker);
		float result= e.cs();
		assertEquals(150f, result);

	}
	
	@Test
	public void calcularSalarySupervisor(){
		Employee e= new Employee(150f,"USD", 12.2f,EmployeeType.Supervisor);
		float result= e.cs();
		float salarioEsperado = 150f + (12.2f * 0.35F);
		
		assertEquals(salarioEsperado, result);
	}

	@Test
	public void calcularSalarySManager(){
		Employee e= new Employee(150f,"USD", 12.2f,EmployeeType.Manager);
		float result= e.cs();
		float salarioEsperado = 150f + (12.2f * 0.7F);
		
		assertEquals(salarioEsperado, result);
	}
	
	@Test
	public void calcularSalaryDecimoWorker(){
		Employee e= new Employee(150f,"USD", 12.2f,EmployeeType.Worker);
		float result= e.cs();
		assertEquals(150f, result);// angel puso 214.33f
	}
	
	@Test
	public void calcularSalaryDecimoSupervisor(){
		Employee e= new Employee(150f,"USD", 12.2f,EmployeeType.Supervisor);
		float result= e.cs();
		float salarioEsperado = 150f + (12.2f * 0.35F);
		
		assertEquals(salarioEsperado, result);
	}

	@Test
	public void calcularSalaryDecimoSManager(){
		Employee e= new Employee(150f,"USD", 12.2f,EmployeeType.Manager);
		float result= e.cs();
		float salarioEsperado = 150f + (12.2f * 0.7F);
		
		assertEquals(salarioEsperado, result);
	}
	
	
	//MÉTODO CALCULAR BONUS
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
		float resultSalary=150.0f;
		assertEquals(resultSalary + rmu * 0.5f, resultBonus);
		
	}

	@Test
	public void calcularBonusManager(){
		Employee e3= new Employee(150.0f, "USD", 12.2f, EmployeeType.Manager);
		float resultBonus= (float)e3.CalculateYearBonus();
		float resultSalary=150.0f;
		assertEquals(resultSalary+rmu*1.0f,resultBonus);

	}
	
	@Test
	public void calcularBonusCurrency(){
		Employee eUSD= new Employee(150.0f, "USD", 12.2f, EmployeeType.Supervisor);
                float salary = 150.0f;
                float salaryExpected = eUSD.CalculateYearBonus();
                assertEquals(salary + rmu * 0.5F, salaryExpected);
                
		
	}

	@Test
	public void calcularBonusDiferentCurrency(){
		Employee eBs= new Employee(150.0f, "Bs", 12.2f, EmployeeType.Supervisor);
                float salary = 150.0f * 0.95f;
                float salaryExpected = eBs.CalculateYearBonus();
                assertEquals(salary + rmu * 0.5F, salaryExpected);
		
	}
	
}
