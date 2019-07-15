package List;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121

import main.Employee;

public class Employeeslist {

	protected Node head;
	private Node tmp;
	protected int length;
	
	
	public Employeeslist(){
		this.head=null;
		length=0;
	}
	
	public void printAll(){
		tmp=head;
		while(this.tmp!=null){
			Employee e=tmp.getEmployee();
			e.print();
			tmp=tmp.getNext();
		}
	}
	
	
	
	public boolean isEmpty(){
		return head==null;
	}
	
	
	
	public Node insert(Employee employee){
		length++;
		head=new Node(employee,head);
		return head;
	}
	
	
		
	public Node delete(String name, String surname){;
	Node n1=head,n2=head;
		
		while((n1!=null)&&(!name.equals(n1.getEmployeeName())&&(!surname.equals(n1.getEmployeeLName())))){
			n2=n1;
			n1=n1.getNext();
		}
		
		if(n1!=null){
			length--;
		if(n2!=n1)
			n2.setNext(n1.getNext());
		else
			head=head.getNext();
		n1.setNext(null);
		}
		return head;
			
		}
	
	
	

	
	public Employee search( String name, String surname ){
		tmp=head;
		
		while (tmp!=null){
			
			if (tmp.getEmployeeName().equals(name)&&tmp.getEmployeeLName().equals(surname)){
				tmp.getEmployee().print();
				break;
			}
			tmp=tmp.getNext();
		}
		System.out.println("employee was not found");
		return null;
	
	}
	
	public void printObjs(String ClassName){
		
		 
		 for (tmp=head ; tmp!=null; tmp=tmp.getNext()){
			try{ 
			 if(Class.forName(ClassName).isInstance(tmp))
				 tmp.getEmployee().print();
			
			}
			catch(ClassNotFoundException e){
				
			}
				 
		 }
		
	}
	

	 public void exclusiveSearch (String SearchClass){
		 
		 for (tmp=head ; tmp!=null; tmp=tmp.getNext()){
			 if (tmp.getEmployee().getClass().getName().equalsIgnoreCase(SearchClass)){
				 tmp.getEmployee().print();
			 }
		 }
	 }	
	
	
	
	
	
	
	
}
