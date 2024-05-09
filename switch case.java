package pr1;

public class switchplayers {
	public static void main(String[] args) {
        String player="rock";
        String computer="scissor";
        
     switch(player)
		{
		case "scissor":
			System.out.println("tie");
			break;
			
		case "rock":
			if (computer=="scissor")
			System.out.println("player wins");
			
			else
			System.out.println("computer wins");
			break;
			
			default:
				System.out.println("no tie");
		}
	}

}
