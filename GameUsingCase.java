package pr1;

public class stonepaprscisr {
	public static void main(String[] args) {
		String player = "paper";
		String computer = "scissors";

		switch(player) {
		    case "rock":
		        if(computer.equals("scissors"))
		            System.out.println("Player wins");
		        else if(computer.equals("rock"))
		            System.out.println("Tie");
		        else
		            System.out.println("Computer wins");
		        break;
		    case "scissors":
		        if(computer.equals("paper"))
		            System.out.println("Player wins");
		        else if(computer.equals("scissors"))
		System.out.println("Tie");
		        else
		            System.out.println("Computer wins");
		        break;
		    case "paper":
		        if(computer.equals("rock"))
		            System.out.println("Player wins");
		        else if(computer.equals("paper"))
		            System.out.println("Tie");
		        else
		            System.out.println("Computer wins");
		        break;
		    default:
		        System.out.println("Invalid input");
		}
	}

}
