package Athlete;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121

public class BasketballPlayer extends Athlete {
	
	private String position;
	private float height;
	private int JerseyNumber;
	private float AssistPerGame;
	private float PointsPerGame;
	
	
	public BasketballPlayer(String Name,String Surname,int BirthYear,String Sport, String position,float height ,int JerseyNumber, float AssistPerGame,float PointsPerGame){
		super(Name,Surname,BirthYear,Sport);
		this.position = position;
		this.height=height;
		this.JerseyNumber=JerseyNumber;
		this.AssistPerGame = AssistPerGame;
		this.PointsPerGame = PointsPerGame;
		
	}
	
	public void print(){
		super.print();
		System.out.println("Position = " + this.position);
		System.out.println("Height = " + this.height);
		System.out.println("Jersey Number = " + this.JerseyNumber);
		System.out.println("APG = " + this.AssistPerGame);
		System.out.println("PPG = " + this.PointsPerGame);
	}

	

}
