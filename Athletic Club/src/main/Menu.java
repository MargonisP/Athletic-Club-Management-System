package main;
//Panagiotis Georgios Margonis 
//arithmos mhtrwou:2011030121

import tuc.ece.cs111.util.tuc.ece.cs111.util.StandardInputRead;
import Athlete.FootballPlayer;
import Athlete.BasketballPlayer;
import Coach.Coach;
import Athlete.Runner;
public class Menu {
	
	
	private Club club;	
	
	public Menu() {
		
		ShowMenu();
	}
	
	
	public void ShowMenu() {
		//dhmiougw ena antikimeno sir typou standardinputread.
		StandardInputRead sir = new StandardInputRead();
		//dhlwnw mia metablhth int me onoma choice. Thn arxikopoiw se 0.
		int choice = 0;	
		
		
		while (choice!=8)
		{
			//emfanizoume to parakatw keimeno.
			System.out.println("Please insert the number of action you wanna do:");
			System.out.println("1. Initialize Club");
			System.out.println("2. Print Club's Information");
			System.out.println("3. Print all Stuff");
			System.out.println("4. Add a New Employee");
			System.out.println("5. Delete an Employee");
			System.out.println("6. Find an Employee");
			System.out.println("7. Print Specific category of employees");
			System.out.println("8. Exit the program");
			
		
			choice = sir.readPositiveInt("Enter choice");
			
			if (choice == 8 )
				return;
			if (club==null && choice!=1)
			{
				System.out.println("Please insert a club first");
				continue;	
			}
			
			
			//epilogeas switch me orisma to choice.
			switch(choice){
			//ean to choice ginei iso me ena tote.
			case 1:
				String ClubName = sir.readString("Insert Club Name");
				String Town= sir.readString("Insert Town");
				
				int FoundationYear= sir.readPositiveInt("Insert YEAR");
				
				
				this.club = new Club(ClubName,Town,FoundationYear);
				break;
			case 2:
				System.out.println(club.getName());
				System.out.println(club.getCity());
				System.out.println(club.getYearFounded());
				break;
			case 3:
				club.printAll();
				break;
			case 4:
				System.out.println("New employee. If you want to cancel the add of the employee insert -1");
				String employeeName = sir.readString("Enter the employee's Name");
				String exit = "-1";
				if (employeeName.equals(exit))
						break;
				String employeeSurname = sir.readString("Enter the employee's Surname");
				int birthyear = sir.readPositiveInt("enter the birth year");
				String sport =  sir.readString("Enter the sport");
				System.out.println("Employee's Category.");
				System.out.printf("\n");
				System.out.println("Athletes");
				System.out.println("--------------------");
				System.out.println("1) FootballPlayer");
				System.out.println("2) BasketballPlayer");
				System.out.println("3) Runner");
				System.out.println("---------------------");
				System.out.println("4) coach");
			
				int sel = sir.readPositiveInt("Enter the number of the category your employee is");
				if (sel==1)
				{
					
					
					String pos= sir.readString("Enter the position");
					float heigt = sir.readPositiveFloat("enter the height");
					int jnumber = sir.readPositiveInt("enter the nymber of jersey");
					Employee e =new FootballPlayer(employeeName,employeeSurname,birthyear,sport,pos,heigt,jnumber);
						club.addEmployee(e);
					
				
				}
				else if (sel==2)
				{

					String pos= sir.readString("Enter the position");
					float heigt = sir.readPositiveFloat("enter the height");
					int jnumber = sir.readPositiveInt("enter the nymber of jersey");
					float APG = sir.readPositiveFloat("enter the APG");
					float PPG = sir.readPositiveFloat("enter the PPG");
					
					Employee e = new BasketballPlayer(employeeName,employeeSurname,birthyear,sport,pos,heigt,jnumber,APG,PPG);
					club.addEmployee(e);
				}
				else if (sel==3){
					int dist = sir.readPositiveInt("enter the distance");
					float pbest = sir.readPositiveFloat("enter the personal best");
					Employee e = new Runner(employeeName,employeeSurname,birthyear,sport,dist,pbest);
					club.addEmployee(e);
				}
				else if (sel==4)
				{
					String graduateschool = sir.readString("Insert the scool tha graduate");
					Employee e = new Coach(employeeName, employeeSurname,birthyear,sport, graduateschool);
					club.addEmployee(e);
				}
				
				break;
			case 5:
				System.out.println("If you want to cancel the removal of the employee insert -1");
				String employeeRemName = sir.readString("Enter the employee's Name");
				
				String employeeRemSurname = sir.readString("Enter the employee's Surname");
				
				club.removeEmployee(employeeRemName, employeeRemSurname);
				club.printAll();
				break;
			case 6:
				System.out.println("If you want to cancel the search of an employee insert -1");
				String employeeSearchName = sir.readString("Enter the employee's Name");
				
				String employeeSearchSurname = sir.readString("Enter the employee's Surname");
			
				club.searchEmployee(employeeSearchName, employeeSearchSurname);
				break;
			case 7:
				System.out.println("Employee's Category.");
				System.out.printf("\n");
				System.out.println("1)  Athletes");
				System.out.println("--------------------");
				System.out.println("2) FootballPlayer");
				System.out.println("3) BasketballPlayer");
				System.out.println("4) Runner");
				System.out.println("---------------------");
				System.out.println("5) coach");
			
				int employeeSearchCat= sir.readPositiveInt("Enter the number of the category you want to print.");
				switch (employeeSearchCat){
				case 1:
					System.out.println("FootballPlayers \n -----------------------");
					club.XclusiveSearch("Athlete.FootballPlayer");
					System.out.println("BasketballPlayers \n -----------------------");
					club.XclusiveSearch("Athlete.BasketballPlayer");
					System.out.println("Runners \n -----------------------");
					club.XclusiveSearch("Athlete.Runner");
					break;
				case 2:
					club.XclusiveSearch("Athlete.FootballPlayer");
					break;
				case 3:
					club.XclusiveSearch("Athlete.BasketballPlayer");
					break;
				case 4:
					club.XclusiveSearch("Athlete.Runner");
					break;
				case 5: 
					club.XclusiveSearch("Coach.coach");
				
					break;
				}
				break;
			default:
					break;
			}
		}
	}
	
	
	

}
