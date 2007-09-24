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
		else if(command.length() == 5 && command.charAt(0) == 's'){
			int x = command.charAt(1)-48;
			int y = command.charAt(2)-48;
			int val = command.charAt(4)-48;

			try{
				board.setTile(x, y, val);				
			} catch(ArrayIndexOutOfBoundsException aoobe){
				System.out.println("No Can Do, captain.");
			}
			
			return true;
		}
		else{
			System.out.println("I don't know what to do with the command '"+command+"'");		
			return true;
		}
	}
}
