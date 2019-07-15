package Coach;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121

import main.Employee;
public class Coach extends Employee{
	private String GraduateSchool;
	
	public Coach(String Name , String Surname, int BirthYear,String Sport,String GraduateSchool){
		super(Name,Surname,BirthYear,GraduateSchool);
		this.GraduateSchool=GraduateSchool;
	}
	
	public void print(){
		
		super.print();
		
		System.out.println("GraduateSchool =" + this.GraduateSchool);
		System.out.println("-----------------------");
	}

}
