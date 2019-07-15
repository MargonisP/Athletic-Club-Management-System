package main;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121

public abstract class Employee extends Item{
	protected String Name;
	protected String Surname;
	protected int BirthYear;
	protected String Sport;
	
	public Employee(){
		
	}
	
	public Employee(String name, String surname,int year,String sport ){
		this.Name = name;
		this.Surname = surname;
		this.BirthYear = year;
		this.Sport = sport;
	}

	public void setName(String name){
		this.Name=name;
	}
	
	
	public void setSurname(String surname){
		this.Surname= surname;
	}
	

	public void setBirthYear(int year){
		this.BirthYear=year;
	}
	
	

	public void setSport(String sport){
		this.Sport=sport;
	}
	
	
	
	public String getName(){
		return this.Name;
	}
	
	public String getSurname(){
		return this.Surname;
	}
	
	

	public String getSport(){
		return this.Sport;
	}
	
	public int getBirthYear(){
		return this.BirthYear;
	}
	
	 public Object key()
	 {
	  return getSurname()+getName();
	 }
	 
	 
	 public boolean equals(Item o)
	 {
	  if ((Surname+Name).equals((String)o.key()))
	         {return true;}
	        return false;
	 }
	 
	 public boolean less(Item o){
	  if((Surname+Name).compareTo((String)o.key())<0)
	  {return true;}
	     return false; 
	 }
	 
	 
	
	
	public void print(){
		System.out.println("-----------------------");
		System.out.println(this.Surname + " " + this.Name );
		System.out.println(this.BirthYear + " " + this.Sport );
	}
}
