package learning.test;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeApp {
	
	private List<Employee> filter(List<Employee> eList,Integer lowerBound,Integer upperBound){
		
//		List<Employee> filterLIst = new ArrayList<Employee>();
//		
//		for (Employee emp: eList) {
//			if(emp.getAge() >= lowerBound && emp.getAge() <= upperBound) {
//				filterLIst.add(emp);
//			}
//		}
		
		
		
		return eList.stream().filter(e -> (e.getAge() >= lowerBound && e.getAge() <= upperBound)).collect(Collectors.toList());
	}

	public static void main(String[] args) {


		
		System.out.println("1".getClass().toGenericString());
		
	}

}
