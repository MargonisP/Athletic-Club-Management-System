package List;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121

import main.Employee;
public class Node {
	
	private Employee employee;
	private Node next;
	
	public   Node(){
		this.employee = null;
		this.next = null;
	}
	
	public Node(Employee employee){
		this.employee = employee;
		this.next = null;
	}
	
	public Node(Employee employee, Node next){
		this.employee = employee;
		this.next = next;
	}
	
	public void setEmployee( Employee employee ){
		this.employee = employee;
	}
	
	public Employee getEmployee(){
		return this.employee;
	}
	
	public String getEmployeeName(){
		return this.employee.getName();
	}
	

	public String getEmployeeLName(){
		return this.employee.getSurname();
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public Node getNext(){
		return this.next;
	}
	

}
