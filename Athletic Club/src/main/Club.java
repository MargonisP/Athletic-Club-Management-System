package main;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121

import List.SortedEmployeelist;
import main.Employee;
public class Club {
	
	private String Name;
	private String City;
	private int YearFounded;
	
	
	private SortedEmployeelist employees = new SortedEmployeelist();
	
	public Club(String Name, String City,int YearFounded){	
		this.Name = Name;
		this.City = City;
		this.YearFounded = YearFounded;
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public String getCity() {
		return City;
	}

	public void setCity(String city) {
	     City = city;
	}
	
	
	public int getYearFounded(){
		return YearFounded;
		
	}
	
	public void setYearFounded(int yearfounded){
		YearFounded = yearfounded;
	}




	
	public void addEmployee(Employee e ){
		
		employees.insert(e);
	
	}
	
	public void removeEmployee(String name, String surname ){
		employees.delete(name, surname);
	}
	
	public Employee searchEmployee(String name, String surname ){
		return employees.search(name, surname);
	}

	public void printAll() {
		employees.printAll();
	}
	
	public void XclusiveSearch(String SearchClass){
		employees.exclusiveSearch(SearchClass);
	}
	
	

	public void eXclusiveSearch(String SearchClass){
		employees.printObjs(SearchClass);
	}
	
	
	
	public void PrintClub(){
		System.out.println("-----------------------");
		System.out.println(getName());
		
		System.out.println("-----------------------");
	}
	

}

	


