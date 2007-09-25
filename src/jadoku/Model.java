package jadoku;

public class Model {
	private Board board;
	
	public void setBoard(Board board){
		this.board = board;
	}
	
	public boolean analyzeCommand(String command) {
		if(command.equalsIgnoreCase("die") || command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("quit") || command.equals("")){
			System.out.println("Exiting...");
			return false;
		}
		//allow setting tiles, of the format s##=#, where #1 is x, #2 is y, #3 is val.
		else if(command.length() == 5 && command.charAt(0) == 's'){
			int x = command.charAt(1)-48; //ascii '0' == 48
			int y = command.charAt(2)-48;
			int val = command.charAt(4)-48;
			System.out.println("x is "+x+" and y is "+y+" and val is "+val);

			try{
				board.setTile(x-1, y-1, val);				
			} catch(ArrayIndexOutOfBoundsException aoobe){
				System.out.println("Please enter locations between 1 and 9.");
			} catch(InvalidValueException ive){
				System.out.println("Please enter values between 1 and 9.");
			} catch(ImpossibleValueException ive){
				System.out.println("Sorry, "+val+" cannot go into this square.");
			} catch(Exception e){
				System.out.println("Sorry, I couldn't perform the set for some reason.");
			}
			
			return true;
		}
		else{
			System.out.println("I don't know what to do with the command '"+command+"'");		
			return true;
		}
	}
}
