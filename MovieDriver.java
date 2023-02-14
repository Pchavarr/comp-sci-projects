import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) 
	{
		
		//scanner object
		Scanner input = new Scanner(System.in);
		// movie object
		Movie movie1 = new Movie();
		//variables
		String title, rating;
		int soldTickets;
		String response;
		//use a do while loop
		do 
		{
		System.out.println("Enter the name of a movie");
		title = input.nextLine();
		//set the title in the movie object
		movie1.setTitle(title);
		
		System.out.println("Enter the rating of the movie");
		rating = input.nextLine();
		//set the rating in the movie object
		movie1.setRating(rating);
		
		System.out.println("Enter the number of tickets sold for this movie");
		soldTickets = input.nextInt();
		//set the tickets sold in the movie object
		movie1.setSoldTickets(soldTickets);
		
		//print out movie info with toString method
		System.out.println(movie1.toString());
		
		System.out.println("Do you want to enter another (y or n)");
		//consume the new line
		input.nextLine();
		response= input.nextLine();
		//convert to lower case 
		response= response.toLowerCase();
		
		}
		while(response.equals("y"));
		
	
		System.out.println("Goodbye");

	}

}
