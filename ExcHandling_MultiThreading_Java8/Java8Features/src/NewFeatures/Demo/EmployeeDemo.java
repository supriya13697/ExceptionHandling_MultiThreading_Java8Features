package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(1001,"supriya","senior software",5.6));
		list.add(new Employee(1002,"priya","software",3.6));
		list.add(new Employee(1003,"harsha","associate consultant",8.6));
		list.add(new Employee(1004,"sri","senior consultant",10.6));
		list.add(new Employee(1005,"lakxmi","consultant",7.6));
		list.add(new Employee(1006,"chinnu","senior software",4.6));
		list.add(new Employee(1007,"bunny","associate consultant",7.6));
		list.add(new Employee(1008,"abhi","manager",15.6));
		list.add(new Employee(1009,"kittu","senior software",5.6));
		list.add(new Employee(1010,"ramu","associate consultant",9.2));
		list.add(new Employee(1011,"latha","consultant",7.8));
		list.add(new Employee(1012,"supriya","manager",18.5));
		list.add(new Employee(1013,"usha","senior software",5.9));
		list.add(new Employee(1014,"sneha","senior software",6.6));
		list.add(new Employee(1015,"renu","software",4.6));
		list.add(new Employee(1016,"laxmi","senior software",7.6));
		list.add(new Employee(1017,"chinnari","senior software",6.6));
		list.add(new Employee(1018,"chintu","consultant",8.9));
		list.add(new Employee(1019,"shreya","senior software",5.2));
		list.add(new Employee(1020,"priya","manager",20.8));
		
		System.out.println("======================================");
		//To print list of elements
		list.forEach(x -> System.out.println(x));
		
		
		System.out.println("======================================");
		//To print employee Ids from list
		list.stream().map(x -> x.empId).forEach(x -> System.out.println(x));
		
		
		System.out.println("======================================");
		//To get the employee record whose sal is more than 6
		list.stream().filter(x -> x.salary>6).forEach(x->System.out.println(x));
		
		
		System.out.println("======================================");
		//To get the employee name whose sal is more than 6
		list.stream().filter(x -> x.salary>6).map(x -> x.empName).forEach(x -> System.out.println(x));

		
		System.out.println("======================================");
		//To print ascending order of employee names
		list.stream().map(x -> x.empName).sorted().forEach(x -> System.out.println(x));
		
		
		System.out.println("======================================");
		//To print descending order of employee names
		list.stream().map(x -> x.empName).sorted(Collections.reverseOrder()).forEach(x -> System.out.println(x));
		
		
		System.out.println("======================================");
		//To get names of employee whose designation is manager
		list.stream().filter(x -> x.designation=="manager").map(x -> x.empName).forEach(x -> System.out.println(x));
		
		
		System.out.println("======================================");
		//search with id
		list.stream().filter(x -> x.empId==1008).forEach(x -> System.out.println(x));
		
		
		System.out.println("======================================");
		//To get name of employee with given designation and salary
		list.stream().filter(x -> x.designation=="manager" && x.salary>18).map(x -> x.empName).forEach(x -> System.out.println(x));
	
		
	}

}
