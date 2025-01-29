package com.Shiva.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDetails {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.00));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		System.out.println("Count Of Male and Female FEmployes From Orginization : " + genderCount(employeeList));
		System.out.println("List Of Department Names From Originazation : " + listOfDepNames(employeeList));
		System.out.println("Average Age Of Male And Female Employee From Orginization : "
				+ avgAgeOfMaleAndFemaleEmp(employeeList));
		System.out.println("Highest Paid Employee From Originazation : " + highestPaidEmp(employeeList));
		System.out
				.println("Employee Joining After Year 2015 From Originization : " + empJoiningAfter2014(employeeList));
		System.out.println("Number Of Employess In Originization : " + numberOfEmployeesInOrganization(employeeList));
		System.out
				.println("Average Salary In Each Department From Originization : " + avgSalaryOfEachDep(employeeList));
		/*
		 * System.out.println("Third Highest Salary From Originization : "+
		 * thirdHighestSalary(employeeList));
		 */
		System.out.println(
				"Third Highest Salary Details From Originization : " + thirdHighestSalaryDetails(employeeList));
		System.out.println(
				"Fourth Smallest Salary Details From Originization : " + fourthSmallestEmployeeDetails(employeeList));
		System.out.println(
				"Youngest Male Employee In Development Department : " + youngestMaleEmpInDevelopment(employeeList));
		System.out.println("Most Working Experience In Originization : " + mostWorkingExpInOrg(employeeList));
		System.out.println(
				"Summary and Average of All Employees In Originization : " + summaryOfAnEmployee(employeeList));
		System.out.println(
				"Male And Female Count In All Departments From Originization : " + maleAndFemaleCount(employeeList));
		System.out.println("Departments  From Originization : " + allDepartments(employeeList));
		System.out.println("All Departments Count From Originization : " + allDepartmentsCount(employeeList));
		System.out.println("Names Of All Departments From Originization : " + namesOfAllDepartments(employeeList));
		System.out.println("Sum Of Salaries of All Employees From Originization : "
				+ sumOfTotalSalaryOfOrganization(employeeList));
		System.out.println(
				"Average Salary of All Employee From Originization : " + avgSalaryOfOrganization(employeeList));
		separateAgeBelowAfter25(employeeList);
		System.out.println("Youngest Employee In Originization : " + youngerEmployeeInOrg(employeeList));
		/*
		 * List<Employee> sortedName = sortedEmployeesBasedOnName(employeeList);
		 * System.out.println("Sort Employees Based On Name : ");
		 * sortedName.forEach(System.out::println);
		 */
		System.out.println("Sort Employees Based On Name : " + sortedEmployeesBasedOnName(employeeList));
		/*
		 * List<Employee> sortedSalary = sortedEmployeedBasesOnSalary(employeeList);
		 * System.out.println("Sort Employees Based On Salary : ");
		 * sortedSalary.forEach(System.out::println);
		 */
		System.out.println("Sort Employees Based On Salary : " + sortedEmployeedBasesOnSalary(employeeList));
		System.out.println(
				"Top 3 Highest Paid Employees From Originization : " + topThreeHighestPaidEmployees(employeeList));

		System.out.println("Max salary Of Employee In Each Department : " + maxSalaryEmpOfEachDep(employeeList));
		System.out.println("Number Of Employees Aged 27 : " + countNumberOfEmpAge27(employeeList));
		System.out.println("Find Employee Details Named Gita : " + findEmpDetailsGitaName(employeeList));
		System.out.println("Increased Salary By 1.2% In Originization : " + increaseSalaryAllEmpInOrg(employeeList));
		/*
		 * List<Employee> increaseSalary = increaseSalaryAllEmpInOrg(employeeList);
		 * System.out.println("Increased Salary By 1.2% In Originization : ");
		 * increaseSalary.forEach(System.out::println);
		 */
		System.out.println("Increased Salary In Specific Department By 1.5% In Originization : "
				+ increaseSalaryInSpecificDep(employeeList));
		System.out.println("Average Salary Of Each Gender From Originization : "
				+ averageSalaryOfEachGenderInEmpList(employeeList));
		System.out.println("Maximum Employees In Departments : " + maxEmployeesInDep(employeeList));
		System.out.println("Employee Age Between 20 & 30 : " + employeesAgeBetween20And30(employeeList));
		System.out.println("Sort Employees Based on Development Role : " + sortEmpBasedOnDevlopmentRole(employeeList));
		System.out.println("Employees Based On Department : " + employeesBasedOnDep(employeeList));
		System.out.println("Number Of Employees Of Each Department : " + numOfEmpOfEachDep(employeeList));
		System.out.println("Minimun Salary Of Each Department : " + minSalaryEmpInEachDep(employeeList));
		System.out.println("Sum Of Age Of All Genders From Department : " + sumOfAge(employeeList));
		System.out.println("Average Of Age Of All Genders From Department : " + avgOfAge(employeeList));
		System.out.println("Average Salary Of All Departments : " + avgOfDepBasedOnSalary(employeeList));
	}

	private static Map<String, Long> genderCount(List<Employee> employeeList) {
		Map<String, Long> countOfMaleFemaleEmpList = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		return countOfMaleFemaleEmpList;

	}

	private static List<String> listOfDepNames(List<Employee> employeeList) {
		List<String> departmentNames = employeeList.stream().map(Employee::getDepartment).distinct()
				.collect(Collectors.toList());
		return departmentNames;
	}

	private static Map<String, Double> avgAgeOfMaleAndFemaleEmp(List<Employee> employeeList) {
		Map<String, Double> avgMaleFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		return avgMaleFemale;
	}

	private static Employee highestPaidEmp(List<Employee> employeeList) {
		Employee employee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
				.get();
		return employee;

	}

	private static List<String> empJoiningAfter2014(List<Employee> employeeList) {
		List<String> empJoining = employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2014)
				.map(Employee::getName).collect(Collectors.toList());
		return empJoining;
	}

	private static long numberOfEmployeesInOrganization(List<Employee> employeeList) {
		long numOfEmp = employeeList.stream().count();
		return numOfEmp;
	}

	private static Map<String, Double> avgSalaryOfEachDep(List<Employee> employeeList) {
		Map<String, Double> avgSalaryOfDep = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		return avgSalaryOfDep;
	}

	/*
	 * private static Double thirdHighestSalary(List<Employee> employeeList) {
	 * Double thirdHighest =
	 * employeeList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder
	 * ()).skip(2) .findFirst().get(); return thirdHighest; }
	 */

	private static Employee thirdHighestSalaryDetails(List<Employee> employeeList) {
		Employee thirdHighest = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(2).findFirst().get();
		return thirdHighest;
	}

	private static Employee fourthSmallestEmployeeDetails(List<Employee> employeeList) {
		Employee fourthSmallest = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(3)
				.findFirst().get();
		return fourthSmallest;
	}

	private static Employee youngestMaleEmpInDevelopment(List<Employee> employeeList) {
		Employee youngestMaleEmp = employeeList.stream().filter(i -> i.getDepartment().equals("Development"))
				.min(Comparator.comparing(Employee::getAge)).get();
		return youngestMaleEmp;
	}

	private static Employee mostWorkingExpInOrg(List<Employee> employeeList) {
		Employee mostExp = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))).get();
		return mostExp;
	}

	private static DoubleSummaryStatistics summaryOfAnEmployee(List<Employee> employeeList) {
		DoubleSummaryStatistics summaryEmp = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		return summaryEmp;
	}

	private static Map<String, Long> maleAndFemaleCount(List<Employee> employeesList) {
		Map<String, Long> collect = employeesList.stream().filter(i -> i.getDepartment().equals("Sales"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		return collect;

	}

	private static List<String> allDepartments(List<Employee> employeelList) {
		List<String> allDep = employeelList.stream().map(Employee::getDepartment).distinct()
				.collect(Collectors.toList());
		return allDep;
	}

	private static Map<String, Long> allDepartmentsCount(List<Employee> employeeList) {
		Map<String, Long> allDepCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		return allDepCount;

	}

	private static Map<String, List<String>> namesOfAllDepartments(List<Employee> employeeList) {
		Map<String, List<String>> depNames = employeeList.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
		return depNames;
	}

	private static Double sumOfTotalSalaryOfOrganization(List<Employee> employeeList) {
		double sumOfSalary = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
		return sumOfSalary;
	}

	private static Double avgSalaryOfOrganization(List<Employee> employeeList) {
		Double avgSalary = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		return avgSalary;
	}

	private static void separateAgeBelowAfter25(List<Employee> employeeList) {

		Map<Boolean, List<Employee>> youngerEmp = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() <= 25, Collectors.toList()));

		List<Employee> youngerEmployees = youngerEmp.get(true);
		List<Employee> olderEmployees = youngerEmp.get(false);

		System.out.println("Employees younger or equal to 25:");
		youngerEmployees.forEach(e -> System.out.println(e.getName() + ", " + e.getAge() + ", " + e.getSalary()));

		System.out.println("\nEmployees older than 25:");
		olderEmployees.forEach(e -> System.out.println(e.getName() + ", " + e.getAge() + ", " + e.getSalary()));

		/*
		 * List<Employee> youngerEmployees = employeeList.stream().filter(e ->
		 * e.getAge() <= 25) .collect(Collectors.toList());
		 * 
		 * List<Employee> olderEmployees = employeeList.stream().filter(e -> e.getAge()
		 * > 25).collect(Collectors.toList());
		 * 
		 * System.out.println("Employees younger or equal to 25:");
		 * youngerEmployees.forEach(e -> System.out.println(e.getName() + ", " +
		 * e.getAge() + ", " + e.getSalary()));
		 * 
		 * System.out.println("\nEmployees older than 25:"); olderEmployees.forEach(e ->
		 * System.out.println(e.getName() + ", " + e.getAge() + ", " + e.getSalary()));
		 */

	}

	private static Employee youngerEmployeeInOrg(List<Employee> employeelList) {
		Employee youngerEmp = employeelList.stream().min(Comparator.comparing(Employee::getAge)).get();
		return youngerEmp;
	}

	private static List<Employee> sortedEmployeesBasedOnName(List<Employee> employeeList) {
		List<Employee> sortName = employeeList.stream().sorted(Comparator.comparing(Employee::getName)).distinct()
				.collect(Collectors.toList());
		return sortName;
	}

	private static List<Employee> sortedEmployeedBasesOnSalary(List<Employee> employeeList) {
		List<Employee> sortSalary = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		return sortSalary;
	}

	private static List<Employee> topThreeHighestPaidEmployees(List<Employee> employeeList) {
		List<Employee> topThreeHighestPaidEmp = employeeList.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());
		return topThreeHighestPaidEmp;
	}

	private static Map<String, Optional<Employee>> maxSalaryEmpOfEachDep(List<Employee> employeeList) {
		Map<String, Optional<Employee>> maxSalaryInEachDep = employeeList.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		return maxSalaryInEachDep;
	}

	private static Long countNumberOfEmpAge27(List<Employee> employeeList) {
		long empAge27 = employeeList.stream().filter(i -> i.getAge() == 27).count();
		return empAge27;
	}

	private static Employee findEmpDetailsGitaName(List<Employee> employeeList) {
		Employee employee = employeeList.stream().filter(i -> i.getName().equals("Gita")).findAny().get();
		return employee;
	}

	private static List<Employee> increaseSalaryAllEmpInOrg(List<Employee> employeeList) {
		List<Employee> increasedSalary = employeeList.stream().map(e -> {
			e.setSalary(e.getSalary() * 1.2);
			return e;
		}).collect(Collectors.toList());
		return increasedSalary;
	}

	private static List<Employee> increaseSalaryInSpecificDep(List<Employee> employeeList) {
		List<Employee> increaseSalaryByDep = employeeList.stream().filter(d -> d.getDepartment().equals("Development"))
				.map(i -> {
					i.setSalary(i.getSalary() * 1.5);
					return i;
				}).collect(Collectors.toList());
		return increaseSalaryByDep;

	}

	private static Map<String, Double> averageSalaryOfEachGenderInEmpList(List<Employee> employeeList) {
		Map<String, Double> avgSalaryGender = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		return avgSalaryGender;
	}

	private static Entry<String, Long> maxEmployeesInDep(List<Employee> employeeList) {
		Entry<String, Long> maxEmp = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get();
		return maxEmp;
	}

	private static List<String> employeesAgeBetween20And30(List<Employee> employeeliList) {
		List<String> empAgeBtw = employeeliList.stream().filter(emp -> emp.getAge() >= 20 && emp.getAge() <= 30)
				.map(Employee::getName).collect(Collectors.toList());
		return empAgeBtw;
	}

	private static List<Employee> sortEmpBasedOnDevlopmentRole(List<Employee> employeeList) {
		List<Employee> sortEmpBasedDep = employeeList.stream().filter(e -> e.getDepartment().equals("Development"))
				.sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		return sortEmpBasedDep;
	}

	private static Map<String, List<Employee>> employeesBasedOnDep(List<Employee> employeeList) {
		Map<String, List<Employee>> empBasedDep = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		return empBasedDep;
	}

	private static Map<String, Long> numOfEmpOfEachDep(List<Employee> employeeList) {
		Map<String, Long> numOfEmp = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		return numOfEmp;
	}

	private static Map<String, Optional<Employee>> minSalaryEmpInEachDep(List<Employee> employeelList) {
		Map<String, Optional<Employee>> minSalayDep = employeelList.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
		return minSalayDep;
	}

	private static Map<String, Integer> sumOfAge(List<Employee> employeeList) {
		Map<String, Integer> sumAge = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.summingInt(Employee::getAge)));
		return sumAge;
	}

	private static Map<String, Double> avgOfAge(List<Employee> employeelList) {
		Map<String, Double> avgAge = employeelList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		return avgAge;
	}

	private static Map<String, Double> avgOfDepBasedOnSalary(List<Employee> employeeList) {
		Map<String, Double> avgDepSalary = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		return avgDepSalary;
	}
}
