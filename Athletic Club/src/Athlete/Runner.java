package Athlete;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121

public class Runner extends Athlete  {
	private int distance;
	private float PersonalBest;
	
	
	
	public Runner(String Name,String Surname,int BirthYear,String Sport,int distance,float PersonalBest){
		super(Name,Surname,BirthYear,Sport);
		this.distance=distance;
		this.PersonalBest=PersonalBest;
		
	}
	
	
	public void print(){
		super.print();
		System.out.println("distance = " + this.distance);
		System.out.println("PersonalBest = " + this.PersonalBest);

    }
}
