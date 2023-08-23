import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;


class EmployeeTest {
	
private float rmu= (float) 386.0f;
	
	
	//TESTS CALCULAR SALARIO
	/*
	1.Se espera que cuando el currency es 'USD' en un mes par, el salario de un empleado será el mismo que recibe como parametro. Se usa worker por facilidad.
	*/
	
	@Test
	public void testCSCurrency() {
		Employee tmpEmployee = new Employee(150f, "USD", 12.2f, EmployeeType.Worker);
		float salary = tmpEmployee.cs();
		assertEquals(150f, salary);
		
	}
	/*
	2.Se espera que cuando el currency es distinto de 'USD' en un mes par, el salario de WORKER será reducido un cierto porcentaje (5%)
	Con esto podemos dar por verificado que independientemente del empleado el salario se reduce un porcentaje.(5%)
	*/
	
	@Test
	public void testCSDiferentCurrency() {
		Employee tmpEmployee = new Employee(150f, "Bs", 12.2f, EmployeeType.Worker);
		float salary = tmpEmployee.cs();
		assertEquals(150f * 0.95f, salary);
		
	}
	/*
	3.Se espera que cuando el currency es 'USD' en un mes par, el salario de WORKER será el mismo que recibe como parametro.
	*/
	
	@Test
	public void calcularSalaryWorker(){
		Employee e= new Employee(150f,"USD", 12.2f,EmployeeType.Worker);
		float result= e.cs();
		assertEquals(150f, result);

	}
	/*
	4.Se espera que cuando el currency es 'USD' en un mes par, el salario de SUPERVISOR será el mismo que recibe como parametro más ciertas modificaciones. 
	*/
	@Test
	public void calcularSalarySupervisor(){
		Employee e= new Employee(150f,"USD", 12.2f,EmployeeType.Supervisor);
		float result= e.cs();
		float salarioEsperado = 150f + (12.2f * 0.35F);
		
		assertEquals(salarioEsperado, result);
	}
	/*
	5.Se espera que cuando el currency es 'USD' en un mes par, el salario de MANAGER será el mismo que recibe como parametro más ciertas modificaciones. 
	*/
	@Test
	public void calcularSalarySManager(){
		Employee e= new Employee(150f,"USD", 12.2f,EmployeeType.Manager);
		float result= e.cs();
		float salarioEsperado = 150f + (12.2f * 0.7F);
		
		assertEquals(salarioEsperado, result);
	}
	
	
	
	//Test para los metodos calcular YearBonus

	/*
	6.Se valida el caso donde el currency es  'USD' y el tipo de empleado es 'Worker'
	el resultado esperado es que su bono sea igual que el rmu
	*/
	@Test
	public void calcularBonusWorker(){
		Employee e1= new Employee(150.5f,"USD", 12.2f,EmployeeType.Worker);
		float result= e1.CalculateYearBonus();
		assertEquals(rmu, result);

	}
	/*
	7.Se valida el caso donde el currency es  'USD' y el tipo de empleado es 'Supervisor'
	el resultado esperado es que su bono sea igual que su salario+rmu*porcentaje
	*/
	@Test
	public void calcularBonusSupervisor(){
		Employee e2= new Employee(150.0f, "USD", 12.2f, EmployeeType.Supervisor);
		float resultBonus=(float)e2.CalculateYearBonus();
		float resultSalary=150.0f;
		assertEquals(resultSalary + rmu * 0.5f, resultBonus);
		
	}
	/*
	8.Se valida el caso donde el currency es  'USD' y el tipo de empleado es 'Manager'
	el resultado esperado es que su bono sea igual que su salario+rmu*porcentaje
	*/
	@Test
	public void calcularBonusManager(){
		Employee e3= new Employee(150.0f, "USD", 12.2f, EmployeeType.Manager);
		float resultBonus= (float)e3.CalculateYearBonus();
		float resultSalary=150.0f;
		assertEquals(resultSalary+rmu*1.0f,resultBonus);

	}
	/*
	9.Se valida el caso donde el currency es  distinto de 'USD' , el tipo de empleado debe ser o manager o supervisor.
	el resultado esperado es que el bonus con un currency diferente a USD sea menor porque el salario  se reduce un 5%.
	*/
	@Test
	public void calcularBonusDiferentCurrency(){
		Employee eBs= new Employee(150.0f, "Bs", 12.2f, EmployeeType.Supervisor);
		Employee e4= new Employee(150.0f,"USD",12.2f,EmployeeType.Supervisor);
		
		float bonusUSD= e4.CalculateYearBonus();
		float bonusBS= eBs.CalculateYearBonus();
		boolean condicion= bonusUSD>bonusBS;
		assertEquals(true, condicion);
		
	}
	
}
