package jadoku;

public class CommandLineView implements View {
	private Board board;
	
	
	public Board create() {
		board = new Board();
		return board;
	}

	public void destroy() {
		//nothing to do here
	}

	public void update() {
		System.out.println(" -------------------------------------");
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
			System.out.println(" -------------------------------------");
		}
		 
	}

}
