package Athlete;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121

public class FootballPlayer extends Athlete {
	
	private String position;
	private float height;
	private int JerseyNumber;
	
	
	public FootballPlayer(String Name,String Surname,int BirthYear,String Sport, String position,float height ,int JerseyNumber){
		super(Name,Surname,BirthYear,Sport);
		this.position = position;
		this.height=height;
		this.JerseyNumber=JerseyNumber;
		
	}
	
	public void print(){
		super.print();
		System.out.println("Position = " + this.position);
		System.out.println("Height = " + this.height);
		System.out.println("Jersey Number = " + this.JerseyNumber);
		
	}

}
