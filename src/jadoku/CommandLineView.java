package jadoku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLineView implements View {
	private Board board;
	private String command;
	private Model model;
	
	
	public void setModel(Model model) {
		this.model = model;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public void destroy() {
		//nothing to do here
	}

	public void update() {
		System.out.println(" ------------+-----------+------------");
		for(int j = 0; j < 3; j++){
			for(int j2 = 0; j2 < 3; j2++){
				for(int i = 0; i < 3; i++){
					System.out.print(" | ");
					for(int i2 = 0; i2 < 3; i2++){
						if(i2 != 0){
							System.out.print(" | ");
						}
						System.out.print(board.getTileAt(3*i+i2, 3*j+j2).getValue());
					}
				}
				System.out.println(" |");
			}
			System.out.println(" ------------+-----------+------------");
		}
		 
	}

	public boolean getInput(){
		System.out.print("Enter your command: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			this.command = br.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error.");
			return false;
		}

		return model.analyzeCommand(command);
	}

}
