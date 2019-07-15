package Athlete;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121

import main.Employee;

	public abstract class Athlete  extends Employee {
		
		 
		public void print(){
			super.print();
			
		}

		public Athlete(String Name, String Surname,int BirthYear,String Sport ){
			super(Name,Surname,BirthYear,Sport);
		
		}

}
