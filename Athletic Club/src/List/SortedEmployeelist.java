package List;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121

import main.Employee;
public class SortedEmployeelist extends Employeeslist{
	

	public Node insert(Employee employee){
		
	
		Node tmp=new Node (employee);
		Node n1=head,n2=head;
		while((n1!=null)&&(n1.getEmployee().less(employee))){
			n2=n1;n1=n1.getNext();}
		if(n1==head){
			tmp.setNext(n1);head=tmp;
			
		}
		else{
			n2.setNext(tmp);
			tmp.setNext(n1);
		}
		return head;
		}
}
	
	
	
	


