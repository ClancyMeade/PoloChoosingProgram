import java.util.Scanner; 

public class PoloChoosingProgram
	{

		public static void main(String[] args)
		
			{
				Scanner userInput = new Scanner (System.in); 
				String[] studentPolos = new String [5]; 
				studentPolos [0] = "White"; 
				studentPolos [1] = "Navy Blue"; 
				studentPolos [2] = "Light Blue"; 
				studentPolos [3] = "Yellow"; 
				studentPolos [4] = "Grey"; 
				
				int poloNumber = (int)(Math.random()*5); 
				
				System.out.println("Hello, welcome to the polo machine. Press enter for your polo choices");
				
				String enterOne = userInput.nextLine(); 
				
				for (String s : studentPolos)
					{ 
						System.out.println(s);
						
					}
				
				System.out.println("\nPress enter for your polo color.");
				
				String enterTwo = userInput.nextLine(); 
				
				System.out.println("Today you should wear a " + studentPolos [poloNumber] + " polo.");
				
				//initial finished
			}

	}
