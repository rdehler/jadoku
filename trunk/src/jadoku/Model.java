package jadoku;

public class Model {
	private Board board;
	
	public void setBoard(Board board){
		this.board = board;
	}
	
	private void setBoardTile(int x, int y, int val){
		try{
			board.setTile(x, y, val);				
		} catch(ArrayIndexOutOfBoundsException aoobe){
			System.out.println("Please enter locations between 1 and 9.");
		} catch(InvalidValueException ive){
			System.out.println("Please enter values between 1 and 9.");
		} catch(ImpossibleValueException ive){
			System.out.println("Sorry, "+val+" cannot go into this square.");
		} catch(Exception e){
			System.out.println("Sorry, I couldn't perform the set for some reason.");
		}
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
			setBoardTile(x-1,y-1,val);
			return true;
		}
		//allow setting an entire row, of the format x([1-9]{1})([0-9]{9})
		//where the first # is the rownumber
		// the next 9 digits are the values to set, with the number '0' meaning not to change the value.
		else if(command.length() == 11 && command.charAt(0) == 'x'){
			int y = command.charAt(1)-48;
			for(int x = 0; x < 9; x++){
				int val = command.charAt(2+x)-48;
				if(val != 0){
					setBoardTile(x,y-1,val);
				}
			}
			return true;
		}
		//allow setting an entire row, of the format y([1-9]{1})([0-9]{9})
		//where the first # is the rownumber
		// the next 9 digits are the values to set, with the number '0' meaning not to change the value.
		else if(command.length() == 11 && command.charAt(0) == 'y'){
			int x = command.charAt(1)-48;
			for(int y = 0; y < 9; y++){
				int val = command.charAt(2+y)-48;
				if(val != 0){
					setBoardTile(x-1,y,val);
				}
			}
			return true;
		}
		//allow setting an entire block, of the format b([1-9]{1})([0-9]{9})
		//where the first # is the block number, block numbers arranged as follows
		//  123
		//  456
		//  789
		// the next 9 digits are the values to set, with the number '0' meaning not to change the value
		// @TODO do this :)
		else if(command.length() == 11 && command.charAt(0) == 'b'){
			int b = command.charAt(1)-48;
			
			return true;
		}
		else{
			System.out.println("I don't know what to do with the command '"+command+"'");		
			return true;
		}
	}
}
